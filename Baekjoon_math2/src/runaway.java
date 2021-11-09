import java.util.Scanner;

public class runaway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int small_y = y;
		int small_x = x;
		
		if(y > h/2)
			small_y = h-y;
		if(x > w/2)
			small_x = w-x;
		
		if(small_y < small_x)
			System.out.println(small_y);
		else
			System.out.println(small_x);
	}

}
