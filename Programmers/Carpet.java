class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int width = 0, height = 0;
        
        for(width = 3; width < sum; width++){
            if(sum % width != 0) continue;
            height = sum/width;
            
            int Y = (width-2) * (height-2);
            if(width >= height && Y == yellow && sum - Y == brown){
                break;
            }
        }
        
        int[] answer = {width, height};
        return answer;
    }
}