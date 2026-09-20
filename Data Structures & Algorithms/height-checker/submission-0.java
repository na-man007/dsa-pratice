class Solution {
    public int heightChecker(int[] original) {
        int n = original.length;
        int[] copy = Arrays.copyOf(original, n);
        Arrays.sort(copy);
        int ans = 0;
        for(int i=0;i<n;i++){
            if(original[i] == copy[i])
            ans++;
        }

        return n-ans;
    }
}