interface Cars{
    void Brands();
}
interface Colour extends Cars{
    void Colour();
}
public class Program24 implements Colour{

    public void Colour() {
        System.out.println();
        System.out.println("Orange\nGreen\nRed");
    }
    public void Brands() {
        System.out.println("BMW\nAudi\nRR\nDC\nLexus");
    }

    public static void main(String[] args) {
        Program24 p24 = new Program24();
        p24.Brands();
        p24.Colour();
    }
}
