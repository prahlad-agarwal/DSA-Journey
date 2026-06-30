class Solution {

    public void storeNQueens(char[][] board, List<List<String>> ans) {
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }

        ans.add(temp);
        return;
    }

    public boolean isSafe(char[][] board, int row, int col) {
        // top or column check
        for(int i = row-1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal check
        for(int i = row-1, j = col-1; i >= 0 && 0 <= j; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal check
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void NQueens(char[][] board, int row, List<List<String>> ans) {
        if(row == board.length) {
            storeNQueens(board, ans);
            return;
        }

        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                NQueens(board, row+1, ans);
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        NQueens(board, 0, ans);
        return ans;
    }
}