public class ObjectAsParameter {
    int a;
    int b;
    String name;

    public void print(ObjectAsParameter A, ObjectAsParameter B) {
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("String= " + name);
        System.out.println("From A: a= " + A.a);
        System.out.println("From A: b= " + A.b);
        System.out.println("From B: a= " + B.a);
        System.out.println("From B: b= " + B.b);
        System.out.println("From A: String= " + A.name);
        System.out.println("From B: String= " + B.name);
    }
    ObjectAsParameter(int x, int y) {
        a = x;
        b = y;
    }
    ObjectAsParameter(String a) {
        name = a;
    }
    ObjectAsParameter() {
        System.out.println("This is a non parameterized constructor");
        a = 100;
        b = 200;
        name = "This is a constructor";
    }
    public static void main(String[] ar) {
        ObjectAsParameter cd = new ObjectAsParameter();
        ObjectAsParameter cd1 = new ObjectAsParameter("Hello World");
        ObjectAsParameter cd2 = new ObjectAsParameter(10, 20);
        cd.print(cd1, cd2);
    }
}