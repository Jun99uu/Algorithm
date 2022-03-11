class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        int i = 1;
        while(count != Integer.bitCount(n+i)){
            i += 1;
        }
        
        answer = n + i;
        return answer;
    }
}