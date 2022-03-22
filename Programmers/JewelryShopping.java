import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int [2];
        Queue<String> q = new LinkedList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        
        int start = 0;
        int end = Integer.MAX_VALUE;
        int startPoint = 0;

        HashSet<String> type = new HashSet<String>();
        for(int i = 0; i < gems.length; i++){
            type.add(gems[i]);
        }
        int type_num = type.size(); //종류 몇가지인지
        
        for(int i = 0; i < gems.length; i++) {
            hm.put(gems[i], hm.getOrDefault(gems[i], 0) + 1);
            
            q.add(gems[i]);
            
            while(true) {
                String temp = q.peek();
                if(hm.get(temp) > 1) {
                    q.poll();
                    start++;
                    hm.put(temp, hm.get(temp) -1);
                }else {
                    break;
                }
            }
            if(hm.size() == type_num && end > q.size()) {
                end = q.size();
                startPoint = start;
            }
            
        }
        return new int[] {startPoint+1, startPoint+ end };
    }
}