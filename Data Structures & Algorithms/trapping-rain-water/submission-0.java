class Solution {
    public int trap(int[] height) {
    int ans = 0;

    // we will just calculate how much water each block can hold and add it to the answer

    int [] left = new int[height.length];
    int [] right = new int[height.length];

    for(int i=0;i<height.length;i++) {
        if(i == 0) {
            left[i] = height[i];
        } else {
            left[i] = Math.max(left[i-1], height[i]);
        }
    }

    for(int i=height.length-1;i>=0;i--) {
        if(i == height.length-1) {
            right[i] = height[i];
        } else {
            right[i] = Math.max(right[i+1], height[i]);
        }
    }

    for(int i=0;i<height.length;i++) {
        ans += Math.min(left[i], right[i]) - height[i];
    }
    return ans ;
}
}
