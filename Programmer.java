import java.util.*;
class Employee1{
    float salary;
    public void getSalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        salary=sc.nextFloat();
    }
}
public class Programmer extends Employee1 {
    float bonus;
    public float TotalSalary(float b,float sal) {
        float total=(b/100)*sal+sal;
        return total;
    }
    public static void main(String[] args) {
        Programmer p = new Programmer();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter salary:");
//        p.salary=sc.nextFloat();
        p.getSalary(); 
        System.out.println("Enter bonus to be paid:");
        p.bonus=sc.nextFloat();
        float sal=p.TotalSalary(p.bonus,p.salary);
        System.out.println(sal);
    }
}
