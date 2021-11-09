import java.util.Scanner;

public class goldbah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a = 0, b = 0;
		boolean[] check = new boolean[10001];
		check[0]=check[1] = true;
		
		for(int i = 2; i <= 10000; i++) {
			if(check[i] == true)
				continue;
			for(int j = i+i; j<=10000; j = j+i) {
				check[j] = true;
			}
		}
		
		for(int i=0; i<t; i++) {
			int even = sc.nextInt();
			for(int p = 0; p < even / 2; p++) {
				if(check[even/2 - p] == false && check[even/2 + p] == false) {
					a = even/2 - p;
					b = even/2 + p;
					break;
				}
			}
			System.out.println(a + " " + b);
		}
	}
}
