import java.util.Scanner;

public class For8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fato = 1 ;
		for (int i = 1; i <= n; i++) {
			fato = fato * i;
			
			
		}
		System.out.println(fato);
	}

}