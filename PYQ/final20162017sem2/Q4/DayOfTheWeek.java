/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class DayOfTheWeek {
    private int h, q, m, y, J, K;
    
    public DayOfTheWeek(int q, int m, int y){
        this.q = q;
        this.m = m;
        this.y = y;
    }
    
    public boolean isValidDay(){
        // handles exception
        if (m < 1 || m > 12 || q < 1 || q > 31) {
            return false;
        }
        
        // February
        if (m == 2) {
            if (isLeapYear()) {
                return q <= 29;
            }else{
                return q <= 28;
            }
        }
        
        // Use your knuckles to figure out which months have 30/31 days. 
        // If the month lands on a knuckle (higher up), its 31 days (except February only)
        
        // 30 days: April June September November        
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return q <= 30;
        }
        
        // 31 days: January March May July August October December
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            return q <= 31;
        }
        
        return false;
    }
    
    public boolean isLeapYear(){
        return (y%4 == 0 && (y%100 != 0 || y%400 == 0));
    }
    
    public void displayDayOfTheWeek(){
        
        if(!isValidDay()){
            System.out.printf("%d/%d/%d is invalid input\n", q, m, y);
            return;
        }

        // month (3: March, 4: April, ... 12:December, January and February are counted as 13 and 14 of the previous year)
        int adjustedMonth = m; 
        int adjustedYear = y;
        
        if (m == 1 || m == 2){
            adjustedYear--; // previous year
            adjustedMonth += 12;
        }
        
        this.J = adjustedYear/100;
        this.K = adjustedYear%100;
        // Calculation via formula given
        this.h = (int)((this.q + Math.floor((13 * (adjustedMonth + 1))/5) + K + Math.floor(K/4) + Math.floor(J/4) + (5*J)) % 7);
        
        // 0: Saturday, 1: Sunday, 2: Monday ... 6:Friday
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        System.out.printf("%d/%d/%d is on %s\n", q, m, y, days[h]);
    }
    
}
