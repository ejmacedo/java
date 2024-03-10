import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n1 = sc.nextDouble();
		
		double dobro = n1 * 2;

		System.out.println("O dobro de " + n1 + " é " + dobro);
		
		sc.close();
		
		
		
	}
}
