import java.util.Scanner;

public class bunsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, a, b; //a����, b�и�
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int i=1, result = 0;
		
		//���° �밢���� �ִ°�
		for(; result < x; i++) {
			result += i;
		}
		i--; // �밢��
		result = result - i;
		int num = x- result;
		
		if(i%2 == 0) { //¦�����
			a = num;
			b = i - (num-1);
		}else { //Ȧ�����
			a = i - (num-1);
			b = num;
		}
		
		System.out.println(a + "/" + b);
	}

}
