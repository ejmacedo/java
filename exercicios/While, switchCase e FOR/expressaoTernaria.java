import java.util.Scanner;

public class expressaoTernaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero");
		double preco = 25;
		double desconto = (preco < 20 ) ? preco * 0.1 : preco * 0.05;
		
		//(condição) ? se for verdade : se for falso;
		
		System.out.println(desconto);

	}
}