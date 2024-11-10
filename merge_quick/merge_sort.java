public class merge_sort {
   
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void mergeSort(int[]a, int b[],int ans[]){
      
        int i =0, j=0,k=0;
      while(i<a.length && j<b.length){
        if(a[i]<=b[j]){
            ans[k] = a[i];
            i++;
            k++;
        }
        if(a[i]>b[j]){
            ans[k] = b[j];
            j++;
            k++;
        }
      }
      if(i==a.length){
       while(j<b.length){
        ans[k] = b[j];
        j++;
        k++;
       }
      }
      if(j==b.length){
       while(i<a.length){
        ans[k] = a[i];
        i++;
        k++;
       }
      }
    }
    public static void merge(int arr[]){
        int n = arr.length;
        if(n==1)return;
        int a[] = new int[n/2];
        int b[] = new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];  
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];  
        }
        merge(a);
        merge(b);
        mergeSort(a,b,arr);
       
    }
    
    public static void main(String[] args) {
        int arr[] = {60,40,10,30,50,80,90,20};
        print(arr);
        merge(arr);
        print(arr);
        
    }
}
