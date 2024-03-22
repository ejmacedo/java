import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			for (int i=sc.nextInt(); i<5; i++) {
			System.out.println(i);
		}

		sc.close();
	}
}