
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o preço? ");
		double preco = sc.nextInt();
		double desc = preco * 0.1;
		double fim = preco - desc;
		System.out.println("Preço original: " + preco + "\nValor do desconto: " + desc + "\nValor final com desconto: " + fim);
	}
}