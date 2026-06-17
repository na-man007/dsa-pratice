class Solution {
    public int majorityElement(int[] nums) {
    int n = nums.length;
    int res = 0, i=0, count=0;
    while(i<n){
        if(nums[i]==nums[res]){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            res = i;
            count = 1;
        }
        i++;
    }
    return nums[res];
}
}