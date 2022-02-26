class Solution
{
    public int solution(int [][]board)
    {
        int answer = 1234;
        int col = board.length;
        int row = board[0].length;
        int left = 0, up = 0, dia = 0;
        int tmp = 0;
        int max = board[0][0];
        
        for(int i = 1; i < col; i++){
            for(int j = 1; j < row; j++){
                left = board[i][j-1];
                up = board[i-1][j];
                dia = board[i-1][j-1];
                if(board[i][j] == 0){
                    continue;
                }else if(left != 0 && up != 0 && dia != 0){
                    tmp = Math.min(left, Math.min(up, dia)) + 1;
                    board[i][j] = tmp;
                }
                max = Math.max(max, board[i][j]);
            }
        }
        
        answer = max * max;
        
        return answer;
    }
}