import java.util.Scanner;

public class big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] big = new int [n][2];
		for(int i = 0; i < n; i++) {
			big[i][0] = sc.nextInt();
			big[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(i == j)
					continue;
				else {
					if(big[i][0]<big[j][0] && big[i][1]<big[j][1])
						rank++;
				}
			}
			
			System.out.println(rank);
		}
		
		
	}

}