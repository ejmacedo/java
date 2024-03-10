
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();

		System.out.println("Digite um número: ");
		int n2 = sc.nextInt();

		System.out.println("Digite um número: ");
		int n3 = sc.nextInt();

		if (n1 > n2 && n2 > n3)
			System.out.println("A ordem crescente é: " + n3 + " , " + n2 + " , " + n1);
		else if (n2 > n1 && n1 > n3)
			System.out.println("A ordem crescente é: " + n3 + " , " + n1 + " , " + n2);
		else if (n3 > n2 && n2 > n1)
			System.out.println("A ordem crescente é: " + n1 + " , " + n2 + " , " + n3);
		else
			System.out.println("A ordem crescente é: " + n2 + " , " + n3 + " , " + n1);

		sc.close();

	}
}
