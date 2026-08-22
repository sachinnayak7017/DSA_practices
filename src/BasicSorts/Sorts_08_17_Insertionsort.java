package BasicSorts;
public class Sorts_08_17_Insertionsort {
    static void insertionsort(int[] arr,int n){
        for(int i=0; i<n;i++){
            for(int j =i; j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,9,1,3,7};
        insertionsort(arr,arr.length);

        for(int i:arr){
            System.out.print(i +" ");
        }
    }


}
