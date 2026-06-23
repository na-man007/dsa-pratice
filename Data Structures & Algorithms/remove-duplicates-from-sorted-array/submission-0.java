class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1, n = nums.length;
        while(j<n){
            if(nums[j] == nums[i])
            {
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}