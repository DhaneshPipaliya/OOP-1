import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.Triangle");
            int ch = sc.nextInt();
            double area = 0.0;
            switch (ch) {
                case 1:
                    System.out.print("Enter radius:");
                    double radius = sc.nextDouble();
                    area = ac.Area(radius);
                    break;
                case 2:
                    System.out.print("Enter side:");
                    float side = sc.nextFloat();
                    area = ac.Area(side);
                    break;
                case 3:
                    System.out.print("Enter and length and width:");
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    area = ac.Area(length, width);
                    break;
                case 4:
                    System.out.print("Enter base and height:");
                    float base = sc.nextFloat();
                    float height = sc.nextFloat();
                    area = ac.Area(base, height) / 2;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if (ch!= 0) {
                System.out.println("The area is:" + area);
            }
    }
    public double Area(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public double Area(float side){
        return side * side;
    }
    public double Area(double length,double width){
        return length * width;
    }
    public double Area(float base,float height){
        return base * height;
    }
}