class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows=matrix.length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target) return true;
               
                
            }
        }return false;
    }
}