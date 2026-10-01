class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        Boolean greater;
        if(nums[1]>=nums[0]){
            greater = true;
        }else{
            greater = false;
        }

        for(int i=1;i<n;i++){
            if(greater){
                if(nums[i]<nums[i-1])
                return false;
            }else{
                if(nums[i]>nums[i-1])
                return false;
            }
        }
        return true;
    }
}