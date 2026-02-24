class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> findDuplicate = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    String rowKey = board[i][j] + " in row " + i;
                    String colKey = board[i][j] + " in col " + j;
                    String boxKey = board[i][j] + " in box " + (i/3) + "-" + (j/3);
                    
                    if(!findDuplicate.add(rowKey)||
                        !findDuplicate.add(colKey)||
                        !findDuplicate.add(boxKey)) return false;
                }
            }
        }
        return true;
    }
}