import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	

		int soma = 0;
		//primeiro comando cria a variavel I e atribui 0 para ela (só é executado a primeira vez que o comando rodar)
		//determinação da condição (i<n quer dizer que eu vou repetir o codigo enquando i for menor do que n)
		//agora coloco o incremento da variavel, nesse caso o i vai receber o valor que ja estava nele e vai somar +1 
			for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		sc.close();
	}
}