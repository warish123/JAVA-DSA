import java.util.Scanner;

public class merge_two_element_in_one_array {
    public static void print(int[]arr) {
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        
    }
    public static void merge(int[]a, int []b, int[] ans){
        int i =0, j=0,k=0;
      while(i<a.length && j<b.length){
        if(a[i]<b[j]){
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
    public static void main(String[] args) {
      int[] a = {10,20,30,40,60,70,90};
      int[] b = {35,45,65,78,83};
      print(a);
      print(b);
      int m = a.length, n = b.length;
      int ans[] = new int[m+n];
      merge(a, b, ans);
      print(ans);

      
    }
}