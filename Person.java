public class Person {
    String name,gender;
    long phone;
    int age;
    // constructor chaining
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    Person(String name,int age, String gender){
        this(name,age); // constructor call
        this.gender = gender;
    }

    Person(String name, int age, String gender,long phone){
        this(name,age,gender);
        this.phone=phone;
    }

    void display1(){
        System.out.println("The name of the person is: " + name);
        System.out.println("The age of the person is: " + age);
        System.out.println("The gender of the person is: " + gender);
        System.out.println("The phone number of the person is: " + phone);
    }

    void display2(){
        this.display1();
        System.out.println("I am display method 2");
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Indranil Chakraborty", 26,"Male",9874296992L);
        Person p2 = new Person("Smriti Chakraborty", 21,"Female",1234567890L);

        p1.display2();
        p2.display2();
    }
}
