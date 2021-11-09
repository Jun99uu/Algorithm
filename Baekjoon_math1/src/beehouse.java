import java.util.Scanner;

public class beehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i=1, x=0;
		n = sc.nextInt();
		 
		while(i < n) {
			x++;
			i = i + 6*x;
		}
		
		x += 1;
		System.out.println(x);
	}

}
