import java.util.Scanner;
class Array {
    int[] arr;
    int size;
    int min;
    public void FindMinElement(int[] arr)
    {
        this.arr=arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        size = sc.nextInt();
        arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" number:");
            arr[i] = sc.nextInt();
        }
        min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min element is:"+min);
        Multiplication();
    }
    private void Multiplication()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        int value = sc.nextInt();
        int result = min * value;
        System.out.println("Multiplication is:"+result);
    }
}
public class MinArrayMultiplication {
    public static void main(String[] args) {
        Array a = new Array();
        a.FindMinElement(a.arr);
    }
}