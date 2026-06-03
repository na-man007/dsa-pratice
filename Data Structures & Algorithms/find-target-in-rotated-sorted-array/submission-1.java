class Solution {
    public int search(int[] nums, int target) {
    int i=0;
    int j=nums.length-1;
    while(i<=j) {
        int middle = i + (j - i) / 2;
        if (nums[middle] == target)
            return middle;
        else if (nums[middle] >= nums[i]) {
            if(target >= nums[i] && target < nums[middle])
                j = middle - 1;
            else
                i = middle + 1;
        }
        else {
            if(target > nums[middle] && target <= nums[j])
                i = middle + 1;
            else
                j = middle - 1;
        }
    }
    return -1;
}
}
