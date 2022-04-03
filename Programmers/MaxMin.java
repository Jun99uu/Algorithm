class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split(" ");
        int [] numbers = new int [str.length];
        
        for(int i = 0; i < str.length; i++){
            numbers[i] = Integer.parseInt(str[i]);
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < numbers.length; i++){
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        
        answer = min + " " + max;
        return answer;
    }
}