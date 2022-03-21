import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int max = 0;
        for (int i = 0; i < truck_weights.length; i++){
            while(true){
                if(bridge.isEmpty()){
                    bridge.add(truck_weights[i]);
                    max += truck_weights[i];
                    answer++;
                    break;
                }else if(bridge.size() == bridge_length){
                    max -= bridge.poll();
                }else{
                    if(max + truck_weights[i] <= weight){
                        bridge.add(truck_weights[i]);
                        max += truck_weights[i];
                        answer++;
                        break;
                    }else{
                        bridge.add(0);
                        answer++;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}