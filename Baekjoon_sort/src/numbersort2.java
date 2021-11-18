import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class numbersort2 {
	public static int[] arr; // 메인 배열
	public static int[] tmp; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		arr = new int[n];
		tmp = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		bf.close();
		
		merge(0, arr.length-1);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			sb.append(arr[i]+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	public static void mergesort(int start, int end) {
		int mid = (start+end) / 2;
		int a = start;
		int b = mid + 1;
		int adr = start;
		
		while(a <= mid && b <= end) {
			if(arr[a] <= arr[b]){
				tmp[adr] = arr[a];
				adr++;
				a++;
			}else {
				tmp[adr] = arr[b];
				adr++;
				b++;
			}
		}
		if(a>mid) {
			while(b<=end) {
				tmp[adr] = arr[b];
				adr++;
				b++;
			}
		}else {
			while(a<=mid) {
				tmp[adr] = arr[a];
				adr++;
				a++;
			}
		}
		
		for(int i = start; i<=end; i++) {
			arr[i] = tmp[i];
		}
	}
	
	
	public static void merge(int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			merge(start , mid);
			merge(mid+1, end);
			
			mergesort(start, end);
		}
	}
}
