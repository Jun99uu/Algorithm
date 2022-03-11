class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++){
            int tmp = uclid(answer, arr[i]);
            answer = answer * arr[i] / tmp;
        }
        return answer;
    }
    
    public int uclid(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        
        while(x % y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        
        return y;
    }
}