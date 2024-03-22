import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero de 1 a 7: ");
		int x = sc.nextInt();
		String dia;
		
		//avalia a expressão x, CASE o valor de X seja 1, atribua a domingo e finalize o CASE com BREAK
		switch (x) { 
		case 1:
			dia = "DOMINGO";
			break;
		case 2:
			dia = "SEGUNDA";
			break;
		case 3:
			dia = "TERÇA";
			break;
		case 4:
			dia = "QUARTA";
			break;
		case 5:
			dia = "QUINTA";
			break;
		case 6:
			dia = "SEXTA";
			break;
		case 7:
			dia = "SABADO";
			break;
		default:
			dia = "Valor inválido";
		break;
		}
		System.out.println("Dia da semana: " + dia);

		
	}
}