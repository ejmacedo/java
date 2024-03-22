
import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("de 0-100 qual sua nota? ");
		double nota = sc.nextDouble();

		if (nota >= 80)
			System.out.println("MB ");
		else if (nota >= 50 && nota <= 79) {
			System.out.printf("B");
		} else if (nota >= 30 && nota <= 49) {
			System.out.printf("R");
		} else {

			System.out.println("I");
		}
		sc.close();

	}
}
