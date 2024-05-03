import java.io.IOException;
public class Program23 {
    public void divide(int a,int b)
    {
        if(b==0)
        {
            ArithmeticException ae = new ArithmeticException("top layer");
            ae.initCause(new IOException("cause"));
            throw ae;
        }
        else {
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) {
        Program23 p23 = new Program23();
        try {
            p23.divide(50,0);
        }
        catch (ArithmeticException ae){
            System.out.println("caught:"+ae);
            System.out.println("actual cause:"+ae.getCause());
        }
    }
}
