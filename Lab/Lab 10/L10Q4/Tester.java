/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L10Q4;

/**
 *
 * @author tianlongc
 */

// Date Format: dd-MM-yyyy HH:mm:ss

public class Tester {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        
        // Test booking appointments
        appointment.book("09-01-2025 14:00:00", "09-01-2025 16:00:00");
        appointment.book("09-01-2025 15:00:00", "25-01-2025 17:00:00");
        appointment.book("20-01-2025 00:00:00", "20-01-2025 23:59:59");
   
    }
}
