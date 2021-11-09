import java.util.Scanner;

public class recmake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] x = new int[3];
		int [] y = new int[3];
		int num_x = 0;;
		int num_y = 0;;
		int need_x = 0;
		int need_y = 0;
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				if(x[i] == x[j])
					num_x++;
			}
			if(num_x == 1) {
				need_x = x[i];
				break;
			}
			num_x = 0;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				if(y[i] == y[j])
					num_y++;
			}
			if(num_y == 1) {
				need_y = y[i];
				break;
			}
			num_y = 0;
		}
		
		System.out.println(need_x + " " + need_y);
		
	}

}
