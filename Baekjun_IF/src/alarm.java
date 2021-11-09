import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int sum = 60*h + m; //분으로 바꾼 합계
		int result = sum-45;
		
		if(result<0) {
			result = 24*60 + result;
		}
		
		h = result/60;
		m = result%60;
		
		System.out.println(h + " " + m);
	}

}
