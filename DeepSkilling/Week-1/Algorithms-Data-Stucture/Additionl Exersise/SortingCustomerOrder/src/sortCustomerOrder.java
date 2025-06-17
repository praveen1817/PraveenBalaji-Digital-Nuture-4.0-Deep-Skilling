public class sortCustomerOrder {
    int customerId;
    String product;
    float totalPrice;

    public sortCustomerOrder(int customerId, String product, float totalPrice) {
        this.totalPrice = totalPrice;
        this.customerId = customerId;
        this.product = product;
    }
    @Override
    public String toString(){
        return "Customer Name:  "+customerId+"Product:  "+product+"Total Price: "+totalPrice;
    }

    public static void sort(sortCustomerOrder[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);

        }
    }
    public static void bubbleSort(sortCustomerOrder[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if (arr[j].totalPrice>arr[j+1].totalPrice){
                    float temp=arr[j+1].totalPrice;
                    arr[j+1].totalPrice=arr[j].totalPrice;
                    arr[j].totalPrice=temp;
                }
            }
        }

    }

    public static int partition(sortCustomerOrder[] arr, int low, int high) {
        int i = low - 1;
        float pivotElement = arr[high].totalPrice;
        for (int j = 0; j < high; j++) {

            if (arr[j].totalPrice < pivotElement) {
                i++;
                float temp = arr[i].totalPrice;
                arr[j].totalPrice = arr[i].totalPrice;
                arr[i].totalPrice = temp;
            }

        }
        float temp = arr[high].totalPrice;
        arr[high].totalPrice = arr[i + 1].totalPrice;
        arr[i + 1].totalPrice = temp;
        return i + 1;


    }

    public static void main(String[] args) {
        sortCustomerOrder[] arr = {new sortCustomerOrder(101, "praveen", 1700),
                new sortCustomerOrder(101, "ABD", 1400),
                new sortCustomerOrder(342, "Virat", 5600),
                new sortCustomerOrder(111, "CR7", 1050)};
        int low = 0;
        int high = arr.length - 1;
        bubbleSort(arr);
        for (int i = 0; i <= high; i++) {
            System.out.println(arr[i]);

        }
    }
}
