import java.util.Scanner;

public class taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double uclid = Math.PI * Math.pow(r, 2);
		double taxi = 2 * Math.pow(r, 2);
		
		System.out.println(String.format("%.6f", uclid)+"\n"+String.format("%.6f",taxi));
	}

}
