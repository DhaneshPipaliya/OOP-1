import java.util.Scanner;
public class ArrangeDSE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3 ) //for n1
        {
            if(n2>n3){
                System.out.println(n1+"\t"+n2+"\t"+n3);
            }
            else {
                System.out.println(n1+"\t"+n3+"\t"+n2);
            }
        } else if (n2>n1 && n2>n3) { //for n2
            if(n1>n3){
                System.out.println(n2+"\t"+n1+"\t"+n3);
            }
            else {
                System.out.println(n2+"\t"+n3+"\t"+n1);
            }
        } else { //for n3
            if (n1 > n2) {
                System.out.println(n3 + "\t" + n1 + "\t" + n2);
            } else {
                System.out.println(n3 + "\t" + n2 + "\t" + n1);
            }
        }
    }
}
