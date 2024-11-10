public class two_sortedarray_in_one_array {
    public static void main(String[] args) {
        int arr[] = { 22, 44, 65, 87, 98 };
        int brr[] = { 11, 18, 24, 54, 67 };
        int crr[] = new int[arr.length + brr.length];
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            } else {
                crr[k] = brr[j];
                j++;
                k++;
            }

        }
        if (i == arr.length) {
            while (j < brr.length) {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        if (j == brr.length) {
            while (i < arr.length) {
                crr[k] = arr[i];
                i++;
                k++;

            }
        }
        for (int ele : crr) {
            System.out.print(ele + " ");

        }
    }

}
