import java.util.Scanner;
public class BinarySearch {
    public static int BinaryS(int[] arr,int x) {
        int lb=0;
        int ub=arr.length-1;
        while (lb<=ub) {
            int mid = (ub+lb)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if (arr[mid]>x) {
                ub=mid-1;
            }
            else {
                lb=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter "+i+" number:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int elm = sc.nextInt();
        int res = BinaryS(arr,elm);
        if (res!=-1)
        {
            System.out.println("Element found at position:"+res);
        }
        else {
            System.out.println("Element not found...");
        }
    }
}
