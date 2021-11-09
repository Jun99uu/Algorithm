import java.util.Scanner;

public class bunsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, a, b; //a분자, b분모
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int i=1, result = 0;
		
		//몇번째 대각선에 있는가
		for(; result < x; i++) {
			result += i;
		}
		i--; // 대각선
		result = result - i;
		int num = x- result;
		
		if(i%2 == 0) { //짝수라면
			a = num;
			b = i - (num-1);
		}else { //홀수라면
			a = i - (num-1);
			b = num;
		}
		
		System.out.println(a + "/" + b);
	}

}
