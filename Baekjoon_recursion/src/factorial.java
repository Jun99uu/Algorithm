import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		if(a>0) {
			for(int i = 1; i <= a; i++) {
				b *= i;
			}
		}
		System.out.println(b);
	}

}
