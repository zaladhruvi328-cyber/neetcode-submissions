class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows =new HashSet[9];
        Set<Character>[] cols =new HashSet[9];
        Set<Character>[] boxes =new HashSet[9];

        for(int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i =0;i<9;i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[i][j]!='.')
                {
                    char data = board[i][j];
                    int boxIndex = (i/3)*3+(j/3);
                    if(rows[i].contains(data) ||
                   cols[j].contains(data) ||
                   boxes[boxIndex].contains(data))
                        return false;
                    else
                    {
                        rows[i].add(data);
                        cols[j].add(data);
                        boxes[boxIndex].add(data);
                    }
                    
                }
            }
        }
        return true;
    }
}
