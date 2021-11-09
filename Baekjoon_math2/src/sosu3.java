import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sosu3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[max+1];
		check[0] = check[1] = true;
		//에라토스테네스의 체
		for(int i = 2; i <= max; i++) {
			if(check[i] == true)
				continue;
			for(int j = i + i; j <= max; j = j + i) {
				check[j] = true;
			}
		}
		for(int i = min; i<=max; i++) {
			if(check[i] == false) {
				bw.write(i + "\n");
				bw.flush();
			}
		}
	}

}
