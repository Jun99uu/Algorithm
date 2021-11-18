import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CoutingSort {

	static int [] arr;
	static int [] counting;
	static int [] result;
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		result = new int[n];
		int max = 0;
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i])
				max = arr[i];
		}
		br.close();
		//과정1. array를 순회하며 counting 배열 만들기
		max += 1;
		counting = new int[max];
		for(int i = 0; i<n; i++) {
			counting[arr[i]]++;
		}
		//과정2. 누적합 구하기
		for(int i = 1; i<max; i++) {
			counting[i] += counting[i-1];
		}
		//과정3. 정렬
		sort(n);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++)
			sb.append(result[i]+"\n");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	
	public static void sort(int n) {
		for(int i = n-1; i >= 0; i--) {
			counting[arr[i]]--;
			result[counting[arr[i]]] = arr[i];
		}
	}
}
