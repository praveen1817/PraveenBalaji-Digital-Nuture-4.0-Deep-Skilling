import java.util.Arrays;
public class selectionSort {
    public static void sort(int[] arr){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int minindex=i;
            for(int j=i+1;j<len;j++){

                if (arr[minindex]>arr[j]){
                    minindex=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={3,6,1,45,23,12};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
