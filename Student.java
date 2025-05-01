// Abstract class to represent a student
// Implements Comparable to sort students by their GPA
public abstract class Student implements Comparable<Student>{
    private String name;
    private int id;
    private double gpa;

//Constructor for Student class
//Initializes student Name, ID and GPA
    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
//Getter method to get student's name and return it
    public String getName(){
        return name;
    }

//Getter method to get student's ID and return it
    public int getId(){
        return id;
    }

//Getter method to get student's GPA and return it
    public double getGpa(){
        return gpa;
    }

//Setter method for student's name
//Updates student's name
    public void setName(String name){
        this.name = name;
    }

//Setter method for student's GPA
//Updates student's GPA
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

//Returns student's information in string format
    @Override
    public String toString(){
        return "ID: "+id+", Name: "+name+", GPA: "+gpa;
    }

//Compares students based on their GPA
//Parameter represents another student
//Used for sorting students by their GPA
    @Override
    public int compareTo(Student other){
        return Double.compare(this.gpa,other.gpa);
    }
//Checks equality based on student's ID
//Return true is ID's match else, return false;
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        Student student = (Student) obj;
        return this.id == student.id;
    }


}

