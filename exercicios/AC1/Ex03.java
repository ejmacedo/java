
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();

		System.out.println("Digite o terceiro número: ");
		int n3 = sc.nextInt();

		if (n1 == n2 && n2 == n3)
			System.out.println("Todos os numeros sao iguais: " + n1);
		else if (n1 == n2 && n2 != n3)
			System.out.println("O numero repetido é: " + n1);
		else if (n1 != n2 && n2 == n3)
			System.out.println("O numero repetido é: " + n2);
		else if (n1 != n2 && n1 == n3)
			System.out.println("O numero repetido é: " + n1);
		else
			System.out.println("Todos os numeros sao diferentes");
		sc.close();

	}
}