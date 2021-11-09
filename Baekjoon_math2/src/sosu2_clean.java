import java.util.Scanner;

public class sosu2_clean {
	
	public static boolean prime[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		prime = new boolean[max + 1];
		get_prime();
		
		int sum=0, minnum=0;
		
		for(int i = min; i <= max; i++) {
			if(prime[i] == false) {
				sum += i;
				if(minnum == 0)
					minnum = i;
			}	
		}
		
		if(minnum == 0)
			System.out.println("-1");
		else {
			System.out.println(sum + "\n" + minnum);
		}
		
	}
	
	public static void get_prime() { //�����佺�׳׽��� ü�� �Ҽ� ���
		prime[0] = true;
		prime[1] = true;
		for(int i =2; i<= Math.sqrt(prime.length); i++) { //������ ���
			for(int j = i*i; j < prime.length; j+= i) {
				prime[j] = true;
			}
		}
	}

}
