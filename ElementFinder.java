import java.util.*;
public class ElementFinder {
    int max;
    int min;
    public int MinElement(int[] arr){
        min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public int MaxElement(int[] arr){
        max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementFinder ef = new ElementFinder();
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+i+" number:");
            arr[i] = sc.nextInt();
        }
        ef.min = ef.MinElement(arr);
        ef.max = ef.MaxElement(arr);
        System.out.println("Minimum element is:"+ef.min+"\nMaximum element is:"+ef.max);

    }
}
