class Solution {
    public int solution(int n) {
        if(n==1 || n==2){
            return 1;
        }
        
        int prev = 1;
        int next = 1;
        int answer = 0;
        for (int i = 3; i <= n; i++){
            answer = (prev+ next) % 1234567;
            prev = next;
            next = answer;
        }
        return answer;
    }
}