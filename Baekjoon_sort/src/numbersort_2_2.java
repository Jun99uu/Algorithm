import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class numbersort_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}

}
