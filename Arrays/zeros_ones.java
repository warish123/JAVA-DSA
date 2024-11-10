public class zeros_ones {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,1,1,1,1};
        int n = arr.length;
        int noOfzeros = 0;
        // for(int i= 0; i<n; i++){
        //     if(arr[i]==0) noOfzeros++;
        // }
        // for(int i = 0; i<n; i++){
        //     if(i<noOfzeros) arr[i] = 0;
        //     else arr[i] = 1;
        // }
        // for(int i= 0; i<n; i++){
        //    System.out.print(arr[i]+" ");
        // }

        // method----> 2

        for(int i= 0; i<n; i++){
          for(int j =n-1; j>i; j--){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }
        }
        for(int i= 0; i<n; i++){
           System.out.print(arr[i]+" ");
        }
    }
}
