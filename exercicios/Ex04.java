
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número referente a um dia da semana: ");
		int num = sc.nextInt();

		if (num == 1)
			System.out.println("Entao é domingo ");
		else if (num == 2)
			System.out.println("Entao é segunda ");
		else if (num == 3)
			System.out.println("Entao é terça ");
		else if (num == 4)
			System.out.println("Entao é quarta ");
		else if (num == 5)
			System.out.println("Entao é quinta ");
		else if (num == 6)
			System.out.println("Entao é sexta ");
		else if (num == 7)
			System.out.println("Entao é sabado ");
		else
			System.out.println("ERRO: Digite um numero correspondente a um dia da semana");

		sc.close();

	}
}
