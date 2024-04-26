public class ThisKeyword {
    int a;
    int b;
    ThisKeyword(){
        System.out.println("This is default constructor");
    }
    ThisKeyword(int a,int b){
        this();
        this.a=a;
        this.b=b;
        System.out.println("This is parameterized constructor");
        System.out.println(a+"\t"+b);
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(50,60);
    }
}
