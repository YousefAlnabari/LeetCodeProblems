class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lenX = matrix[0].length;
        int lenY = matrix.length;
        int startX = 0, startY = 0;
        for(int i = 0; i < lenY - 2; i++)
            if(matrix[i][0] < target && matrix[i + 2][0] > target) {
                startY = i++;
                break;
            }
        for(int i = startY; i < lenY; i++)
            for(int k = startX; k < lenX; k++)
                if(matrix[i][k] == target)
                    return true;
        return false;
    }
}
