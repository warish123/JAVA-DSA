import java.util.Arrays;

public class binary_search {
    public static void main(String[] args) {
        int arr[] = {12,34,44,54,66,76,78,85};
        int n = arr.length;
        int target = 111;
        boolean flag = false;
        int low = 0; int high = n-1; 
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<target)low = mid+1;
            else if(arr[mid]>target) high = mid-1;
            else if(arr[mid]==target){
                flag = true;
                break;
            }
             
        }
        if(flag==true){
            System.out.println("Target Present");
        }else{
            System.out.println("Target not present");
        }
    }
    
}
