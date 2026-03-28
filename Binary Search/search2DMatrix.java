import java.util.*;

class search2DMatrix {

    static List<Integer> function(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return Arrays.asList(-1, -1);

        int rows = matrix.length;
        int cols = matrix[0].length;

        // start at top-right
        int r = 0;
        int c = cols - 1;

        while (r < rows && c >= 0) {
            int val = matrix[r][c];
            if (val == target) {
                return Arrays.asList(r, c);
            } else if (val > target) {
                c--; // move left
            } else {
                r++; // move down
            }
        }

        return Arrays.asList(-1, -1);
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {3, 4, 7, 9},
            {12, 13, 16, 18},
            {20, 21, 23, 29}
        };

        int target = 21;

        List<Integer> ans = function(matrix, target);
        System.out.println(ans);
    }
}
