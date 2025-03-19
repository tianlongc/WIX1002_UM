/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
// https://www.airnow.gov/international/us-embassies-and-consulates/

import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Loading data from AQI sites...");
        Mon_Site[] sites = readDataFromDirectory("AQI");
        System.out.println("Printing AQI sites summary...");
        printSites(sites);
        System.out.println("Generating AQI sites report...");
        generateStatistics(sites); 
    }
    
    public static Mon_Site[] readDataFromDirectory(String directory_path){
        // Create a File object for the directory
        File folder = new File(directory_path);
        
        // List all files in the directory
        File[] listOfFiles = folder.listFiles();
        
        // Use listOfFiles.length to obtain the length of array
        Mon_Site[] sites = new Mon_Site[listOfFiles.length];
        
        if (listOfFiles != null) {
            int index = 0;
            
            for (File file: listOfFiles) {
                if (file.isFile()){
                    try{
                        BufferedReader inputStream = new BufferedReader(new FileReader(file));
                        
                        // Read table header
                        String line = inputStream.readLine();
                        
                        // Assume we dont know which index is the attributes we wanted:
                        String[] headers = line.split(",");
                        int dateIndex = -1;
                        int nowCastIndex = -1;
                        int aqiIndex = -1;
                        int aqiCategoryIndex = -1;
                        int qcNameIndex = -1;
                        int siteIndex = -1;
                        int yearIndex = -1;
                            
                        for (int i = 0; i < headers.length; i++) {
                            if (headers[i].equals("Date (LT)")) {
                                dateIndex = i;
                            }else if (headers[i].equals("NowCast Conc.")){
                                nowCastIndex = i;
                            }else if (headers[i].equals("AQI")){
                                aqiIndex = i;
                            }else if (headers[i].equals("AQI Category")){
                                aqiCategoryIndex = i;
                            }else if (headers[i].equals("QC Name")){
                                qcNameIndex = i;
                            }else if (headers[i].equals("Site")){
                                siteIndex = i;
                            }else if (headers[i].equals("Year")){
                                yearIndex = i;
                            }
                        }
                        
                        int recordCount = 0;
                        // Get the length of records
                        while ((line = inputStream.readLine()) != null) {
                            recordCount++;
                        }
                        
                        // re-read the file
                        inputStream = new BufferedReader(new FileReader(file));
                        
                        // Skip table header
                        inputStream.readLine();
                        
                        String siteName = "";
                        String year = "";
                        // Only interested in 5 attributes mentioned in question
                        String[][] records = new String[recordCount][5];
                        
                        int i = 0;
                        // Read file content
                        while ((line = inputStream.readLine()) != null) {
                            String[] columns = line.split(",");
                            // These two columns are constants
                            siteName = columns[siteIndex];
                            year = columns[yearIndex];
                            
                            // We can actually find the index by looking into the .csv files
                            // if you hardcode the array index then you can remove line 46 to 72 change line 44 into inputStream.readLine() to skip table header
                            records[i][0] = columns[dateIndex];         // 2th index
                            records[i][1] = columns[nowCastIndex];      // 7th index
                            records[i][2] = columns[aqiIndex];          // 8th index
                            records[i][3] = columns[aqiCategoryIndex];  // 9th index
                            records[i][4] = columns[qcNameIndex];       // 13th index
                            i++;
                        }
                        
                        sites[index] = new Mon_Site(siteName, year, recordCount, records);
                        index++;
                        
                        inputStream.close();
                    }catch(FileNotFoundException e){
                        System.out.println("File not found: " + e.getMessage());
                    }catch(IOException e){
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                }
            }
            
        }else{
            System.out.println("The directory is empty or not a directory");
        }
        
        return sites;
    }
    
    public static void printSites(Mon_Site[] sites){
        // QC Name statistic use array to store each values for each sites
        int[] valid = new int[sites.length];
        int[] invalid = new int[sites.length];
        int[] missing = new int[sites.length];
        int[] suspect = new int[sites.length];
        
        for (int i = 0; i < sites.length; i++) {
            String[][] records = sites[i].getRecords();
            for (String[] record: records) {
                // 4th index is QC Name
                if (record[4].equals("Valid")) {
                    valid[i]++;
                }else if(record[4].equals("Invalid")){
                    invalid[i]++;
                }else if(record[4].equals("Missing")){
                    missing[i]++;
                }else if(record[4].equals("Suspect")){
                    suspect[i]++;
                }
            }
        }

        // Table Header (Output Formatting)
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.printf("| %-21s| %-4s | %-7s | %6s | %-7s | %-7s | %-7s |\n", "Site", "Year", "#Record", "Valid", "Invalid", "Missing", "Suspect");
        System.out.println("+------------------------------------------------------------------------------+");
        for (int i = 0; i < sites.length; i++) {
            System.out.printf("| %-21s| %-4s | %6d  | %6d | %7d | %7d | %7d |\n", sites[i].getSiteName(), sites[i].getYear(), sites[i].getRecordCount(), valid[i], invalid[i], missing[i], suspect[i]);
        }
        System.out.println("+------------------------------------------------------------------------------+");
    }
    
    public static void generateStatistics(Mon_Site[] sites){
        for (Mon_Site site: sites) {
            String fileName = site.getSiteName() + "_" + site.getYear() + ".site";
            
            try{
                PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName + ".txt"));
                
                outputStream.println("Site : " + site.getSiteName());
                outputStream.println("Year : " + site.getYear());
                
                String[][] records = site.getRecords();
                
                int good = 0;
                int moderate = 0;
                int unhealthyGroup = 0;
                int unhealthy = 0;
                int veryUnhealthy = 0;
                int hazardous = 0;
                int worstAQI = Integer.MIN_VALUE, worstCount = 0;
                String worstAQIRecord = "";
                int bestAQI = Integer.MAX_VALUE, bestCount = 0;
                String bestAQIRecord = "";
                
                // AQI != N/A
                // AQI Category != N/A 
                // QC Name != Invalid && Missing && Suspect --> Find Valid
                // 2th index is AQI, 3th index is AQI Category, 4th index is QC Name
                for (String[] record: records) {
                    if (!(record[2].equals("N/A")) && !(record[3].equals("N/A")) && (record[4].equals("Valid"))) {
                        // AQI
                        if (record[3].equals("Good")) {
                            good++;
                        }else if (record[3].equals("Moderate")) {
                            moderate++;
                        }else if (record[3].equals("Unhealthy for Sensitive Groups")) {
                            unhealthyGroup++;
                        }else if (record[3].equals("Unhealthy")) {
                            unhealthy++;
                        }else if (record[3].equals("Very Unhealthy")) {
                            veryUnhealthy++;
                        }else if (record[3].equals("Hazardous")){
                            hazardous++;
                        }
                        
                        // 0th index is date
                        // Worst AQI
                        if (worstAQI < Integer.parseInt(record[2])) {
                            worstAQI = Integer.parseInt(record[2]);
                            worstAQIRecord = record[0];
                            worstCount = 1;
                        }else if (worstAQI == Integer.parseInt(record[2])){
                            worstAQIRecord += "," + record[0];
                            worstCount++;
                        }
                        
                        // Best AQI
                        if (bestAQI > Integer.parseInt(record[2])) {
                            bestAQI = Integer.parseInt(record[2]);
                            bestAQIRecord = record[0];
                            bestCount = 1;
                        }else if (bestAQI == Integer.parseInt(record[2])){
                            // From the sample output, you can see that each date is separated by ','
                            bestAQIRecord += "," + record[0];
                            bestCount++;
                        }
                    }
                }
                
                outputStream.println("AQI (Good) : " + good);
                outputStream.println("AQI (Moderate) : " + moderate);
                outputStream.println("AQI (Unhealthy for Sensitive Groups) : " + unhealthyGroup);
                outputStream.println("AQI (Unhealthy) : " + unhealthy);
                outputStream.println("AQI (Very Unhealthy) : " + veryUnhealthy);
                outputStream.println("AQI (Hazardous) : " + hazardous);
                outputStream.printf("Worst AQI : %d (recorded %d times)\n", worstAQI, worstCount);
                outputStream.println("Worst AQI Record: " + worstAQIRecord);
                outputStream.printf("Best AQI : %d (recorded %d times)\n", bestAQI, bestCount);
                outputStream.println("Best AQI Record: " + bestAQIRecord);
                
                outputStream.close();
            }catch(IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }finally{
                System.out.println("Successfully written to " + fileName);
            }
        }
    }
}