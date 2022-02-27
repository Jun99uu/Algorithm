import java.util.ArrayList;

class Solution {
    static long answer = Long.MIN_VALUE;
    //숫자 담을 리스트와 연산자 담을 리스트
    static ArrayList<Long> numbers = new ArrayList<Long>();
    static ArrayList<Character> operator = new ArrayList<Character>();
    //연산자와 연산자 순열 넣을 배열
    static char [] ops = {'+', '-', '*'};
    static char [] seq = new char[3];
    static boolean [] check = new boolean[3];
    
    public long solution(String expression) {
        String num = "";
        for (int i = 0; i < expression.length(); i++){
            char tmp = expression.charAt(i);
            if(tmp == '+' || tmp == '-' || tmp == '*'){
                operator.add(tmp);
                numbers.add(Long.parseLong(num));
                num = "";
            }else{
                num += tmp;
            }
        }
        numbers.add(Long.parseLong(num)); //마지막 숫자 넣기
        dfs(0, new char[3]);
        return answer;
    }
    
    public static Long calc(Long num1, Long num2, char op){
        long num = 0;
        switch (op){
            case '+' : {
                return num1 + num2;
            }
            case '-' : {
                return num1 - num2;
            }
            case '*' : {
                return num1 * num2;
            }
        }
        return num;
    }
    
    public static void dfs(int count, char [] p){
        if(count == 3){
            ArrayList<Long> cNums = new ArrayList<>(numbers);
            ArrayList<Character> cOps = new ArrayList<Character>(operator);
            
            for(int i = 0; i < p.length; i++){
                for(int j = 0; j < cOps.size(); j++){
                    if(p[i] == cOps.get(j)){
                        Long res = calc(cNums.remove(j), cNums.remove(j), p[i]);
                        cNums.add(j,res);
                        cOps.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(cNums.get(0)));
            return;
            
        }
        
        for(int i = 0; i < 3; i++){
            if(!check[i]){
                check[i] = true;
                p[count] = ops[i];
                dfs(count+1, p);
                check[i] = false;
            }
        }
    }
}