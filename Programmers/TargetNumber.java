class Solution {
    int exp = 0;
    int t;
    public int solution(int[] numbers, int target) {
        t = target;
        dfs(numbers[0], numbers, 1);
        dfs(numbers[0] * (-1), numbers, 1);
        int answer = exp;
        return answer;
    }
    
    public void dfs(int sum, int [] numbers, int i){
        if(i == numbers.length){
            if(sum == t)
                exp++;
        }else{
            int cur = numbers[i];
            int valuef = sum + cur;
            int values = sum - cur;
            dfs(valuef, numbers, i+1);
            dfs(values, numbers, i+1);
        }
    }
}