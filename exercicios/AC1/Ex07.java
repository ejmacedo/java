
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();

		System.out.println("Digite um número: ");
		int n2 = sc.nextInt();

		System.out.println("Digite um número: ");
		int n3 = sc.nextInt();

		if (n1 == n2 && n2 == n3)
			System.out.println("Todos os numeros sao iguais: ");
		else if (n1 == n2 && n2 != n3)
			System.out.println("Tem apenas um número diferente");
		else if (n1 != n2 && n2 == n3)
			System.out.println("Tem apenas um numero diferente");
		else if (n1 != n2 && n1 == n3)
			System.out.println("Tem apenas um numero diferente");
		else
			System.out.println("Todos os numeros sao diferentes");
		if (n1 < n2 && n2 < n3) {
			System.out.println("Os números estão em ordem crescente");
		} else {
			System.out.println("Os números nao estao em ordem crescente");
		}
		sc.close();

	}
}