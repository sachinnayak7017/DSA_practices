package BasicSorts;
public class Sorts_08_16_commonSort {
    static void selection_sort(int[] arr,int n){
        for(int i=0; i<n-1;i++){
            int min_num = Integer.MAX_VALUE;
            int minidx =-1;
            for(int j =i; j<n;j++){
                if(min_num>arr[j]){
                    min_num=arr[j];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }

    static void selection_sortrevers(int[] arr,int n){
        for(int i=n-1; i>0;i--){
            int max_num = Integer.MIN_VALUE;
            int maxdx =i;
            for(int j = i;j>=0;j--){
                if(max_num < arr[j]){
                    max_num = arr[j];
                    maxdx = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={4, 1, 3, 9, 7};
//        selection_sort(arr,arr.length);
        selection_sortrevers(arr,arr.length);

        for(int i:arr){
            System.out.print(i +" ");
        }
    }

}
