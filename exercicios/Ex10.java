import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento em centímetros: ");
		double c = sc.nextDouble();
		
		double m = c / 100;

		System.out.println(c + " centímetros são " + m + (" metros"));
		
		sc.close();
		
		
		
	}
}
