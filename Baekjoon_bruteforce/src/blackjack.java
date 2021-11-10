import java.util.Scanner;

public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		
		int [] card = new int[N];
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N-1; j++) {
				for(int p = j + 1; p < N; p++) {
					if(card[i]+card[j] + card[p] <= M) {
						if(sum < card[i] + card[j] + card[p]) {
							sum = card[i] + card[j] + card[p];
						}
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}
