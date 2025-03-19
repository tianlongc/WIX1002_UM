/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
public class DataBuoy {
    private String buoy_id;
    private int latitude, longitude;
    private float air_temperature, water_temperature;
    
    public DataBuoy(String[] data){
        this.buoy_id = data[0];
        this.latitude = Integer.parseInt(data[1]);
        this.longitude = Integer.parseInt(data[2]);
        this.air_temperature = Float.parseFloat(data[3]);
        this.water_temperature = Float.parseFloat(data[4]);
    }
    
    // Coordinates
    public int getLatitude(){
        return this.latitude;
    }
    
    public int getLongitude(){
        return this.longitude;
    }
    
    public float getWaterTemperature(){
        return this.water_temperature;
    }
    
    public String toString(){
        return String.format("%-16s%-3d\t%-3d\t%-5.2f\t%-5.2f", this.buoy_id, this.latitude, this.longitude, this.air_temperature, this.water_temperature);
    }
}
