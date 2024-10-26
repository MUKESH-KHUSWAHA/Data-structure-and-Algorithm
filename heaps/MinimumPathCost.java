public class MinimumPathCost {

    public static int minPathCost(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Create a 2D array to store the minimum cost to reach each cell
        int[][] cost = new int[rows][cols];
        
        // Initialize the cost array with infinity for all cells except the starting cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cost[i][j] = Integer.MAX_VALUE;
            }
        }
        cost[0][0] = grid[0][0];
        
        // Process each cell to update the cost of reaching adjacent cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Move right
                if (j + 1 < cols) {
                    cost[i][j + 1] = Math.min(cost[i][j + 1], cost[i][j] + grid[i][j + 1]);
                }
                // Move down
                if (i + 1 < rows) {
                    cost[i + 1][j] = Math.min(cost[i + 1][j], cost[i][j] + grid[i + 1][j]);
                }
            }
        }
        
        // The bottom-right cell contains the minimum cost to reach there
        return cost[rows - 1][cols - 1];
    }
    
    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        System.out.println(minPathCost(grid));  // Output: 7
    }
}
