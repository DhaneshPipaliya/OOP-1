import java.util.*;
public class GCD {
    public int FindGCD(int a,int b){
        int result=1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                result=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD gcd = new GCD();
        System.out.print("Enter a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result= gcd.FindGCD(a,b);
        System.out.println("GCD is:"+result);
    }
}
