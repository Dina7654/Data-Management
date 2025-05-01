//Represents a graduate student, inherited from Student class
public class GradStudent extends Student{

    private String research;

//Constructor for GradStudent
//Initializes Name, ID, GPA and Research
    public GradStudent(String name, int id, double gpa, String research){
        super(name, id, gpa);
        this.research = research;
    }

//Getter method for student's research topic
//Returns the student's research topic
    public String getResearch(){
        return research;
    }

//Setter method for student's research topic
//Updates student's research topic
    public void setResearch(String research){
        this.research = research;
    }

//Updates student research topic
    public void updateResearch(String newResearch){
        this.research = newResearch;
        System.out.println("Research updated to: "+ newResearch);
    }

// Determines if the student has published their research based on their GPA
    public boolean hasPublishedResearch(){
        return getGpa() > 3.7;
    }

//Returns a string representation of a graduate student including theire research topic
    @Override
    public String toString(){
        return super.toString() + ", Research Topic: " + research;
    }

}
