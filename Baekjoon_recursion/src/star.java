import java.util.Scanner;

public class star {
	static char[][] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		arr = new char[n][n];
		
		starmaker(0,0,n,false);
		
		StringBuilder sb = new StringBuilder(); //���ڿ� �̾���
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	static void starmaker(int x, int y, int n, boolean blank) {
		//�����ϰ��
		if(blank) {
			for(int i = x; i<x + n; i++) {
				for(int j=y; j<y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		//���̻� �ɰ��� �� ���� ��
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				count ++;
				if(count == 5){ // ����ĭ�϶�
					starmaker(i, j , size, true);
				}else {
					starmaker(i, j, size, false);
				}
			}
		}
	}

}
