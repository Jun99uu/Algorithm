import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
				//무게 오름차순 정렬
        Arrays.sort(people);
        
				//가장 가벼운 사람의 IDX
        int small = 0;
				//가장 무거운 사람의 IDX
        for(int big = people.length - 1; small <= big; big--){
            if(people[big]+people[small] <= limit){
								//합해서 limit보다 작으면 그 다음 가벼운 사람의 IDX로
                small++;
            }
						//합해서 limit보다 크면 무거운 사람 혼자 보내고, 그 다음 무거운 사람 IDX로
            answer++;
        }
        
        return answer;
    }
}