class Solution {
    public int minEatingSpeed(int[] piles,  int h){
    int max = 0;
    for(int pile: piles)
        max = Math.max(max, pile);
    int i=0, j=max;
    while(i<j){
        int mid = i+ (j-i)/2;
        int hours = 0;
        for(int pile: piles){
            hours += Math.ceil((double)pile/mid);
        }
        if(hours>h)
            i = mid + 1;
        else
            j = mid;
    }
    return j;
}
}
