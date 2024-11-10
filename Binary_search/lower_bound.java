public class lower_bound {
    public static void main(String[] args) {
        int arr [] = {12,23,44,44,51,59,63};
        int x = 25;
        int n = arr.length;
        int lb = n;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb, mid);
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        System.out.println(lb);
    }

   
}
