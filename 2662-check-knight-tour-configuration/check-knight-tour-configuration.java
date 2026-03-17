class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        int row = 0;
        int col = 0;
        if(grid[0][0] != 0) return false;
        for(int step = 1; step < n * n; step++) {
            boolean found = false;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(grid[i][j] == step) {
                        int dx = Math.abs(i - row);
                        int dy = Math.abs(j - col);
                        if((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
                            row = i;
                            col = j;
                            found = true;
                            break;
                        } else {
                            return false;
                        }
                    }
                }
                if(found) break;
            }
        }
        return true;
    }
}