class Solution {
    
    public boolean isSafe(int[][] maze, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || visited[i][j]) return false;

        return maze[i][j] == 1;
    }

    public void maze(int[][] maze, int i, int j, String path, ArrayList<String> ans, boolean[][] visited) {
        
        if(i == maze.length-1 && j == maze[0].length-1) {
            ans.add(path);
            return;
        }
        
        visited[i][j] = true;
        
        // Down
        if (isSafe(maze, i+1, j, visited)) {
            maze(maze, i+1, j, path+"D", ans, visited);
        }
        
        // Left
        if (isSafe(maze, i, j-1, visited)) {
            maze(maze, i, j-1, path+"L", ans, visited);
        }
        
        // Right
        if (isSafe(maze, i, j+1, visited)) {
            maze(maze, i, j+1, path+"R", ans, visited);
        }
        
        // Up
        if (isSafe(maze, i-1, j, visited)) {
            maze(maze, i-1, j, path+"U", ans, visited);
        }
        
        visited[i][j] = false;
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        
        // to check (0,0) is 0
        if (maze == null || maze.length == 0 || maze[0][0] == 0) {
            return ans;
        }
        
        maze(maze, 0, 0, "", ans, visited);
        
        return ans;
    }
}