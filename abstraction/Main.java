interface animal {
    void specialCap(); 
}

interface terrestrial{
    void liveIn();
}

interface aquatic {
    void liveIn();
}

class Frog implements animal,terrestrial,aquatic{

    @Override
    public void liveIn() {
        System.out.println("Frog live in water");
    }

    @Override
    public void specialCap() {
        System.out.println("Frog is an amphibian animal");
    }

}


public class Main {
    public static void main(String[] args) {
        Frog f1 = new Frog();
        f1.specialCap();
        f1.liveIn();
    }
}
