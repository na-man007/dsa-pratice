class Solution {
    public int calPoints(String[] ops){
    if(ops.length == 0){
        return 0;
    }
    Stack<Integer> st = new Stack<>();
    int ans = 0, i=0;
    while(i<ops.length){
        if(ops[i].equals("C")){
            st.pop();
        }
        else if(ops[i].equals("D")){
            int x = st.peek();
            st.push(2*x);
        }
        else if(ops[i].equals("+")){
            int x = st.peek();
            st.pop();
            int y = st.peek();
            st.push(x);
            st.push(x+y);
        }
        else {
            st.push(Integer.parseInt(ops[i]));
        }
        i++;
    }

    while(!st.isEmpty()){
        ans += st.peek();
        st.pop();
    }

    return ans;
}
}