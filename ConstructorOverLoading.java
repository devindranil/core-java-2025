public class ConstructorOverLoading {
    int a, b;
    double c;

    // without any parameter
    ConstructorOverLoading() {
        a = 10;
        b = 20;
        c = 25.0;
    }

    ConstructorOverLoading(int x, int y) {
        a = x;
        b = y;
        System.out.println(x + y);
    }

    ConstructorOverLoading(int x, double y) {
        a = x;
        c = y;
        System.out.println(x + y);
    }

    ConstructorOverLoading(int x, int y, double z) {
        a = x;
        b = y;
        c= z;
        System.out.println(x + y + c);
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        ConstructorOverLoading cn = new ConstructorOverLoading(15, 20,20.5);
        cn.display();
    }
}
