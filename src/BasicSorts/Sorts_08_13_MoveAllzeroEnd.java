package BasicSorts;
public class Sorts_08_13_MoveAllzeroEnd {

    public static void main(String[] args) {
        int arr[]={5,0,3,0,4,0,8,0,9};
       // buble_Sort(arr,arr.length);
        moveallzeroend(arr,arr.length);
        for(int i:arr){
            System.out.print(i +" ");
        }
    }

    static void moveallzeroend(int[] arr,int n){
        for(int i=0; i<n-1;i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
//                if (arr[j - 1] < arr[j]) {
                if (0 == arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
                if (!flag) {
                    return;
                }
        }}
}
