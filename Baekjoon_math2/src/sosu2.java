import java.util.Scanner;

public class sosu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int minnum = 0;
		int sum=0;
		int p=0, t = 0; //t가 0이면 소수, 1이면 소수아님
		
		for(int i = min; i <= max; i++) {
			if(i == 1)
				t=1;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					t = 1;
					break;
				}
			}
			if(t == 0){
				if(p == 0) {
					minnum = i;
					p++;
				}
				sum += i;
			}
			t = 0;
		}
		
		if(sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum + "\n" + minnum);
		}
	}

}
