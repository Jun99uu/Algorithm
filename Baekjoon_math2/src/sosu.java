import java.util.Scanner;

public class sosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int number;
		int notsosu = 0;
		
		for(int i = 0; i < n ; i++) {
			number = sc.nextInt();
			if(number == 1)
				notsosu++;
				else{
				for(int j = 2; j<number; j++) {
					if(number%j == 0) {
						notsosu++;
						break;
					}
				}
			}
		}
		
		System.out.println(n-notsosu);
	}

}
