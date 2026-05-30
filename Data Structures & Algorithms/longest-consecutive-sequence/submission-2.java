public class Solution {
    private int longestConsecutive(int[] nums) {

    // we will just check for first number of the sequence
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums) {
        set.add(i);
    }
    
    int ans = 0;
    for(int i: nums) {
        if (!set.contains(i - 1)) {
            int count = 1;
            while (set.contains(i + count)) {
                count++;
            }
            ans = Math.max(ans, count);
        }
    }
    return ans;
}
}