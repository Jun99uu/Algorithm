import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i <= s.length() / 2; i++){
            int depth = 1;
            String zip = s.substring(0, i);
            StringBuilder sb = new StringBuilder();
            
            for(int j = i; j <= s.length(); j += i){
                String next = s.substring(j, j+i > s.length() ? s.length() : i+ j);
                if(zip.equals(next)) depth++;
                else{
                    sb.append((depth != 1 ? depth : "") + zip);
                    zip = next;
                    depth = 1;
                }
            }
            sb.append(zip);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}