import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> tuples = new ArrayList<Integer>();
        s = s.substring(2, s.length() - 2).replace("},{","-");
        String[] sr= s.split("-");
        Arrays.sort(sr, (s1, s2) -> s1.length() - s2.length());
        
        for(int i = 0; i < sr.length; i++){
            if(sr[i].contains(",")){
                String [] tmp = sr[i].split(",");
                for(int j = 0; j < tmp.length; j++){
                    int n = Integer.parseInt(tmp[j]);
                    if(!tuples.contains(n)){
                        tuples.add(n);
                    }
                }
            }else{
                tuples.add(Integer.parseInt(sr[i]));
            }
        }
        int [] answer = new int [tuples.size()];
        int k = 0;
        for(int n : tuples){
            answer[k++] = n;
        }
        return answer;
    }
}