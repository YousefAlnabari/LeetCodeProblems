class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lenY = matrix.length;
        int lenX = matrix[0].length;
        for(int i = 0; i < lenY; i++)
            if(matrix[i][0] <= target && matrix[i][lenX - 1] >= target)
                for(int k = 0; k < lenX; k++)
                    if(matrix[i][k] == target)
                        return true;
        return false;
    }
}
