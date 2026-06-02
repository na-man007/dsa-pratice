class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
    // first we will do binary search on first column to find the row in which target is present
    int i=0, j=matrix.length-1;
    while(i<=j){
        int middle = i + (j-i)/2;
        if(matrix[middle][0] == target)
            return true;
        else if(matrix[middle][0] < target)
            i = middle + 1;
        else            j = middle - 1;
    }

    if(j<0)
    return false;
    // now we have the row in which target is present, we will do binary search on
    int row = j; // j will be the row in which target is present
    i=0; j=matrix[0].length-1;
    while(i<=j){
        int middle = i + (j-i)/2;
        if(matrix[row][middle] == target)
            return true;
        else if(matrix[row][middle] < target)            i = middle + 1;
        else            j = middle - 1;
    }
    return false;
}
}
