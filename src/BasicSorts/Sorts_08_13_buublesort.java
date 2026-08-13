package BasicSorts;
public class Sorts_08_13_buublesort {
    static void buble_Sort(int[] arr,int n){
        for(int i=0; i<n-1;i++){
            boolean flag= false;
            for(int j =1; j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if(!flag ){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
       // buble_Sort(arr,arr.length);
        buble_Sortrevers(arr,arr.length);
        for(int i:arr){
            System.out.print(i +" ");
        }
    }

    static void buble_Sortrevers(int[] arr,int n){
        for(int i=0; i<n-1;i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }}
}
