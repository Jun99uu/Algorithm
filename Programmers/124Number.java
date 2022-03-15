class Solution {
    public String solution(int n) {
        String answer = "";
        int rem = 99;
        while(n > 0){
            rem = n % 3;
            if(rem == 0){
                n -= 1;
            }
            n = n / 3;
            
            if(rem != 0){
                answer = Integer.toString(rem) + answer;
            }else{
                answer = Integer.toString(4) + answer;
            }
        }
        return answer;
    }
}