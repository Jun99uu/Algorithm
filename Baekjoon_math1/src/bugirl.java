import java.util.Scanner;

public class bugirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int k = sc.nextInt(); //Ãþ
			int n = sc.nextInt(); //È£
			int[][] apart = new int[k+1][n+1]; //apart[k][n]±¸ÇØ¾ßµÊ
			for(int j=0; j<n+1; j++) {
				apart[0][j] = j;
			}
			for(int j=0; j<k+1; j++) {
				apart[j][1] = 1;
			}
			
			for(int p=1; p<k+1; p++) {
				for(int q=2; q<n+1; q++) {
					apart[p][q] = apart[p][q-1] + apart[p-1][q];
				}
			}
			
			System.out.println(apart[k][n]);
		}
	}

}
