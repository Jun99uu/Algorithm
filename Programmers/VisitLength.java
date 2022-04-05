import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        ArrayList<String> v = new ArrayList<String>();
        
        for(int i = 0; i < dirs.length(); i++){
            int tmpx = x;
            int tmpy = y;
            
            char s = dirs.charAt(i);
            
            if(s == 'U' && y < 5) y++;
            else if(s == 'D' && y > -5) y--;
            else if(s == 'R' && x < 5) x++;
            else if(s == 'L' && x > -5) x--;
            
            String move = Integer.toString(x);
            move += Integer.toString(y);
            String tmpmove = Integer.toString(tmpx);
            tmpmove += Integer.toString(tmpy);
            
            String p = move + tmpmove;
            String q = tmpmove + move;
            
            if(!v.contains(move) && !v.contains(q) && !p.equals(q)){
                v.add(p);
                v.add(q);
            }
        }
        
        answer = v.size() / 2;
        return answer;
    }
}