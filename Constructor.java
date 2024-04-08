public class Constructor {
    int a;
    String abc;
    public void print() {
        a+=10;
        System.out.println(a);
    }

    Constructor(int x) {
        a=x;
    }
    Constructor(){
    }
    Constructor(String a){
        abc=a;
        System.out.println("The string is:"+a);
    }
    public static void main(String[] args) {
        Constructor cd = new Constructor(20);
        Constructor cd1 = new Constructor(12);
        Constructor cd2 = new Constructor(23);
        System.out.println("String is="+cd.abc);
        System.out.println("String is="+cd1.abc);
        System.out.println("String is="+cd2.abc);
        cd.print();
        cd1.print();
        cd2.print();
        System.out.println(cd);
        System.out.println(cd1);
        System.out.println(cd2);


    }
}
