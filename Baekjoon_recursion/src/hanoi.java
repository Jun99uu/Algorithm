import java.util.Scanner;

public class hanoi {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sb.append((int)(Math.pow(2,n)-1)).append('\n');
		
		move(n,1,2,3);
		System.out.println(sb);
		
	}
	
	public static void move(int n,int start, int mid, int to) {
		//�̵��� ������ ���� 1�����?
		if (n ==1){
			sb.append(start + " " + to + "\n");
			return;
		}
		
		//n-1���� a���� b�� �̵�
		move(n-1, start, to, mid);
		
		//1���� a���� c�� �̵�
		sb.append(start+ " " + to + "\n");
		
		//n-1���� b���� c�� �̵�
		move(n-1,mid, start, to);
	}

}
