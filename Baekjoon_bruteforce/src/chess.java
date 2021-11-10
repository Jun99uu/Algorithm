import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String [][] chess = new String[n][m];
		for(int i = 0; i < n; i++) {
			String line = sc.next();
			chess[i] = line.split("");
		}
		
		int change = 0;
		int minchange = 9999;
		String color;
		String black = "B";
		String white = "W";
		
		
		for(int i = 0; i <= n-8; i++) {
			for(int j = 0; j <= n-8; j++) {
				if(chess[i][j].equals(black)) { //맨 왼쪽 위가 검정일때
					color = black;
					for(int p = i; p < i+8; p++) {
						for(int q = j; q < j+8; q++) {
							if(!chess[p][q].equals(color)) {
								change++;
							}
							color = changeColor(color);
						}
						if((p-i) % 2 == 0)
							color = white;
						else
							color = black;
					}
				}else if(chess[i][j].equals(white)) {//맨 왼쪽 위가 하양일때
					color = white;
					for(int p = i; p < i+8; p++) {
						for(int q = j; q < j+8; q++) {
							if(!chess[p][q].equals(color)) {
								change++;
							}
							color = changeColor(color);
						}
						if((p-i) % 2 == 0)
							color = black;
						else
							color = white;
					}
				}
				change = Math.min(change, 64-change);
				minchange = Math.min(change, minchange);
			}
		}
		
		System.out.println(minchange);
	}
	
	public static String changeColor(String color) {
		String black = "B";
		String white = "W";
		if(color.equals(black))
			color = white;
		else
			color = black;
		return color;
	}
	

}
