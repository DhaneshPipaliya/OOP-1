public class StringBufferClass {
    public static void main(String[] args) {
        String s = "dhanesh";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.append(" Hello"));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(0));
        System.out.println(sb.delete(1,3));
        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.insert(5,"abc"));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(1,5,"abc"));
    }
}
