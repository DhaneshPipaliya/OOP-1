import  java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // get weight form the user
        System.out.println("Enter value of weight :");
        double weight = sc.nextDouble();
        // get height form the user
        System.out.println("Enter value of height:");
        double height = sc.nextDouble() * 0.3048;
        double BMI = weight / (height * height);
        System.out.println("BMI is:" +BMI+" kg/m");
    }
}
