import java.util.Scanner;

public class BubbleSort {
    public static int[] BubbleS(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" number :");
            arr[i]= sc.nextInt();
        }
        int[] res = BubbleS(arr);
        System.out.println("Sorted Array IS : ");
        for(int i = 0 ; i <=res.length-1;i++){
            System.out.print(res[i]+"\t");
        }
    }
}