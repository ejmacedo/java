
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da reta A: ");
		double a = sc.nextDouble();

		System.out.println("Digite o valor da reta B: ");
		double b = sc.nextDouble();

		System.out.println("Digite o valor da reta C: ");
		double c = sc.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				System.out.println("Esse triangulo é Equilatero");
			} else if (a == b || a == c || b == c) {
				System.out.println("Esse triangulo é Isóceles");
			} else {
				System.out.println("Esse triangulo é Escaleno");
			}
		} else {
			System.out.println("Os numeros nao formam um triangulo");
		}

	}
}
