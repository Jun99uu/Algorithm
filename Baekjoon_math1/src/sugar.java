import java.util.Scanner;

public class sugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum=n;
		int b = 0, s = 0;
		
		while(true) {
			if(sum%5 == 0) {
				b = sum/5;
				System.out.println(b+s);
				break;
			}
			else {
				sum -= 3;
				s++;
			}
			if(sum < 0) {
				System.out.println("-1");
				break;
			}
		}
		
	}

}
