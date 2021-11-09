import java.util.Scanner;

public class acm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t; 
		int floor, room;
		
		t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			if(n%h == 0) {
				floor = h * 100;
				room = n/h;
			}else {
				floor = (n%h) * 100;
				room = n / h + 1;
			}
			
			
			
			System.out.println(floor + room);
		}
	}

}
