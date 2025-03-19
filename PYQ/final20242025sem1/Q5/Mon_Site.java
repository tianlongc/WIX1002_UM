/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Mon_Site {
    private String siteName;
    private String year;
    private int recordCount;
    private String[][] records;
    
    public Mon_Site(String siteName, String year, int recordCount, String[][] records){
        this.siteName = siteName;
        this.year = year;
        this.recordCount = recordCount;
        this.records = records;
    }
    
    // Accessor Methods (Getters)
    public String getSiteName(){
        return siteName;
    }
    
    public String getYear(){
        return year;
    }
    
    public int getRecordCount(){
        return recordCount;
    }
    
    public String[][] getRecords(){
        return records;
    }
}
