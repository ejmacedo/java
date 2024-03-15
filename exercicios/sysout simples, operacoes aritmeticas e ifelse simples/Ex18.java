
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos litros foram gastos? ");
		double litros = sc.nextDouble();
		
		System.out.println("Qual o tempo do banho em minutos? ");
		double minutos = sc.nextDouble();
		
		double vazao = litros * minutos;

		if (vazao >= 300)
			System.out.printf("TA GASTANDO MUITO, SEU GASTO EM L/M E DE: %.0f%n ", vazao);
		else {
			System.out.printf("TA GASTANDO POUCO, PARABENS, SEU GASTO EM L/M E DE %.0f", vazao);
		}
		sc.close();

	}
}
