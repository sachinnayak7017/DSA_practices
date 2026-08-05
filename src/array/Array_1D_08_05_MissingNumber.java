package array;

public class Array_1D_08_05_MissingNumber {
    public static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter array size:");
//        int[] arr = new int[sc.nextInt()];
//        System.out.println("please enter array element :");
//        for(int i =0;i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {9,6,4,2,3,5,7,0,1};

/*****************************************************/
        int  n = arr.length;
        System.out.println(n);
        int sum = (n*(n+1))/2;
        int arrsum= 0;

        for(int i =0; i <n;i++){
            arrsum = arrsum+arr[i];

        }

}}
