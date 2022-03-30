import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5}; //5
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        int first_score = 0;
        int second_score = 0;
        int third_score = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == first[i%5]) first_score++;
            if(answers[i] == second[i%8]) second_score++;
            if(answers[i] == third[i%10]) third_score++;
        }
        int[] scores = {first_score, second_score, third_score};
        int[] arr = {first_score, second_score, third_score};
        Arrays.sort(arr);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(scores[i] == arr[2]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}