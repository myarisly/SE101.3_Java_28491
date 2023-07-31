import com.company.Lecturer;
import com.company.Student;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("John Doe", 1001, "Computer Science");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Course: " + student.getCourse());

        // Creating a Lecturer object
        Lecturer lecturer = new Lecturer("Jane Smith", 2001, "Mathematics");
        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}