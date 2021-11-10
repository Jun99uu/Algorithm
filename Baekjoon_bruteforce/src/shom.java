import java.util.Scanner;

public class shom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int illuminati = 666;
		while(i != N) {
			illuminati++;
			if(Integer.toString(illuminati).contains("666"))
				i++;
		}
		System.out.println(illuminati);
	}

}
