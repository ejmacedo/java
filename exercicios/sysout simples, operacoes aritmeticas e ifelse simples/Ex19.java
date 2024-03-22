
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();

		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();

		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();

		double delta = (b * b) - 4 * (a * c);
		double x1, x2;

		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("O  valor de Delta é: %.0f%nO valor do x' é: %.4f%nO valor do x'' é: %.4f%n ", delta, x1, x2);
		} else if (delta == 0) {
			x1 = -b / 2 * a;
			System.out.printf("O  valor de Delta é: %.0f%n e a equação tem somente 1 valor real e seu valor é de:  %.0f ", delta, x1);
		}else {
			System.out.println("A equação nao tem uma raiz real, o valor de Delta é menor que 0");
		}

	}
}
