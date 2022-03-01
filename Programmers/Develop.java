import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> speedque = new LinkedList<>();
		Queue<Integer> answer = new LinkedList<>();
        
        //큐에 값 넣기
		for(int i = 0; i < progresses.length; i++) {
			queue.add(progresses[i]);
			speedque.add(speeds[i]);
		}
		
		for(int days = 1; queue.size() > 0; days++) {
			if(queue.peek() >= 100) {
				int num = 0;
				while(queue.peek() >= 100) {
					queue.poll();
					speedque.poll();
					num++;
					if(queue.isEmpty())
						break;
				}
				answer.add(num);
			}else {
				for(int i = 0; i < queue.size(); i++) {
					int spd = speedque.poll();
					int tmp = queue.poll() + spd;
					speedque.add(spd);
					queue.add(tmp);
				}
			}
		}
        
        int size = answer.size();
        int [] arr = new int [size];
        
        for(int i = 0; i < size; i++){
            arr[i] = answer.poll();
        }
        
        return arr;
    }
}