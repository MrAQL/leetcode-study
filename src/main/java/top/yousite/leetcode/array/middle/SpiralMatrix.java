package java.top.yousite.leetcode.array.middle;

public class SpiralMatrix {
    /**
     * 54. 螺旋矩阵
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if (matrix.length < 1) return spiral;
        int m = matrix.length, n = matrix[0].length;
        int u = 0, d = m - 1, l = 0, r = n - 1, k = 0;
        while (true) {
            // up
            for (int col = l; col <= r; col++) spiral.add(k++, matrix[u][col]);
            if (++u > d) break;
            // right
            for (int row = u; row <= d; row++) spiral.add(k++, matrix[row][r]);
            if (--r < l) break;
            // down
            for (int col = r; col >= l; col--) spiral.add(k++, matrix[d][col]);
            if (--d < u) break;
            // left
            for (int row = d; row >= u; row--) spiral.add(k++, matrix[row][l]);
            if (++l > r) break;
        }
        return spiral;

    }
}
