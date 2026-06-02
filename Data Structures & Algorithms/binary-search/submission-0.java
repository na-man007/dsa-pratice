class Solution {
    public int search(int[] nums, int target) {
    int i=0, j=nums.length-1;
    while(i<=j){
        int middle = i+ (j-i)/2;
        if(nums[middle] == target)
            return middle;
        else if(nums[middle] < target)
            i = middle + 1;
        else
            j = middle - 1;
    }
    return -1;
}
}
