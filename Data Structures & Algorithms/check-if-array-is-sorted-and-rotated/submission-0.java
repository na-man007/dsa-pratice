class Solution {
    public boolean check(int[] nums) {
        int ct = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1])
            ct++;
        }
        if(ct>1)
        return false;

        if(ct == 0)
        return true;

        if(nums[n-1]>nums[0])
        return false;

        return true;
    }
}