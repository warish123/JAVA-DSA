public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1,1,3,1,5,7,9};
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
    
}
