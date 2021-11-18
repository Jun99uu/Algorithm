import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OlderSort {
	
	static String [][] member;

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		member = new String[n][2];
		
		for(int i = 0; i<n; i++) {
			member[i][0] = sc.next();
			member[i][1] = sc.next();
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int n1 = Integer.parseInt(o1[0]);
				int n2 = Integer.parseInt(o2[0]);
				if(n1 > n2) {
					return 1;
				}else if(n1 == n2) {
					return 0;
				}else {
					return -1;
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			sb.append(member[i][0] +" "+ member[i][1] + "\n");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
