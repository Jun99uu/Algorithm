class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long ww = Long.valueOf(w);
        long hh = Long.valueOf(h);
        long gcd = uclid(ww, hh);
        answer = ww * hh - ( ww + hh - gcd );
        return answer;
    }
    
    public long uclid(long a, long b){
        long x = Math.max(a,b);
        long y = Math.min(a,b);
        
        while(x % y != 0){
            long r = x % y;
            x = y;
            y = r;
        }
        
        return y;
    }
}