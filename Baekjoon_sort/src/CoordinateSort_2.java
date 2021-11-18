import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateSort_2 {

	static int [][] coordinate;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coordinate = new int[n][2];
		for(int i = 0; i<n; i++) {
			coordinate[i][0] = sc.nextInt();
			coordinate[i][1] = sc.nextInt();
		}
		
		Arrays.sort(coordinate, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			sb.append(coordinate[i][0] + " " + coordinate[i][1] + "\n");
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
