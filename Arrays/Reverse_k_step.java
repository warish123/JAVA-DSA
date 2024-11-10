public class Reverse_k_step {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int k=3;
        int n = arr.length;
        k = k % n;
        int i =0,j=n-k-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        int l =n-k, m=n-1;
        while(l<m){
            int temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m--;

        }
        int h =0, p=n-1;
        while(h<p){
            int temp = arr[h];
            arr[h] = arr[p];
            arr[p] = temp;
            h++;
            p--;

        }
        for(int a= 0; a<n; a++){
            System.out.print(arr[a]+" ");
        }

    }
    
}
