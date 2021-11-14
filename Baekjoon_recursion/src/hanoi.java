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
		//이동할 원반의 수가 1개라면?
		if (n ==1){
			sb.append(start + " " + to + "\n");
			return;
		}
		
		//n-1개를 a에서 b로 이동
		move(n-1, start, to, mid);
		
		//1개를 a에서 c로 이동
		sb.append(start+ " " + to + "\n");
		
		//n-1개를 b에서 c로 이동
		move(n-1,mid, start, to);
	}

}
