public class selection_sort {
    public static void print(int []arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9,4,-1,8,5,-6};
        int n = arr.length;
        System.out.println("Before sorted:");
        print(arr);
        for(int i =0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;

        }
        System.out.println("After sorted:");
        print(arr);
    }
}
