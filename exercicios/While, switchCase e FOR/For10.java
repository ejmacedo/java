import java.util.Scanner;

public class For10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = 0;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			q = i * i;
			c = i * i * i;
			
		System.out.println("" + i + " " + q + " " +c);
				
			
				
		}
		sc.close();
	}

} // Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.