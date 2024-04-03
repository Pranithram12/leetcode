class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if ( board[r][c] == word.charAt(0) ) {
                    boolean found = dfs(board, r, c, word, 0);
                    if (found) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int r, int c, String word, int wordindex) {
        // Base case
        if (wordindex == word.length()) {
            return true;
        }

        // Out of bound cases
        int row = board.length;
        int col = board[0].length;
        if (r < 0 || c < 0 || r >= row || c >= col) {
            return false;
        }

        // Invalid cases
        if (board[r][c] != word.charAt(wordindex)) {
            return false;
        }

        // Marked as visited
        char ch = board[r][c];
        board[r][c] = ' ';

        // DFS calls
        if (dfs(board, r - 1, c, word, wordindex + 1) || // check upper element
            dfs(board, r, c + 1, word, wordindex + 1) || // check right
            dfs(board, r + 1, c, word, wordindex + 1) || // check bottom
            dfs(board, r, c - 1, word, wordindex + 1)) { // check left
            return true;
        }

        // Backtracking
        board[r][c] = ch;
        return false;
    }
}
