import java.util.Scanner;
import java.math.BigInteger;

public class bignum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		a= a.add(b);
		
		System.out.println(a.toString());
	}

}
