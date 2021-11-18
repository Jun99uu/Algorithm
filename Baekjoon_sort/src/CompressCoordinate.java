import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompressCoordinate {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] number = new int [n];
		for(int i = 0; i<n; i++) {
			number[i] = sc.nextInt();
		}
		
		int [] sortnum = number.clone();
		Arrays.sort(sortnum);
		
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int x : sortnum)
			if(!map.containsKey(x))
				map.put(x, idx++);
		
		StringBuilder sb = new StringBuilder();
		for(int x : number) {
			sb.append(map.get(x)).append(" ");
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
