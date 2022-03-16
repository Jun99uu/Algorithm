class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer="(None)";
        m = change(m);
        int maxtime = 0;
        
        for(int i = 0; i < musicinfos.length; i++){
            String [] info = musicinfos[i].split(","); //0시작 1끝 2이름 3음계
            info[3] = change(info[3]);
            
            String [] stime = info[0].split(":");
            String [] etime = info[1].split(":");
            int tmpH = Integer.parseInt(etime[0]) - Integer.parseInt(stime[0]);
            int tmpM = Integer.parseInt(etime[1]) - Integer.parseInt(stime[1]) + ( tmpH * 60 );
            
            
            String music = "";
            for(int j = 0; j<tmpM; j++){
                music += info[3].charAt(j%info[3].length());
            }
            
            if(music.contains(m)){
                if(maxtime < music.length()){
                    maxtime = music.length();
                    answer = info[2];
                }
            }
            
        }
        return answer;
    }
    
    public String change(String music){
        music = music.replaceAll("A#", "a");
        music = music.replaceAll("C#", "c");
        music = music.replaceAll("D#", "d");
        music = music.replaceAll("F#", "f");
        music = music.replaceAll("G#", "g");
        music = music.replaceAll("B#", "b");
        music = music.replaceAll("E#", "e");
        return music;
    }
}