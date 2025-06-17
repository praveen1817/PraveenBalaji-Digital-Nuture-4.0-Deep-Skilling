import java.lang.reflect.Array;
import java.util.Arrays;
public class quickSort {
    public static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }

    }
    public  static int partition(int[] arr,int low,int high){
        int pivotElement= arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if (arr[j]<pivotElement){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;


    }

    public static void main(String[] args) {
        int[] arr={2,56,37,45,13,12,78,1,98};
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        for(int i=0;i<=high;i++){
            System.out.println(arr[i]);
        }

    }
}
