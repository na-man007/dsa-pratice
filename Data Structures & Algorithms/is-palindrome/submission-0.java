class Solution {
    public boolean isPalindrome(String s) {
    // start from end and start and check if the characters are same or not, if not return false
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        char c1 = s.charAt(i);
        char c2 = s.charAt(j);
        if (!Character.isLetterOrDigit(c1)) {
            i++;
        } else if (!Character.isLetterOrDigit(c2)) {
            j--;
        } else {
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            i++;
            j--;
        }
    }
    return true;
}
}
