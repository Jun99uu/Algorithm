import java.util.Scanner;

public class alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int distance = y-x;
			int max = (int)Math.sqrt(distance);
			
			if(max == Math.sqrt(distance))
				System.out.println(2 * max - 1);
			else if(distance <= max * max  + max)
				System.out.println(2 * max);
			else
				System.out.println( 2 * max + 1);
		}
	}

}
