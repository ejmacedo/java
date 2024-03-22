
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		if (num > 0)
			System.out.println("Esse número é positivo ");
		else if (num <0)
			System.out.println("Esse número é negativo ");
		else
			System.out.println("O número é o 0");
		sc.close();

	}
}