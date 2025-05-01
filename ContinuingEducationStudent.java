//Represents a continuing education student inherited from Student class
public class ContinuingEducationStudent extends Student {

    private int coursesTaken;

//Constructor which initializes student's Name, ID, GPA, and number of courses taken
    public ContinuingEducationStudent(String name, int id, double gpa, int coursesTaken){
        super(name,id,gpa);
        this.coursesTaken = coursesTaken;
    }

//Getter method for number of courses taken
//Retuens the number of courses taken by the student
    public int getCoursesTaken(){
        return coursesTaken;
    }
//Increment the number of courses taken
    public void incrementCoursesTaken(){
        this.coursesTaken++;
    }

    //Determines if the student is a full-time student
    public boolean isFullTimeStudent(){
        return this.coursesTaken >=4;
    }

//Setter method for number of courses taken
//Updates the number of courses taken by the student
    public void setCoursesTaken(int coursesTaken){
        this.coursesTaken = coursesTaken;
    }

//Returns a string representation of the continuing education student
//Includes their name, id, gpa and number of courses taken
    @Override
    public String toString(){
        return super.toString()+ "Courses Taken: "+coursesTaken;
    }

}
