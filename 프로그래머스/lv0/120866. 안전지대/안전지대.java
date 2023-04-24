class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board[0].length;
        int dx[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        int dy[] = {0, 1, 1, 1, 0, -1, -1, -1};
        int x = 0, y = 0;
        int cnt = 0;
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    cnt++;
                    for(int k = 0; k < 8 ; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                        if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0){                             
                            
                                cnt++;
                                board[nx][ny] = 2;

                        }
                    }
                }
            }    
        }
        
        answer = n * n - cnt;
        return answer;
    }
}