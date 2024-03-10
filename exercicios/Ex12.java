import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos minutos quiser para converter para horas: ");
		int minutos = sc.nextInt();
		
		int horas = minutos / 60;
		int minutosRestantes = minutos % 60;

		System.out.println(minutos + " minutos tem " + horas + " horas e " + minutosRestantes + " minutos ");
		
		sc.close();
		
		
		
	}
}
