class Solution {
    public boolean isValidSudoku(char[][] board) {

        // rows[i][num] → number already exists in row i
        // cols[j][num] → number already exists in column j
        // boxes[k][num] → number already exists in 3x3 sub-box k
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                // Skip empty cells
                if (c == '.') continue;

                // Convert '1'–'9' → 0–8 (for indexing)
                int num = c - '1';

                // Find which 3x3 sub-box the cell belongs to
                int boxIndex = (i / 3) * 3 + j / 3;

                // If this number already exists in current row, column, or box → invalid
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num])
                    return false;

                // Mark number as seen in row, column, and box
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        
        return true;
    }
}
