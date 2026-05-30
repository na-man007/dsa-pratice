class Solution {
    public int trap(int[] height) {
    int ans = 0;

    // two pointer approach

    int left = 0;
    int right = height.length - 1;
    int leftMax = height[0];
    int rightMax = height[height.length - 1];

    while (left <= right) {
        if(leftMax<=rightMax){
            ans += Math.max(0, leftMax - height[left]);
            leftMax = Math.max(leftMax, height[left]);
            left++;
        }else{
            ans += Math.max(0, rightMax - height[right]);
            rightMax = Math.max(rightMax, height[right]);
            right--;
        }
    }
    return ans ;
}
}
