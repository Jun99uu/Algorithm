import java.util.Scanner;

public class sosu_clean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
	
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			if(n==1)
				continue;
			boolean isPrime = true;
			for(int j = 2; j<= Math.sqrt(n); j++) {
				if(n%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				count++;
		}
		
		System.out.println(count);
	}

}
