import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int div = n1 / n2;
		int mult = n1 * n2;
		int negativo = -Math.abs(n2);
		int positivo = +Math.abs(n1);

		System.out.println("A soma dos números é: " + soma + 
						   "\nA subtração dos números é: " + sub + 
						   "\nA divisaão dos números é: " + div + 
						   "\nA multiplicação dos números é: " + mult + 
						   "\nO primeiro número positivo é: " + positivo + 
						   "\nO segundo número negativo é: " + negativo 
				);
		
		sc.close();
		
		
		
	}
}