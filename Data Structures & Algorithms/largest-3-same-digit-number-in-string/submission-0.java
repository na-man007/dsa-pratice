public class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        int val = 0;

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i) == num.charAt(i + 2)) {
                String tmp = num.substring(i, i + 3);
                if (val <= Integer.parseInt(tmp)) {
                    val = Integer.parseInt(tmp);
                    res = tmp;
                }
            }
        }

        return res;
    }
}