
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();

		System.out.println("Digite um número: ");
		int n2 = sc.nextInt();

		System.out.println("Digite um número: ");
		int n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3)
			System.out.println("O numero " + n1 + " é o maior ");
		else if (n2 > n1 && n2 > n3)
			System.out.println("O numero " + n2 + " é o maior ");
		else
			System.out.println("O numero " + n3 + " é o maior ");

		sc.close();

	}
}
