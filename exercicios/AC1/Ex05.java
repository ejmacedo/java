import java.util.Scanner;
public class Ex05 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("QUAL O RAIO DA CIRCUNFERENCIA? ");
		int raio = sc.nextInt();
		
		Double area = 3.1415*(raio*raio);
		Double perimetro =  2 * 3.1415 * raio;
		
		System.out.println("A AREA DESSE RAIO É: " + area);
		System.out.println("O PERÍMETRO DESSE RAIO É: " + perimetro);
		
		
		
	}
}
