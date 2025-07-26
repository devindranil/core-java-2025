/*
 * 1. class in java - blueprint or template
 * 2. by default class is public in java
 * 3. class properties - members(variable),nested class,constructor,methods(staic and non static),Interface
 * 4.Instance var = inside the class but not inside any methods
 *                  non static var
 *                  related to obejct not class
 *                  if you want to call instance var then you need to create an object or reference of the class
 *                  instance var never initilaize with values
 *                  when initialize, when you create an object of the class
 *                  un-initialize = default values store
 * 5. class create means memory not occupied
 * 6. Student() is an Instance of Student Class
 * 7. Methods in java - a block of that particular code which perform a specific task.(similar to function)
 *    syntax - return type method_name (parameters){body of method}
 *    Types in java - 1-Pre-defined(Built in, ex-println()) 2- User-defined -> 2 types -> 2.1-based on return type and parameters 2.2-based on how methods usages in class body
 */

/*java input */
import java.util.Scanner; //import scanner class package 

/*class in java */
class Student {
    // class member (variable)
    /* Instance variable in java / Global varibale */
    String name; // string
    int age; // int

    /* class variable / static variable */
    /*
     * are declared with the static keyword
     * they are shared among all instance of the class
     * belong to the class but not the objects
     * to call or use staic variable you dont need to create any objects
     */
    static String instName = "YCH"; // static variable

    /* local variable in java */
    /*
     * derived inside a method / constructor / any block
     * only accessible with that method or block
     * created when the method start or call and destroyed when the methods end
     * no default value
     * you must initialize with value
     */
    void showDetails() {
        int marks = 90; // local variable
        System.out.println(marks);
    }

    /* based on ret type and para */
    /* 1.no ret and no para */
    /* based on how methods is used inside the class body */
    /*
     * all this methods are without static keyword - Instance method - Inside the
     * class body - access only using object reference - can access both instance
     * and static member
     */
    void sayHello() {
        System.out.println("Hello");
    }

    /* 2.no ret but para */
    void greet(String name) {
        System.out.println("Name: " + name); // name is local variable
    }

    /* 3.with ret but no para */
    int getRollNumber() {
        return 101;
    }

    /* 4. with ret and with para */
    int add(int a, int b) {
        return a + b;
    }

    /* Instance method */
    void display() {
        System.out.println("Name: " + name); // instance var access
        System.out.println("Insititute name: " + instName); // static var access
    }

    /* Static method */
    /*
     * belong to class only not object
     * access using only class name
     * only access static memebr directly
     */

    static int square(int x) {

        return x * x;

    }

    /* Constructor method */
    /*
     * special type of methods in java
     * name always same with class name
     * create only inside the class body
     * no return type but parameter yes
     * called when object initialize (new Students())
     * no need to called manually
     * used to initilaze an object
     * 
     * 
     */

    /*
     * Student(String name) {
     * System.out.println("Constructor called");
     * System.out.println("Namer is: " + name);
     * }
     */

    /* Method with same name - method overloading - part of polymorphism */
    void displayInfo() {
        System.out.println("No student info");
    }

    void displayInfo(String name) {
        System.out.println("Name is: " + name);
    }

    void displayInfo(String name, int age) {
        System.out.println("Name is: " + name);
        System.out.println("age is: " + age);
    }

    /* method overrding - inheritance */

}

public class Demo {
    int x; // instance variable

    public static void main(String[] args) {
        /* create object */
        /* syntax - classType ref variable = new constructor() */
        /* LHS = RHS(actual object created and memory allocated) */
        Student s1 = new Student();// this is a call to the constructor of student class
        s1.name = "Rahul";
        Student s2 = new Student();

        // System.out.println("Name is: " + s1.name);

        /* How to access class member */
        /* syntax objectRef.members */
        /*
         * s1.name = "Rahul";
         * s1.age = 22;
         * 
         * s2.name = "Koushik";
         * s2.age = 21;
         * 
         * System.out.println("Name of the student s1 is: " + s1.name);
         * System.out.println("Name of the student s1 is: " + s1.age);
         * 
         * System.out.println("Name of the student s2 is: " + s2.name);
         * System.out.println("Name of the student s2 is: " + s2.age);
         */

        /* sttaic variable access */
        // System.out.println("Insitute name is: " + Student.instName); // warning

        /* get local variable value */
        // s1.showDetails();

        /* call all the instance method */
        /*
         * s1.sayHello();
         * s1.greet("Welcome to YCH");
         * int res = s1.getRollNumber();
         * System.out.println(res);
         * int sum = s1.add(10, 20);
         * System.out.println(sum);
         * s1.display();
         */

        /* call the static method */
        // int res = Student.square(5);
        // System.out.println(res);

        // Student.square();

        // called overloading method
        /*
         * s1.displayInfo();
         * s1.displayInfo("Indranil");
         * s1.displayInfo("Rahul",23);
         */

        // create scanner class object
        /*
         * built in input stream object help us to read data from the keyboard
         * it's a part of system class java.lang package
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // sc.next(); // only read word no spaces Rahul sen
        String name = sc.nextLine();// read entire string with spaces

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter height in cm: ");
        float height = sc.nextFloat();

        System.out.println("Are you a student: ");
        boolean isStudent = sc.nextBoolean();

        /*print */
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("Student: " + isStudent);

        sc.close(); // optional

    }
}
