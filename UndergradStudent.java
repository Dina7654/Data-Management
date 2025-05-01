//Represents an undergraduate student, inherited from Student class
public class UndergradStudent extends Student{
    private String major;

//Constructor for UndergradStudent
//Initializes Name, ID, GPA and Major
    public UndergradStudent(String name, int id, double gpa, String major){
        super(name, id, gpa);
        this.major = major;
    }

//Getter method for student's major
//Returns the student's major
    public String getMajor(){
        return major;
    }

//Setter method for student's major
//Updates the student's major
    public void setMajor(String major){
        this.major = major;
    }

//Changes student's major
    public void switchMajor(String newMajor){
        this.major = newMajor;
        System.out.println("Major switched to: "+ newMajor);
    }

//Determines if the student qualifies for an honors program
    public boolean isHonorsStudent(){
        return getGpa() > 3.5;
    }

//Returns a string representation of an undergraduate student
//Returns student information including their major
    @Override
    public String toString(){
        return super.toString()+ ", Major: "+major;
    }

}
