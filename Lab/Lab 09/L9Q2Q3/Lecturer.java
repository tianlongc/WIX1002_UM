/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q2Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tianlongc
 */
public class Lecturer extends PersonProfile {
    protected String[] courseName, courseCode;
    protected int[] semester, session, numberOfStudent;
    protected double[] creditHour;
    protected String fileName;
    
    public Lecturer(String name, char gender, String dob, String n){
        super(name,gender,dob);
        this.fileName = n;
        fileInput();
    }
    
    public void fileInput(){
        try{
            Scanner input = new Scanner(new FileInputStream(fileName));
            
            // Get the array size for variables
            int line = 0;
            while (input.hasNextLine()){
                int i = 0;
                while (i < 6){
                    input.nextLine();
                    i++;
                }
                line++;
            }
            input.close();
            
            // Initialise array with the specific size
            courseCode = new String[line];
            courseName = new String[line];
            semester = new int[line];
            session = new int[line];
            numberOfStudent = new int[line];
            creditHour = new double[line];
            
            // re-read the file again
            input = new Scanner(new FileInputStream(fileName));
            
            while (input.hasNextLine()){
                for (int i = 0; i < line; i++) {
                    courseCode[i] = input.nextLine();
                    courseName[i] = input.nextLine();
                    semester[i] = Integer.parseInt(input.nextLine());
                    session[i] = Integer.parseInt(input.nextLine());
                    creditHour[i] = Double.parseDouble(input.nextLine());
                    numberOfStudent[i] = Integer.parseInt(input.nextLine());
                }
            }
            input.close();
            
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("File input error");
        }
    }
    
    public double getCreditHour(int numberOfStudent, double creditHour){
        if (numberOfStudent >= 150){
            return (creditHour * 3);
        } else if (numberOfStudent >= 100){
            return (creditHour * 2);
        } else if (numberOfStudent >= 50){
            return (creditHour * 1.5);
        } else {
            return (creditHour * 1);
        }
    }
    
    @Override
    public void display(){
        System.out.println("=== Lecturer Profile===");
        super.display();
        System.out.printf("\n===Course Details===\n");
        // Table header
        System.out.printf("%-25s%-24s%-10s%-9s%-13s%-18s\n", "Course Code", "Course Name", "Semester", "Session", "Credit Hour", "Number Of Students");
        for (int i = 0; i < courseCode.length; i++) {
            System.out.printf(" %-12s%-38s%-11d%-7d%6.0f%15d\n", courseCode[i], courseName[i], semester[i], session[i], getCreditHour(numberOfStudent[i], creditHour[i]), numberOfStudent[i]);
        }
        System.out.println("");
    }
    
}
