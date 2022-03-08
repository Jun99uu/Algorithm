import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String [] str = s.split("");
        String answers = "";
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        String numbers = "0123456789";
        String tmp = "";
        for(int i = 0; i < str.length; i++){
            if(numbers.contains(str[i])){
                //현재 포인터가 숫자일 경우
                answers += str[i];
            }else{
                //현재 포인터가 문자인 경우
                tmp += str[i];
                if(map.containsKey(tmp)){
                    answers += map.get(tmp);
                    tmp = "";
                }
            }
        }
            
        
        answer = Integer.parseInt(answers);
        return answer;
    }
}