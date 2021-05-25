package htp.ch03;

import java.util.Scanner;

public class GradeBookTest {

    
    public static void main(String[] args) {
        
        // create GradeBook object
        GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java programming");
        GradeBook gradeBook2 = new GradeBook("CS101 Data Structures in Java");
        
        System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName());
        System.out.printf("gradeBook2 course name is: %s\n", gradeBook2.getCourseName());        
        
        
        /*
        // Create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        // Create a Gradebook object
        GradeBook myGradeBook = new GradeBook();
        
        // display initial value of courseName
        System.out.printf("Initial course name is: %s\n\n",
                           myGradeBook.getCourseName());
        
        // prompt for and input course name
        System.out.println("Please enter the course name:");
        String theName = input.nextLine(); // read a line of text
        myGradeBook.setCourseName(theName);
        System.out.println();
        
        // display welcome message after specifying course name
        myGradeBook.displayMessage();
        */
   }
    
}
