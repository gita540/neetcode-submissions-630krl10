class Solution {
    public int countPaths(int[][] grid) {
  int rows = grid.length;
        int cols = grid[0].length;
        //if the entrance and exist has land then there is no path
        if (grid[0][0] == 1 || grid[rows - 1][cols - 1] == 1) {
            return 0;
        }
 boolean[][] visited = new boolean[rows][cols];
        return dfs(grid, 0, 0, visited);

    }
    public int dfs(int[][] grid, int r, int c,boolean[][] visited){
        if(r <0 ||c <0 || r >= grid.length ||c >= grid[0].length || visited[r][c] || grid[r][c]==1){
            return 0;

        }
        if (r == grid.length-1 && c ==grid[0].length -1){
            return 1;
        }
        visited[r][c]=true;
        int count =0;
        count += dfs(grid, r+1, c, visited);
count += dfs(grid, r-1, c, visited);
count += dfs(grid, r, c+1, visited);
count += dfs(grid, r, c-1, visited);
visited[r][c]= false;
return count;
    }

}
