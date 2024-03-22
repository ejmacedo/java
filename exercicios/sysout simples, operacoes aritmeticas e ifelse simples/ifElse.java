import java.util.Scanner;

public class ifElse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos minutos gastou no telefone? ");
		double minutos = sc.nextDouble();
		double valor = 50;
		
		if (minutos <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f", valor);
		}else {
			valor += (minutos-100) *2;
			System.out.print("Valor a pagar: R$ " + valor );
		}
		
		sc.close();
		
	}
}