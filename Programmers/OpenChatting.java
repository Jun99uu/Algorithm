import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> uid = new ArrayList<String>();
        ArrayList<String> el = new ArrayList<String>();
        HashMap<String, String> name = new HashMap<>();
        
        for(int i = 0; i < record.length; i++){
            String [] infor = record[i].split(" ");
            if(infor[0].equals("Enter")){
                uid.add(infor[1]);
                el.add(infor[0]);
                name.put(infor[1], infor[2]);
            }else if(infor[0].equals("Leave")){
                uid.add(infor[1]);
                el.add(infor[0]);
            }else if(infor[0].equals("Change")){
                name.put(infor[1], infor[2]);
            }
        }
        
        String [] answer = new String[uid.size()];
        
        for(int i = 0; i < uid.size(); i++){
            String curName = name.get(uid.get(i));
            String curEl = "";
            if(el.get(i).equals("Enter")){
                curEl = "님이 들어왔습니다.";
            }else{
                curEl = "님이 나갔습니다.";
            }
            answer[i] = curName + curEl;
        }
        return answer;
    }
}