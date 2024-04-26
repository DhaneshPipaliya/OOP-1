import java.util.Scanner;
public class StringClass {
    public static void main(String[] args) {
        String s="";
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.substring(5));
        System.out.println(s.substring(1,5));
        System.out.println(s.contains("ne"));
        System.out.println(s.equals("dhanesh"));
        System.out.println(s.isEmpty());
        System.out.println(s.concat(" Hello"));
        System.out.println(s.replace("nesh","abc"));
        System.out.println(s.indexOf(5));
        System.out.println(s.indexOf(1,5));
        System.out.println(s.indexOf(""));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());


    }
}
