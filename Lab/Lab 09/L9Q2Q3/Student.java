/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q2Q3;

/**
 *
 * @author tianlongc
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Student extends PersonProfile {
    protected String[] courseName, courseCode;
    protected int[] semester, session, mark;
    protected String fileName;
    
    public Student(String name, char gender, String dob, String n){
        super(name, gender, dob);
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
                while (i < 5){
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
            mark = new int[line];
            
            // re-read the file again
            input = new Scanner(new FileInputStream(fileName));
            
            while (input.hasNextLine()){
                for (int i = 0; i < line; i++) {
                    courseCode[i] = input.nextLine();
                    courseName[i] = input.nextLine();
                    semester[i] = Integer.parseInt(input.nextLine());
                    session[i] = Integer.parseInt(input.nextLine());
                    mark[i] = Integer.parseInt(input.nextLine());
                }
            }
            input.close();
            
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("File input error");
        }
    }
    
    public String getGrade(double mark){
        if (mark >= 85){ 
            return "A"; 
        }
        else if (mark >= 75){
            return "A-";
        }
        else if (mark >= 70){
            return "B+";
        }
        else if (mark >= 65){
            return "B";
        }
        else if (mark >= 60){
            return "B-";
        }
        else if (mark >= 55){
            return "C+";
        }
        else if (mark >= 50){
            return "C";
        }
        else if (mark >= 45){
            return "D";
        }
        else if (mark >= 35){
            return "E";
        }
        else{
            return "F";
        }
    }
    @Override
    public void display(){
        System.out.println("=== Student Profile===");
        super.display();
        System.out.printf("\n===Course Details===\n");
        // Table header
        System.out.printf("%-25s%-24s%-10s%-9s%-6s%-8s\n", "Course Code", "Course Name", "Semester", "Session", "Mark", "Grade");
        for (int i = 0; i < courseCode.length; i++) {
            System.out.printf(" %-12s%-38s%-11d%-7d%-6d%-6s\n", courseCode[i], courseName[i], semester[i], session[i], mark[i], getGrade(mark[i]));
        }
        System.out.println("");
    }
}
