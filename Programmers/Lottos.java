import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        ArrayList<Integer> win_List = new ArrayList<Integer>();
        int max, num = 0, zero = 0;
        
        for(int i = 0; i < 6; i++){
            win_List.add(win_nums[i]);
        }
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0) zero++;
            else if(win_List.contains(lottos[i])) num++;
        }
        
        max = num + zero;
        int [] rank  = {6, 6, 5, 4, 3, 2, 1};
        answer[0] = rank[max];
        answer[1] = rank[num];
        
        return answer;
    }
}