
class Student {
    String name;
    int marks;
    int rollNumber;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Laxmikant";
        s1.marks = 85;
        s1.rollNumber = 101;

        s1.displayDetails();
    }
}
