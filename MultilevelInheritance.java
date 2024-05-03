public class MultilevelInheritance
{
    int a=100;
    public void display()
    {
        System.out.println(a+" is in super class");
    }
}
class Multilevel1 extends MultilevelInheritance
{
    int a=1000;
    public void display()
    {
        System.out.println(a+" is in first level");
        //super.display();
    }
}
class Multilevel2 extends Multilevel1
{
    int a=10;
    public void display()
    {
        System.out.println(a+" is in first level");
        super.display();
    }

    public static void main(String[] args) {
        Multilevel2 m2 = new Multilevel2();
        m2.display();
    }
}

