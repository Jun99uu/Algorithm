import java.util.Scanner;

public class bunhae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n==1){
		}else if(n==2) {
			System.out.println(n);
		}
		else {
			for(int i = 2; i*i <= n; i++) {
				while(n%i == 0) {
					System.out.println(i);
					n = n/i;
			
			}
			if(n != 1)
				System.out.println(n);
		}
	}

}
