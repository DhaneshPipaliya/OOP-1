import java.util.Scanner;

public class MethodDemo {
    int maxNumber(int a,int b,int c) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();*/
        int max;
        if(a>b && a>c)
        {
            max = a;
            //return a;
        }
        else if(b>a && b>c)
        {
            max = b;
            //return b;
        }
        else
        {
            max = c;
            //return c;
        }
        return max;
        //System.out.println("Maximum number is:"+max);
    }

    public static void main(String[] args) {
        System.out.println("Program Initiated");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max;
        MethodDemo md = new MethodDemo();
        max = md.maxNumber(x,y,z);
        System.out.println("Maximum number is:"+max);
        System.out.println("Program Completed");
    }
}
