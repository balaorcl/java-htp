package htp.ch03;
// GradeBook class that contains a courseName instance variable
// and methods to set and get it's value

public class GradeBook {
    // its like a private field
    private String courseName;
    
    // constructor initializes courseName with String supplied as argument
    public GradeBook(String name){
        courseName = name;// initialize courseName
    }// end constructor
    
    // method to set the course name
    public void setCourseName( String name )
    {
        courseName = name;
    }
    
    // method to get the course name
    public String getCourseName()
    {
        return courseName;   
    }
    
    
    public void displayMessage(){
        System.out.printf("Welcome to the grade book for \n%s!\n", 
                          getCourseName());
    }
    
}
