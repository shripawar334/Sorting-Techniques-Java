public class insertion_sort{
    static void insertion(int arr[]){
       int n=arr.length;
       for(int i=1;i<n;i++){
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
       }
    }
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={8,3,89,5,4,2,45};
        insertion(arr);
        System.out.println("Sorted array using Insertion Sort:");
        printArray(arr);
    }
}