public class Decreasing_order_using_bubblesort {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,7,3};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for (int j = i; j < n-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
