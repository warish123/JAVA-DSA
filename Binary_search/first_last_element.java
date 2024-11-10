public class first_last_element {
    public static void main(String[] args) {
        int arr [] = {12,12,12,35,35,35,35,35,66,66,66,66};
        int target= 35;
        int n = arr.length;
        int fstidx = -1;
        int lstidx = -1;
        int lo = 0; int hi = n-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1])hi = mid-1;
                else{
                    fstidx = mid;
                    break;
                }

            }
            else if(arr[mid]<target)lo = mid+1;
            else if(arr[mid]>target)hi = mid-1;
        }
        System.out.println(fstidx);
       
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(arr[mid]==target){
                if(mid+1<n && arr[mid]==arr[mid+1])lo = mid+1;
                else{
                   lstidx = mid;
                    break;
                }

            }
            else if(arr[mid]<target)hi = mid-1;
            else if(arr[mid]>target)lo = mid+1;
        }
        System.out.println(lstidx);
       
    }
}
