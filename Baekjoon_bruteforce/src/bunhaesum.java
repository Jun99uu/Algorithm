import java.util.Scanner;

public class bunhaesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int N_len = N.length();
		int number = Integer.parseInt(N);
		
		int min = number - (9 * N_len);
		int result = 0;
		
		for(int i = min; i < number; i++) {
			int tmp = i;
			int sum = 0;
			
			while(tmp != 0) {
				sum += tmp%10;
				tmp /= 10;
			}
			
			if(sum + i == number) {
				result = i;
				break;
			}
			
		}
		System.out.println(result);
	}

}
