class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        int max = arr[n-1], i=n-2;
        while(i>=0){
            max = Math.max(max,arr[i+1]);
            ans[i] = max;
            i--;
        }
        return ans;
    }
}