import java.util.Scanner;

public class While{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Acerte um número:  ");
		int numero = sc.nextInt();
		int repete = 0;
		
		
		while (numero != 0){
			System.out.println("Número errado, digite novamente: ");
			repete = numero + repete;
			numero = sc.nextInt();
		}
		System.out.println("Ate agora, a soma dos numeros que voce digitou é: " + repete);
		
		
		sc.close();
	}
}