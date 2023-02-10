public class BubbleSort {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,5,3,7,2};
        bubbleSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
