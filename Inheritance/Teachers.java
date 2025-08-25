public class Teachers extends Person {
    String qualification;
    @Override
    void display(){
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The qualification is: " + qualification);
    }
}
