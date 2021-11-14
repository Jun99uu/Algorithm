import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] fibonacci = new int[n+1];
		if(n>=0) {
			fibonacci[0] = 0;
			if(n>=1) {
				fibonacci[1] = 1;
				for(int i=2; i<n+1; i++) {
					fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
				}
			}
			
		}
		
		System.out.println(fibonacci[n]);
	}

}
