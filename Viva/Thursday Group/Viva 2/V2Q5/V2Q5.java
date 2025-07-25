/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q5;

/**
 *
 * @author tianlongc
 */

// Learn multidimensional array 

public class V2Q5 {
    public static void main(String[] args) {
        
        String[] studentID = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006"};
        String[] studentName = {"John", "Cindy", "Alex", "Ali", "Rosli", "Roger"};
        int[] mark = {59, 62, 21, 36, 85, 74};
        
        String[][] studentInfo = getStudentInfo(studentID, studentName, mark);
        
        System.out.println("List of Students and their Marks: ");
        printStudentInfo(studentInfo);
        
        System.out.println("Student with highest marks: ");
        findStudentWithHighestMarks(studentInfo);
        
        double average = findAverage(mark);
        System.out.println("Average mark: " + average);
        
        System.out.println("\nStudents scoring below the average:");
        listStudentsBelowAverage(studentInfo, average);
    }
    
    public static String[][] getStudentInfo(String[] studentID, String[] studentName, int[] mark){
        String[][] studentInfo = new String[studentID.length][3];
        for (int i = 0; i < studentID.length; i++) {
            studentInfo[i][0] = studentID[i];
            studentInfo[i][1] = studentName[i];
            studentInfo[i][2] = String.valueOf(mark[i]);
        }
        return studentInfo;
    }
    
    public static void printStudentInfo(String[][] studentInfo){
        for (String[] student: studentInfo) {
            System.out.printf("%s - %-9s: %s\n", student[0], student[1], student[2]);
        }
        System.out.println("");
    }
    
    public static void findStudentWithHighestMarks(String[][] studentInfo){
        int max = -1;
        String studentName = "";
        int mark = 0;
        
        for(String[] student: studentInfo){
            mark = Integer.parseInt(student[2]);
            if (mark > max) {
                max = mark;
                studentName = student[1];
            }
        }
        
        System.out.printf("%s: %d\n\n", studentName, max);
    }
    
    public static double findAverage(int[] mark){
        double sum = 0.0;
        for (int m: mark) {
            sum += m;
        }
        return (sum / mark.length);
    }
    
    public static void listStudentsBelowAverage(String[][] studentInfo, double average){
        for (String[] student: studentInfo){
            if(Double.parseDouble(student[2]) < average){
                System.out.printf("%s: %s\n", student[1], student[2]);
            }
        }
    }
}
