//배열 풀이
class Solution {
    public int[] solution(int[] prices) {
        int [] answer = new int [prices.length];
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] > prices[j]){
                    answer[i] = j-i;
                    break;
                }else if(j == prices.length - 1){
                    answer[i] = j - i;
                }
            }
        }
        answer[prices.length - 1] = 0;
        
        return answer;
    }
}

//스택풀이
import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int [] answer = new int [prices.length];
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        
        return answer;
    }
}