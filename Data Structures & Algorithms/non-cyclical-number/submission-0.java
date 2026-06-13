class Solution {
    public boolean isHappy(int n){
    HashSet<Integer> set  = new HashSet<>();
    int num = n;
    while(true){
        int x = totalSum(num);
        System.out.println("number is "+x);
        if(x == 1)
            return true;
        if(set.contains(x))
            return false;
        set.add(x);
        num = x;
    }
}

private int totalSum(int num) {
    int square = 0;
    while(num>0){
        square += (num%10)*(num%10);
        num/=10;
    }
    return square;
}
}
