package BasicSorts;
public class Sorts_08_18_binarysearch {
    static int binaryserchasending(int[] nums,int target){
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                low = mid+1;
            }else if(target < nums[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,9,11,14,23,35,56};
        int[] arr2 ={89,78,67,56,45,34,23,12,9,8,7,6,5,4,3,2,1};
        //System.out.println( binaryserchasending(arr,11));

        System.out.println( binaryserchdes(arr2,12));

        for(int i:arr2){
            System.out.print(i +" ");
        }
    }

    static int binaryserchdes(int[] numb, int target){
        int low =0;
        int high = numb.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target == numb[mid]){
                return mid;
            }else if(target < numb[mid]){
                low = mid+1;
            }else if(target > numb[mid]){
                high = mid-1;
            }
        }
        return -1;
    }

}
