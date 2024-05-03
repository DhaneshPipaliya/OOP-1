import java.util.Scanner;
class OverAge extends Exception{
    OverAge(String msg){
        super(msg);
    }
}
class UnderAge extends Exception{
    UnderAge(String msg){
        super(msg);
    }
}
public class Program22 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        try {
            if(age<18) {
                throw new UnderAge("You are underage");
            } else if (age>50) {
                throw new OverAge("You are too Young");
            }
            else {
                System.out.println("Thanks for Registration");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
