import java.util.Scanner;
public class Classroom {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        //Dynamically array declare
        int[] arr2 = new int[n];
        System.out.println("Enter elements of arr2");
        for(int i=0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
            System.out.println("arr2 is:");
        }
        for (int i = 0;i<n;i++)
        {
            System.out.println(arr2[i]+"\t");
        }
        //Statically array declare
        int arr1[] = {1,2,3,4,5};
        System.out.println("Enter Elements of arr1:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+ "\t");
        }



    }
}
