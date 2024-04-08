import java.util.Scanner;
public class UnitCalculator {
    public static void main(String[] args) {
        double answer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in cm:");
        double value = sc.nextDouble();
        for(int i = 0;i<5;i++) {

            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //mm
                    answer = value * 10;
                    break;
                case 2:
                    //m
                    answer = value / 100;
                    break;
                case 3:
                    //feet
                    answer = value * 0.0328;
                    break;
                case 4:
                    //inch
                    answer = value * 0.3937;
                    break;
                default:
                    System.out.println("Enter other data");
                    break;
            }
            System.out.println("Answer is:" + answer);
        }

    }



}
