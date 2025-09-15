import java.util.Scanner;

interface calculator{
    // by default public and abstract
    void add();
    void sub();
}

class MyClass1 implements calculator{
    @Override
    public void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    @Override
    public void sub(){
        int a=10;
        int b=20;
        int c=a-b;
        System.out.println(c);
    }
}

class MyClass2 implements calculator{
    @Override
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
        sc.close();
    }

    @Override
    public void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        int c = a-b;
        System.out.println(c);
        sc.close();
    }
}

// Interface as a reference 
class Math{
    void permit(calculator r){
        r.add();
        r.sub();
    }
}
public class MyClass {
    public static void main(String[] args) {
       MyClass1 mc1 = new MyClass1();
       Math m = new Math();
       m.permit(mc1);
    }
}
