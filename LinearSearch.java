import java.util.Scanner;
public class LinearSearch {
    public static int LinearS(int arr[],int elm) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i]==elm) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" Number:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to Search:");
        int elm = sc.nextInt();
        int res = LinearS(arr,elm);
        if(res!=-1){
            System.out.println("Element found at position:"+res);
        }
        else {
            System.out.println("Element not found");
        }

    }
}