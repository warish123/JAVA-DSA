public class quicksort {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    public static int partition(int arr[], int lo, int hi){
       int pivot = arr[lo];
       int pivotidx = lo;
       int smallercount = 0;
        for (int i = lo+1; i <=hi; i++) {
            if(arr[i]<=pivot) smallercount++;
            
        }
        int correctidx = pivotidx+smallercount;
        swap(arr,pivotidx,correctidx);
        int i= lo; int j = hi;
        while(i<correctidx &&j>correctidx){
            if(arr[i]<=pivot)i++;
           else if(arr[j]>pivot)j--;
           else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr, i, j);
            }
        }
        return correctidx;
    }
    public static void quick_sort(int arr[], int lo, int hi){
        if(lo>=hi) return;
        int idx = partition(arr, lo, hi);
        quick_sort(arr, lo, idx-1);
        quick_sort(arr, idx+1,hi);
    
    }
    public static void main(String[] args) {
        int arr[] = {40,30,90,80,35,20,70,60};
        print(arr);
        int n = arr.length;
        quick_sort(arr, 0,n-1);
        print(arr);

    }
}
