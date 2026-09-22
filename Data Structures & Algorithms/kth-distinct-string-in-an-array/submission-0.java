public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinct = new HashSet<>();
        Set<String> seen = new HashSet<>();

        for (String s : arr) {
            if (distinct.contains(s)) {
                distinct.remove(s);
                seen.add(s);
            } else if (!seen.contains(s)) {
                distinct.add(s);
            }
        }

        for (String s : arr) {
            if (distinct.contains(s)) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }

        return "";
    }
}