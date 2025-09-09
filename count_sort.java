public class count_sort {
    static void count_sort(int[] arr) {
        int max = findmax(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static int findmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void advance_count_sort(int[] arr) {
        int n=arr.length;
        int[]output=new int[n];
        int max = findmax(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //make prefix sum array of count array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        //find the index of each element
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        // copy all elements from output array to original array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    static void print_arr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 2, 5 };
        advance_count_sort(arr);
        print_arr(arr);
    }
}