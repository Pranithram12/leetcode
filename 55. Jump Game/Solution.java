class Solution {
    public boolean canJump(int[] nums) {
        int finalposition = nums.length - 1;

        for(int indx=nums.length - 2 ; indx >= 0;indx--){
            if(indx + nums[indx] >= finalposition){
                finalposition = indx;
            }
        } 

        if(finalposition == 0){
            return true;
        }
        else{
            return false;
        }
    }
}