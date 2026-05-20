import java.util.*;

// Main application class
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("=== Java Application Demo ===\n");
        
        // Create and display a Student
        Student student = new Student("Alice Johnson", 20, "CS101");
        student.displayInfo();
        student.study();
        
        System.out.println();
        
        // Create and display a Teacher
        Teacher teacher = new Teacher("Mr. Smith", 35, "Computer Science");
        teacher.displayInfo();
        teacher.teach();
        
        System.out.println();
        
        // Use Calculator utility
        Calculator calc = new Calculator();
        System.out.println("Calculator Demo:");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
        
        System.out.println();
        
        // Use Collections
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        System.out.println("Fruits: " + fruits);
        Collections.sort(fruits);
        System.out.println("Sorted Fruits: " + fruits);
    }
}

// Person base class
class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Student class
class Student extends Person {
    private String studentId;
    
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
    
    public void study() {
        System.out.println(name + " is studying hard!");
    }
}

// Teacher class
class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
    
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}

// Calculator utility class
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        return b != 0 ? (double) a / b : 0;
    }
}
