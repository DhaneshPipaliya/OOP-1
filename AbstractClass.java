abstract class Bike{
    abstract void run();
    void print(){
        System.out.println("Hi non abstract method");
    }
}
public class AbstractClass extends Bike {
    void run()
    {
        System.out.println("Running slowly");
}
    public static void main(String[] args) {
        Bike ab = new AbstractClass();
        ab.print();
        ab.run();
    }
}
