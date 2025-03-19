/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class OceanData {
    public static void main(String[] args) {
        String inputFile = "ocean_data.csv";
        DataBuoy [] data = new DataBuoy[25];
        float avg_water_temp;
        
        loadData(inputFile, data);
        showData(data);
        
        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);
        
        printMap(data, avg_water_temp);
    }
    
    public static void loadData(String inputFile, DataBuoy[] data){
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
            
            String line = "";
            int i = 0;
            
            while ((line = inputStream.readLine()) != null && i != 25) {
                String[] input = line.split(",");
                data[i] = new DataBuoy(input);
                i++;
            }
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void showData(DataBuoy[] data){
        System.out.println("Data read from buoy:");
        // Table Header
        System.out.printf("%-16s%-3s\t%-4s\t%-5s\t%-7s\n","buoy_id", "lat", "long", "air_t", "water_t");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    
    public static float calculateAvgWaterTemp(DataBuoy[] data){
        float sum = 0.0f;
        for (int i = 0; i < data.length; i++) {
            sum += data[i].getWaterTemperature();
        }
        return (sum/data.length);
    }
    
    public static void printMap(DataBuoy[] data, float avg_water_temp){
        System.out.println("\nHeat Map of water temperature");
        char[][] map = new char[21][21];
        map[10][10] = 'N'; // Null Island
        
        for (int i = 0; i < data.length; i++) {
            /*
            - Can try think back the random range logic taught by LWS
            - The `x` index is calculated by adding 10 to the longitude to shift the range from [-10, 10] to [0, 20].
            - The `y` index is calculated by subtracting the latitude from 10 to shift the range from [-10, 10] to [20, 0].
            */
            int x = data[i].getLongitude() + 10; // shifts from -10 to 10 to 0 to 20
            int y = 10 - data[i].getLatitude(); // shifts from -10 to 10 to 20 to 0
            float temp = data[i].getWaterTemperature();
            
            // y is row x is column in two dimensional array it is array[row][column]
            if (temp > avg_water_temp) {
                map[y][x] = 'H';
            }else if (temp < avg_water_temp){
                map[y][x] = 'C';
            }else{
                map[y][x] = 'A';
            }
        }
        
        // Map
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                // Check if the coordinate is null
                if (map[i][j] == '\0') {
                    map[i][j] = '~';
                }
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
    }
}
