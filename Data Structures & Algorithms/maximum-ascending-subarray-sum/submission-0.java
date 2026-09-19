class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = nums[0];
        int finAns = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans+=nums[i];
            }else{
                ans = nums[i];
            }
            finAns = Math.max(finAns, ans);
        }
        return finAns;
    }
}