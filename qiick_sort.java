public class qiick_sort{
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void quick_sort(int[]arr,int st,int end){
        if(st>=end){
            return;
        }
        int pi=partition(arr,st,end);
        quick_sort(arr, st, pi-1);
        quick_sort(arr, pi+1, end);
    }
    static int partition(int[]arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivot_idx=st+count;
        swap(arr, st, pivot_idx);
        int i=st;
        int j=end;
        while(i<pivot_idx && j>pivot_idx){
            while (arr[i]<pivot) {
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }
            if(i<pivot_idx && j>pivot_idx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivot_idx;
    }
    static void print_arr(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr = {6,3,1,5,5,6,6,4};
        int n=arr.length;
        System.out.println("original array:");
        print_arr(arr);
        quick_sort(arr, 0,n-1 );
        System.out.println("after sorting");
        print_arr(arr);

        
    }
}