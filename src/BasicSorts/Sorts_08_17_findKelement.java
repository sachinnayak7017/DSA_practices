package BasicSorts;
public class Sorts_08_17_findKelement {
    static int  selection_sort(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int min_num = Integer.MAX_VALUE;
            int minidx = -1;
            for (int j = i; j < n; j++) {
                if (min_num > arr[j]) {
                    min_num = arr[j];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        return arr[k-1];
    }


    public static void main(String[] args) {
        int arr[]={4, 1, 3, 9, 7};
        System.out.println( selection_sort(arr,arr.length,3));

        for(int i:arr){
            System.out.print(i +" ");
        }
    }

}
