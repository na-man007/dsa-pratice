class Solution {
    public int characterReplacement(String s, int k) {

    // store frequency of each character , when len(window) - maxFreq > k, we need to shrink the window
    Map<Character, Integer> map = new HashMap<>();
    int left = 0;
    int ans = 0;
    int maxFreq = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        map.put(c, map.getOrDefault(c, 0) + 1);
        maxFreq = Math.max(maxFreq, map.get(c));
        while (right - left + 1 - maxFreq > k) {
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            left++;
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}
}
