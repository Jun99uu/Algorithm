import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < clothes.length; i++) {
			if(map.containsKey(clothes[i][1])) {
				int tmp = map.get(clothes[i][1]) + 1;
				map.put(clothes[i][1], tmp);
			}else {
				map.put(clothes[i][1], 1);
			}
		}
		
//이 아래 반복문을 참고한건데.... 솔직히 왜 아직도 이게 되는지 모르겟음 왜지?
//아 상연이형꺼 보고 이해함... 안입는 경우 1개를 추가해서 곱해주는거구나 오엠지 . ..하 
		for (String key : map.keySet()) {
			answer *= (map.get(key) + 1);
		}	
		answer -= 1;

		System.out.println(answer);
        return answer;
    }
}