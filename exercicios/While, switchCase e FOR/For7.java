import java.util.Scanner;

public class For7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		System.out.println("Agora digite " + n + " números: ");
		for (int i = 0; i < n; i++) {

			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			double div = n1 / n2;
			
			if (n2 == 0) {
				System.out.println("Divisão Impossível");
			}else {
				System.out.println("O resultado é: " + div);
			}
		}
	}
}
