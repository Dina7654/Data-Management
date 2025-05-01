import java.util.ArrayList;
import java.util.Collections;
/* Problem: 
 * This program implements a studnet management system that allows us to store and sort student information.
 * It demonstrates OOP concepts such as inheritance, interface implementation, encapsulation and overriding.
 * 
 * The program includes different types of students:
 * 1. Undergraduate students: this represents students pursuing a bacelor's degree with a specific major
 * 2. Graduate students: this represents students pursuing a masters or doctoral degree with a research topic.
 * 3. Continuing Education students: this represents students enrolles in a non-degree program, tracking the number 
 * of courses taken.
 * 
 * The program uses an ArrayList to store student information and allows us to:
 * add students, display students information, sort students by their GPA, compare students based on their id
 * and update student's information such as their GPA, major, research topic or courses taken.
 * 
 * The program uses accessors and mutators to access and change student's information.
 * It also uses polymorphism by treating all students as instances of the abstract Student class.
 */
//This class tests the Student program
//It adds, sorts and updates student's information
public class ProjectOneTester {
    public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
    
// Add students to ArrayList
students.add(new UndergradStudent("Alice", 101, 3.8, "Computer Science"));
students.add(new GradStudent("Bob", 102, 3.9, "Machine Learning"));
students.add(new UndergradStudent("Charlie", 103, 3.7, "Mathematics"));
students.add(new GradStudent("David", 104, 3.5, "Artificial Intelligence"));
students.add(new ContinuingEducationStudent("Eve", 105, 3.6, 3));

// Display initial student records
System.out.println("Student Records:");
for (Student s : students) {
    System.out.println(s);
}

// Sort students by GPA and display
System.out.println("\nSorted by GPA:");
Collections.sort(students);
for (Student s : students) {
    System.out.println(s);
}

// Test equality method
System.out.println("\nTesting Equality:");
System.out.println("Alice equals Charlie? " + students.get(0).equals(students.get(2)));
System.out.println("Bob equals David? " + students.get(1).equals(students.get(3)));
System.out.println("Bob equals Bob? " + students.get(1).equals(students.get(1)));

// Test new functionalities
System.out.println("\nTesting Additional Functionalities:");

// Test incrementing courses taken for ContinuingEducationStudent
if (students.get(4) instanceof ContinuingEducationStudent) {
    ContinuingEducationStudent ceStudent = (ContinuingEducationStudent) students.get(4);
    System.out.println("Before incrementing courses: " + ceStudent.getCoursesTaken());
    ceStudent.incrementCoursesTaken();
    System.out.println("After incrementing courses: " + ceStudent.getCoursesTaken());
    System.out.println("Is full-time? " + ceStudent.isFullTimeStudent());
}

// Test updating research for GradStudent
if (students.get(1) instanceof GradStudent) {
    GradStudent gradStudent = (GradStudent) students.get(1);
    gradStudent.updateResearch("Neural Networks");
    System.out.println("New Research: " + gradStudent.getResearch());
    System.out.println("Has published research? " + gradStudent.hasPublishedResearch());
}

// Test switching major for UndergradStudent
if (students.get(2) instanceof UndergradStudent) {
    UndergradStudent undergradStudent = (UndergradStudent) students.get(2);
    System.out.println("Old Major: " + undergradStudent.getMajor());
    undergradStudent.switchMajor("Applied Mathematics");
    System.out.println("New Major: " + undergradStudent.getMajor());
    System.out.println("Is honors student? " + undergradStudent.isHonorsStudent());
}

// Updating Student Data
System.out.println("\nUpdating Student Data:");
students.get(0).setGpa(4.0); // Update Alice's GPA
students.get(3).setGpa(3.8); // Update David's GPA

// Display updated student records
System.out.println("\nUpdated Student Records:");
for (Student s : students) {
    System.out.println(s);
}
}
}