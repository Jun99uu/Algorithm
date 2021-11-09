import java.util.Scanner;

public class breakevenpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c; //a필수, b생산비용, c가격
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt(); //생산비용
		c = sc.nextInt(); //가격
		int tmp = c-b;
		int i;
		
		if(tmp > 0) {
			i = (a/tmp) + 1; 
			System.out.println(i);
		}else
			System.out.println("-1");
		
		
	}

}
