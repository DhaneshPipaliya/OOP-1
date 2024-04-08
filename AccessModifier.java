import java.util.Scanner;

class AccessModifier2 {
    private int a;
//    public int b=a;
    /*AccessModifier2(int a){
        System.out.println("value of a before assignment:"+this.a);
        this.a=a;
        System.out.println("value of a after assignment:"+this.a);
    }*/
    public void setA(){
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        increment();
        //return a;
    }
    private void increment(){
        a++;
        System.out.println("Value of a:"+a);
    }
}
public class AccessModifier {


    public static void main(String[] args) {
        AccessModifier2 ac=new AccessModifier2();
//        System.out.println(ac.a);
        /*System.out.println("value of b:"+ac.b);
        ac.b=1100;
        System.out.println("value of b:"+ac.b);*/
        ac.setA();
//        System.out.println("Value is:"+value);
        //System.out.println("Value is:"+ac.setA());
    }
}
