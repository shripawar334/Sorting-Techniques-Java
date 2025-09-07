public class Selection_Sort {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
           int min_idex=i;
           for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_idex]){
                min_idex=j;
            }
           }
           int temp=arr[i];
           arr[i]=arr[min_idex];
           arr[min_idex]=temp;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array using Selection Sort:");
        printArray(arr);
    }
}
