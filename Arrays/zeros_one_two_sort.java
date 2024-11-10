public class zeros_one_two_sort {
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,2,2,1,1,0,1,2};
        int n = arr.length;
        //method ---->1

        // int zeros = 0, ones = 0, two = 0;
        // for(int i = 0; i<n; i++){
        //     if(arr[i]==0) zeros++;
        //     if(arr[i]==1) ones++;
        //     if(arr[i]==2) two++;
        // }
        // for(int i =0; i<n; i++){
        //    if(i<zeros) arr[i]=0;
        //    else if(i<zeros+ones) arr[i]=1;
        //    else arr[i] = 2;
        // }

        //method ---> 2
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else //arr[mid]==2
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--; 
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
         }

    }
}
