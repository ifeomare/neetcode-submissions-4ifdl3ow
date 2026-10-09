class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Integer>> rowMap = new HashMap<>(); // row traversal
        Map<Integer, List<Integer>> colMap = new HashMap<>(); // column traversal
        Map<Integer, List<Integer>> boardMap = new HashMap<>(); // board traversal

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] != '.') {
                    int value = board[row][col] - '0';
                    System.out.println(!rowMap.containsKey(row) + "" + row + "" + col);
                    if (!rowMap.containsKey(row) || !colMap.containsKey(col) || !boardMap.containsKey((row/3)*3+(col/3))) {
                        rowMap.computeIfAbsent(row, v -> new ArrayList<>());
                        colMap.computeIfAbsent(col, v -> new ArrayList<>());
                        boardMap.computeIfAbsent((row / 3) * 3 + (col/3), v -> new ArrayList<>());
                    }
                    if (!rowMap.get(row).contains(value) &&
                        !colMap.get(col).contains(value) &&
                        !boardMap.get((row/3)*3+(col/3)).contains(value)) {
                        // get: add int, default: new arraylist
                       rowMap.computeIfPresent(row, (k, v) -> {
                            v.add(value);
                            return v;
                        });
                       colMap.computeIfPresent(col, (k, v) -> {
                            v.add(value);
                            return v;
                        });
                       boardMap.computeIfPresent((row / 3) * 3 + (col / 3), (k, v) -> {
                            v.add(value);
                            return v;
                        });
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
