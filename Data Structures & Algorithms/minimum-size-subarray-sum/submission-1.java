class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, h = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(h<nums.length){
            sum+=nums[h];
            if(sum>=target)
            {
            ans = Math.min(ans, h-l+1);
            sum-=nums[l];
            l++;
            sum-=nums[h];
            }
            else{
                h++;
            }
        }
        if(ans == Integer.MAX_VALUE)
        return 0;

        return ans;
    }
}