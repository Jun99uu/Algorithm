import java.util.Scanner;

public class chess_clean {

	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'W')
					arr[i][j] = true;
				else
					arr[i][j] = false;
				
			}
		}
		
		for (int i = 0; i < N - 7; i++) {
			for(int j = 0; j < M - 7; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}

	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y]; //첫 칸 색
		
		for(int i=x; i<end_x; i++) {
			for(int j=y; j<end_y; j++) {
				if(arr[i][j] != TF) {
					count++;
				}
				TF = (!TF);
			}
			TF = !TF;
		}
		
		count = Math.min(count, 64 - count); //첫번째칸과 반대로 했을 때 최소색상
		
		min = Math.min(min, count);
	}
}
