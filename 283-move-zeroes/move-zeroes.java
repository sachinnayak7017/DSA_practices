class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n -1  ; i++){
             boolean flag = false;
            for(int j =1; j< n-i; j++ ){
                if(0== nums[j-1]){
                    int temp = nums[j];
                    nums[j]= nums[j-1];
                    nums[j-1]= temp;
                    flag = true;
                }
            }
               if (!flag) {
                break;
            }
        }
        
    }
}