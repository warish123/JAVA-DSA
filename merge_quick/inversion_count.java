public class inversion_count {
    public static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int count;
    public static void inversion(int a[], int b[]){
        int i = 0, j=0;
        while ((i<a.length && j<b.length)) {
            if(a[i]<b[j]){
                count += (a.length-i);
                j++;
            }else i++;
            
        }
    
    }
    
    public static void merge(int a[], int b[],int ans[]){
        int i = 0, j=0, k= 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                ans[k++] = a[i++];
            }else{
                ans[k++] = b[j++];
            }
        }
    
        while(j<b.length){
                ans[k++] = b[j++];
            }
        while(j<b.length){
                ans[k++] = a[i++];
            }
       

    }
    public static void mergeSort(int arr[]){
     
        int n= arr.length;
        if(n==1)return;
        int a[] = new int[n/2];
        int b[] = new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
       for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        
       }
       mergeSort(a);
       mergeSort(b);
       merge(a,b,arr);
    }
    public static void main(String[] args) {
        int arr[] = {50,30,10,60,90,40};
        int count = 0;
        print(arr);
        mergeSort(arr);
        print(arr);
       System.out.println(count);
    }
}
