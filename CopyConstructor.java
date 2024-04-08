public class CopyConstructor {
    private int a,b;
    CopyConstructor(int a,int b){
        this.a=a;
        this.b=b;

    }
    CopyConstructor(CopyConstructor c){
        this.a=c.a;
        this.b=c.b;
    }
    public void show(){
        System.out.println("Values of a:"+a+" and b:"+b);
    }

    public static void main(String[] args) {
        CopyConstructor c1=new CopyConstructor(10,20);
        c1.show();
        CopyConstructor c2=new CopyConstructor(c1);
        c2.show();
        CopyConstructor c3=c2;
        c3.show();
    }
}
