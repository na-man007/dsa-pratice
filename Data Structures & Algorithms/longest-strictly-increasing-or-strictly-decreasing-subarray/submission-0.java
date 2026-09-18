class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = 1, min =1;
        int ans =1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                min = 1;
                max = max+1;
            }
            else if(nums[i]<nums[i-1]){
                min = min+1;
                max= 1;
            }
            else{
                min = 1;
                max = 1;
            }

            ans = Math.max(ans,Math.max(min,max));
        }
        return ans;
    }
}