import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b,ch;
        float ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i = 0;i<5;i++) {
            System.out.println("Enter choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ans = a + b;
                    break;
                case 2:
                    ans = a - b;
                    break;
                case 3:
                    ans = a * b;
                    break;
                case 4:
                    ans = a / b;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println(ans);
        }
        /*double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);
        System.out.println(z);*/
    }
}