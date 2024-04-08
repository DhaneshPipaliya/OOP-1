import java.util.Scanner;
public class MethodOverloading
{
    public static int addition(int a,int b)
    {
        return (a+b);
    }
    public static int addition(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int[] addition(int[] arr1,int[] arr2)
    {
        if(arr1.length==arr2.length)
        {
            int[] sum = new int[arr1.length];
            for (int i=0;i<arr1.length;i++)
            {
                sum[i]=arr1[i]+arr2[i];
            }
            return sum;
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=addition(a,b);
        System.out.println("Sum is:"+sum);
        int[] array1={1,2,3,4,5};
        int[] array2={10,20,30,40,50};
        int arr_addition=addition(array2);
        System.out.println("Sum of array elements is:"+arr_addition);
        int[] array3=new int[5];
        array3=addition(array1,array2);
        System.out.println("Sum of two arrays is:");
        for (int i=0;i<5;i++)
        {
            System.out.println(array3[i]+"\t");
        }
    }
}
