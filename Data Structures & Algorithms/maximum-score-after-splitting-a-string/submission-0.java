public class Solution {
    public int maxScore(String s) {
        int n = s.length(), res = 0;
        for (int i = 1; i < n; i++) {
            int leftZero = 0, rightOne = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    leftZero++;
                }
            }
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    rightOne++;
                }
            }
            res = Math.max(res, leftZero + rightOne);
        }
        return res;
    }
}