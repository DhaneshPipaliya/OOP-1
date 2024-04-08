import java.util.Scanner;

public class SelectionSort {
    public static int[] SelectS(int[] arr) {
        int min;
        for (int i=0;i<arr.length-1;i++){
            min = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" number :");
            arr[i]= sc.nextInt();
        }
        int[] res ;
        res = SelectS(arr);
        System.out.print("Sorted Array IS : ");
        for(int i = 0 ; i <=res.length-1;i++){
            System.out.print(res[i]+"\t");
        }
    }
}
