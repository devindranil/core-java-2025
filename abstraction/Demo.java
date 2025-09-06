abstract class Bird {
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagles flies at great height in the sky");
    }
}

class SerphantEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("Hunt over the mountain and eat the snakes");
    }
}

class GoldenEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("Hunt over the sea and eat the fishes");
    }
}

public class Demo {

    public static void main(String[] args) {
        SerphantEagle sp = new SerphantEagle();
        sp.eat();
        sp.fly();
    }
}
