// declaring the class in java
public class Teacher {
    /* Instance variable */
    /*
     * never assign with value at the time of declaration
     * it create memory when we create an instance of the class (object)
     * default value
     * to access instance variable you always need to create an object and using
     * that object only access possible
     * instance variable is a type of global variable
     */
    String name, gender; // null
    long phone; // 0

    // display method to show all the tecaher data
    void display() {
        System.out.println("Name of the Teacher is: " + name);
        System.out.println("Gender of the Teacher is: " + gender);
        System.out.println("Phone number  of the Teacher is: " + phone);
    }

    // set values
    // void setInfo(String n, String g, long ph) {
    //     name = n;
    //     gender = g;
    //     phone = ph;
    // }

    // default constructor
    // Teacher(){
    //     System.out.println("Default constructor");
    // }

    // Parameterized Constructor
    Teacher(String n, String g, long ph){
        name=n;
        gender=g;
        phone=ph;
    }
}
