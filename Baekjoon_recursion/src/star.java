import java.util.Scanner;

public class star {
	static char[][] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		arr = new char[n][n];
		
		starmaker(0,0,n,false);
		
		StringBuilder sb = new StringBuilder(); //문자열 이어줌
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	static void starmaker(int x, int y, int n, boolean blank) {
		//공백일경우
		if(blank) {
			for(int i = x; i<x + n; i++) {
				for(int j=y; j<y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		//더이상 쪼갤ㄹ 수 없을 때
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				count ++;
				if(count == 5){ // 공백칸일때
					starmaker(i, j , size, true);
				}else {
					starmaker(i, j, size, false);
				}
			}
		}
	}

}
