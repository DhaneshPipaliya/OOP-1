import java.util.Scanner;
public class ObjectAsParameterArray {
    String name;
    int RollNo;
    float cgpa;
    ObjectAsParameterArray(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter name:");
            name = sc.next();
            System.out.print("Enter rollno:");
            RollNo = sc.nextInt();
            System.out.print("Enter CGPA:");
            cgpa = sc.nextFloat();

    }
    public static void MaxCgpa(ObjectAsParameterArray[] a){
            for (int i = 0; i <= a.length; i++) {
                if (a[i].cgpa > 5.0) {
                    if (a[i].cgpa > a[i + 1].cgpa) {
                        System.out.println("Name:" + a[i].name + "\nRollNo:" + a[i].RollNo + "\nCGPA:" + a[i].cgpa + "\nGrade:AA");
                    } else {
                        System.out.println("Name:" + a[i].name + "\nRollNo:" + a[i].RollNo + "\nCGPA:" + a[i].cgpa + "\nGrade:FF");
                    }
                }
            }

            }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of students:");
        n=sc.nextInt();
        ObjectAsParameterArray[] ob1 = new ObjectAsParameterArray[n];
        for(int i=0;i<n;i++)
        {
            ob1[i]= new ObjectAsParameterArray();
        }
        MaxCgpa(ob1);
    }
}
