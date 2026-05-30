class Solution {
    public boolean isValidSudoku(char[][] board) {
    // we will traverse the board and check if the current number is already present in the same row, same column or same 3*3 box
    HashSet<String> set = new HashSet<String>();
    for(int i=0; i<board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            char c = board[i][j];
            if (c != '.') {
                String row = "row" + i + c;
                String col = "col" + j + c;
                String box = "box" + (i / 3) + (j / 3) + c;

                if(set.contains(row) || set.contains(col) || set.contains(box)) {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
    }
    return true;
}
}
