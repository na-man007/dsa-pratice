class Solution {
    public int lengthOfLongestSubstring(String s) {
    // we will store frequency of each character in a map and keep track of the longest substring without repeating characters
    Map<Character, Integer> map = new HashMap<>();
    int left = 0;
    int ans = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        if(map.containsKey(c)) {
            left = Math.max(left, map.get(c) + 1);
        }
        map.put(c, right);
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}
}
