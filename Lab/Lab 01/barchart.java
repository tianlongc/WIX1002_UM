/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q4;

/**
 *
 * @author tianlongc
 */

// /**
// * Summary
// * 1. **Data Representation: ** We represent our data using arrays-one for sales amounts and one for month names.
// * This is a common way to organize related information in programming.
// * 2. **Looping through Data: ** We use a 'for' loop to iterate through each sales amount.
// * This is efficient for processing items in an array.
// * 3. **Drawing Shapes: ** This drawing is done using the Graphics object 'g', which provides methods
// * to draw shapes and text. Understanding how to use these methods is key to creating visual elements in Java.
// * 4. **Positioning:** By manipulating the x and y coordinates, we control where each bar and text is drawn.
// * This teaches about coordinate systems in graphics programming.
// * 5. **User Interface Management:** We set up a JFrame to host our drawing panel.
// * allowing us to create a windowed application. This is fundamental to building desktop applications.
// */

import javax.swing.*; // Importing the Swing library for creating graphical user interfaces
import java.awt.*; // Importing the AWT library for basic graphics and GUI components

public class barchart extends JPanel{ // Define the barchart class, which is a custom panel for drawing
        
        @Override
        protected void paintComponent(Graphics g){ // Override the paintComponent method for custom drawing
            super.paintComponent(g); // Call the superclass method to ensure proper painting and clearing of the panel
   
            // Sample data for sales amounts and corresponding month names
            int [] amounts = {2500, 1600, 2000, 2700, 3200, 800}; // Array of sales figures for each month
            String[] months = {"Jan 2016", "Feb 2016", "Mar 2016", "Apr 2016", "May 2016", "Jun 2016"}; // Array of month names
            
            // Variables for drawing the bars in the bar graph
            int barWidth = 50; // Set the width of each bar to 50 pixels
            int x = 50; // Initial x-coordinate for drawing the first bar
            
            // Logic for drawing each bar in the bar graph
            for (int i = 0; i < amounts.length; i++) { // Loop through each sales amount
                // Q1: Why do we divide the sales amounts by 10 to get the bar height?
                // A1 : We divide the sales amounts by 10 to make the bars fit within the panel height.
                // This scaling ensures that the tallest bar (3200) becomes 320 pixels high, which is manageable
                // within our panel's height of 400 pixels.
                int barHeight = amounts[i] / 10; // Calculate the height of the bar by scaling down
                
                g.setColor(Color.BLUE); // Set the color of the bar to blue for better visibility
                // Draw the bar as a filled rectangle
                // The parameters are (x position, y position, width, height)
                // The y position is calculated as 400 - barHeight to position the bar correctly on the panel.
                // We start drawing from the bottom of the panel, so we subtract the bar height from 400.
                g.fillRect(x, 400 - barHeight, barWidth, barHeight);
                
                g.setColor(Color.BLACK); // Set the color for the text labels to black for contrast
                // Q2: What does 'g.drawString(months[i], x + 10, 420)' do?
                // A2: This line draws the name of the month below each bar
                // 'x + 10' centres the label horizontally under the bar, and '420' positions it
                g.drawString(months[i], x + 10, 420); // Draw month names below the bars
                
                // Q3: What does 'g.drawString(String.valueOf(amounts[i]), x + 10, 400 - barHeight - 5)' do?
                // A3: This line draws the sales amount above each bar.
                // The 'x + 10' positions it horizontally, and '400 - barHeight - 5' ensures it's placed
                // just above the top of the bar. This provides clear information about the sales figures.
                g.drawString(String.valueOf(amounts[i]), x + 10, 400 - barHeight - 5); // Draw sales amounts above the bars
                
                // Q4: Why do we adjust 'x' with 'barWidth + 20'
                // A4: We adjust the x position to create space between the bars.
                // 'barWidth' gives the width of the current bar, and adding 20 ensures that there's
                // same gap between consecutive bars for better visual clarity and aesthetics
                x += barWidth + 20; // Move the x position to the right for the next bar
            }
            
    }
        
        public static void main(String[] args) { // Main method to run the program
            // Create a new JFrame to hold the JPanel
            JFrame frame = new JFrame("Total Sales of Product A"); // Title of the window
            barchart panel = new barchart(); // Create an instance of the barchart class, which contains our drawing logic
            frame.add(panel); // Add the panel to the frame
            frame.setSize(400, 500); // Set the size of the frame (width. height)
            
            // Q5: What happens when we close the JFrame?
            // A5: The line 'frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)' ensures that when
            // the user closes the window, the program will terminate properly. This is important for
           // freeing up system resources and stopping the application
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
            frame.setVisible(true);// Make the frame visible on the screen
        }
}
    

