class Heirarchy1 {
    int a=10;
    public int increment()
    {
        return ++a;
    }
}
public class HierarchicalInheritance extends Heirarchy1 {
    int b=100;
    public int increment()
    {
        return ++b;
    }
    public void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        HierarchicalInheritance h1 = new HierarchicalInheritance();
        h1.display();
        Heirarchy2 h2 = new Heirarchy2();
        h2.display();
    }
}
class Heirarchy2 extends Heirarchy1
{
    int b=400;
    public int increment()
    {
        return ++b;
    }
    public void display()
    {
        System.out.println(super.increment());
        System.out.println(increment());
    }
}
