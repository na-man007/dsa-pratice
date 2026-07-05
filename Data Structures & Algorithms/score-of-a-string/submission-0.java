class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        int i=1;
        while(i<s.length()){
            ans += Math.abs((s.charAt(i)-'a')-(s.charAt(i-1)-'a'));
            i++;
        }
        return ans;
    }
}