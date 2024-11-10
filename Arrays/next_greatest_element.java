public class next_greatest_element {
    public static void main(String[] args) {
        int arr[] = {23,45,96,23,1,44,87,56};
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1]= -1;
        int ngi = arr[n-1];
    
        for(int i = n-2; i>=0;i--){
            ans[i] = ngi;
            ngi = Math.max(ngi, arr[i]);

        }
        for(int ele : arr){
            System.out.print(ele+" ");

        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");

        }
    }
}
