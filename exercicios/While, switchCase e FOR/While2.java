import java.util.Scanner;

public class While2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a senha:  ");
		int senha = sc.nextInt();

		
		
		while (senha != 15975300){
			System.out.println("Acesso negado, digite a senha novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}
}