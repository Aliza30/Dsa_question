class Solution {
    public void rotate(int[][] matrix) {
         int size = matrix.length;

        for (int x0 = 0, x1 = size - 1; x0 <= x1; x0++, x1--) {
            for (int y0 = 0, y1 = size - 1; y0 < y1; y0++, y1--) {
                swap(matrix, x0, y0, x1, y1);
            }
        }

    }

    private static void swap(int[][] matrix, int x0, int y0, int x1, int y1) {
        // x 1 x x      x0 = 1, x1 = 2
        // x x x 2      y0 = 0, y1 = 3 
        // 4 x x x 
        // x x 3 x 

        // keep 1
        int t = matrix[y0][x0];

        // 4 -> 1
        matrix[y0][x0] = matrix[x1][y0];

        // 3 -> 4
        matrix[x1][y0] = matrix[y1][x1];

        // 2 -> 3
        matrix[y1][x1] = matrix[x0][y1];

        // 1 -> 2
        matrix[x0][y1] = t;
    
    }
}