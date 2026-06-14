class Solution {
    public int[] plusOne(int[] digits){
    int n = digits.length;
    int i = n-1;
    int carry  = 0;
    while(i>=0){
        if (digits[i] == 9) {
            digits[i] = 0;
            carry = 1;
            i--;
        }
        else {
            digits[i] += 1;
            carry = 0;
            break;
        }
    }
    if(carry ==1){
        int[] res = new int[n+1];
        res[0] = 1;
        for(int j=1;j<=n;j++){
            res[j] = digits[j-1];
        }
        return res;
    }
    return digits;
}
}
