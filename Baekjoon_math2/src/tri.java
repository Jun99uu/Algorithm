import java.util.Scanner;

public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int x,y,z; // z가 제일큰거임
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a==0 && b==0 && c==0)
				break;
			
			if(a>b)
				if(c>a) {
					z = c;
					y = a;
					x = b;
				}
				else {
					z = a;
					y = b;
					x = c;
				}
			else
				if(c>b) {
					z = c;
					y = a;
					x = b;
				}
				else {
					z = b;
					y = a;
					x = c;
				}
			
			if(z*z == x*x + y*y)
				System.out.println("right");
			else
				System.out.println("wrong");
			
		}
	}

}
