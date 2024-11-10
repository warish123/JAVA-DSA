public class bubble_sort {
    public static void print(int []arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n= arr.length;
        System.out.println("Before sorted:");
        print(arr);
        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
                
            }
            if(flag==true) break;
            
            
        }
        System.out.println("After sorted:");
        print(arr);
    }
}
