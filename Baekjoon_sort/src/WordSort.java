import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class WordSort {
	
	static String [] wordlist;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		wordlist = new String[n];
		for(int i = 0; i<n; i++) {
			wordlist[i] = br.readLine();
		}
		br.close();
		Arrays.sort(wordlist, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 1;
				}else if(o1.length() < o2.length()) {
					return -1;
				}else {
					return o1.compareTo(o2);
				} //clean하게 하면 위에 두개 빼고 o1.length() - o2.length()
			}
		});
		
		//람다식 사용
//		Arrays.sort(wordlist, (e1, e2) -> {
//			if(e1.length() > e2.length()) {
//				return 1;
//			}else if(e1.length() < e2.length()) {
//				return -1;
//			}else {
//				return e1.compareTo(e2);
//			}
//		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			if(i != 0 && wordlist[i].equals(wordlist[i-1])) {
				continue;
			}
			sb.append(wordlist[i] + "\n");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
