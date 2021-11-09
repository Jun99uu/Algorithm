import java.util.Scanner;

public class gongjun {

	public static boolean[] check = new boolean[246913];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int num=0;
		
		check[0] = check[1] = true;
		//에라토스테네스의 체
		for(int i = 2; i <= 246912; i++) {
			if(check[i] == true)
				continue;
			for(int j = i + i; j <= 246912; j = j + i) {
				check[j] = true;
			}
		}
		
		while(true) {
			n = sc.nextInt();
			if(n==0)
				break;
			else if(n==1) {
				System.out.println("1");
				continue;
			}
			
			for(int i = n+1; i<=2*n; i++) {
				if(check[i] == false) {
					num++;
				}
			}
			System.out.println(num);
			num = 0;
		}
	}

}
