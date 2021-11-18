import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class statistics {
	static int [] number;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		number = new int[n];
		int max = 0;
		for(int i = 0; i<n; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(number);
		StringBuilder sb = new StringBuilder();
		sb.append(mean() + "\n");
		sb.append(median(n) + "\n");
		sb.append(mode()+"\n");
		sb.append(range(n));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	public static int mean() {
		double sum = 0;
		int n = number.length;
		for(int i = 0; i < n; i++) {
			sum += (double)number[i];
		}
		int m = (int) Math.round(sum/n);
		return m;
	}

	public static int median(int n) {
		return number[n/2];
	}
	
	public static int mode() {
		int [] max = new int[3]; //첫번째에는 개수, 두번째에는 토큰, 세번째에는 해당 값
		int count = 0;
		for(int i = 0; i < number.length; i++) {
			if(i>0) { //한번 검사했으면 pass
				if(number[i] == number[i-1])
					continue;
			}
			
			for(int j = 0; j<number.length; j++) {
				if(number[i] == number[j])
					count++;
			}
			if(max[0]<count) {
				max[0] = count;
				max[1] = 0;
				max[2] = number[i];
			}else if(max[0] == count && max[1] == 0){
				max[1] = 1;
				max[2] = number[i];
			}
			count = 0;
		}
		return max[2];
	}
	
	
	public static int range(int n) {
		return (number[n-1] - number[0]);
	}
}
