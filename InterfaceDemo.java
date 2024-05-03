interface printable{
    void print();
}
public class InterfaceDemo implements printable {
    public void print(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        InterfaceDemo ID = new InterfaceDemo();
        ID.print();
    }
}
