import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		double c = sc.nextDouble();
		
		double f = (c * 1.8) + 32;

		System.out.println(c + " graus Celsius são " + f + (" graus Farenheinth"));
		
		sc.close();
		
		
		
	}
}
