class Solution {
    private int[] productExceptSelf(int[] nums) {
    int[] ans = new int[nums.length];
    int product = 1;
    int zeroCount = 0;
    for(int i: nums) {
        if (i == 0) {
            zeroCount++;
        } else {
            product *= i;
        }
    }
    // if 2 zeros , always zero
    if(zeroCount > 1) {
        return ans;
    }

    // if 1 zero, all elements except the one with zero will be zero, and the one with zero will be the product of all non-zero elements
    if(zeroCount == 1) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                ans[i] = product;
            }
        }
        return ans;
    }

    // if no zeros, the product of all elements divided by the current element will give the answer for that element

    int[] prefixProduct = new int[nums.length];
    int[] suffixProduct = new int[nums.length];
    prefixProduct[0] = nums[0];
    suffixProduct[nums.length - 1] = nums[nums.length - 1];
    for(int i=1; i<nums.length; i++) {
        prefixProduct[i] = prefixProduct[i - 1] * nums[i];
    }
    for(int i=nums.length - 2; i>=0; i--) {
        suffixProduct[i] = suffixProduct[i + 1] * nums[i];
    }
    for(int i=0; i<nums.length; i++) {
        if (i == 0) {
            ans[i] = suffixProduct[i + 1];
        } else if (i == nums.length - 1) {
            ans[i] = prefixProduct[i - 1];
        } else {
            ans[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
        }
    }
    return ans;
}

}  
