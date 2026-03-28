import java.util.Stack;

public class MaximalRectangle {

    // Largest Rectangle in Histogram
    static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {

                int height = heights[stack.pop()];
                int nse = i;
                int pse = stack.isEmpty() ? -1 : stack.peek();

                int width = nse - pse - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {

            int height = heights[stack.pop()];
            int nse = n;
            int pse = stack.isEmpty() ? -1 : stack.peek();

            int width = nse - pse - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    // Maximal Rectangle in Binary Matrix
    static int maximalRectangle(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int maxAns = 0;

        int[] height = new int[m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1)
                    height[j] += 1;
                else
                    height[j] = 0;
            }

            maxAns = Math.max(maxAns, largestRectangleArea(height));
        }

        return maxAns;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        System.out.println("Maximal Rectangle Area = " + maximalRectangle(matrix));
    }
}
