public class Program21 extends Exception {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[0]=10;
            arr[1]=20;
            arr[3]=40;
            arr[4]=50;
            //arr[5]=60;
            arr[2]=30/0;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Arithmetic exception occurs:"+ae);
        }
        catch (ArrayIndexOutOfBoundsException ab)
        {
            System.out.println("ArrayIndexOutOFBoundException occurs:"+ab);
        }
        catch (Exception e)
        {
            System.out.println("Excetion occurs:"+e);
        }
        finally {
            System.out.println("Execute");
        }
    }
}
