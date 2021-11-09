import java.util.Scanner;

public class teret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double distance;
		int x1,y1,r1,x2,y2,r2;
		
		for(int i =0; i<t; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			distance = Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2);
			
			if(x1==x2 && y1==y2 && r1==r2)
				System.out.println("-1");
			else if(distance < Math.pow(r1-r2, 2) || distance > Math.pow(r1+r2,2))
				System.out.println("0");
			else if(distance == Math.pow(r1-r2, 2) || distance == Math.pow(r1+r2, 2))
				System.out.println("1");
			else
				System.out.println("2");
			
		}
	}

}
