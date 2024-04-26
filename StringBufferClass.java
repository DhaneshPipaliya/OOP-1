import java.util.Scanner;

public class StringBufferClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb.append("Hello"));
        System.out.println(sb.length());
//        System.out.println(sb.capacity());
//        System.out.println(sb.charAt(0));
//        System.out.println(sb.delete(1,3));
//        System.out.println(sb.deleteCharAt(5));
//        System.out.println(sb.insert(5,"abc"));
//        System.out.println(sb.reverse());
//        System.out.println(sb.replace(1,5,"abc"));
    }
}
