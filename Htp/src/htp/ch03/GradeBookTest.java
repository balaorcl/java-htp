package htp.ch03;

import java.util.Scanner;

public class GradeBookTest {
    public GradeBookTest() {
        super();
    }
    
    public static void main(String[] args) {
        
        // Create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        // Create a Gradebook object
        GradeBook myGradeBook = new GradeBook();
        
        // prompt for and inpur course name
        System.out.println("Please enter the course name:");
        String nameOfCourse = input.nextLine(); // read a line of text
        System.out.println();
        
        myGradeBook.displayMessage(nameOfCourse);
   }
    
}
