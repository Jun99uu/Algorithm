import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        Solution sol = new Solution();
        return sol.solve(numbers);
    }
    
    public boolean isPrime(int num){
        if(num == 0 || num == 1){
            //0과 1은 소수가 아님
            return false;
        }
        
        //에라토스테네스의 체
        int lim = (int)Math.sqrt(num);
        for(int i = 2; i<=lim; i++){
            if(num%i == 0){
                return false;
            }
        }
        
        //통과
        return true;
    }
    
    public void recursive(String comb, String others){
        if(!comb.equals("")){
            //완성된 조합 set에 넣어서 중복처리
            set.add(Integer.valueOf(comb));
        }
        for(int i = 0; i<others.length(); i++){
            recursive(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
    }
    
    public int solve(String numbers){
        recursive("", numbers);
        
        int count = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int number = it.next();
            if(isPrime(number)){
                count++;
            }
        }
        return count;
    }
}