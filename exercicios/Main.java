//Precisa chamar a classe Locale para mudar a localidade do programa e a classe Scanner para ter input
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double x = 10.358775;
		System.out.println("Hell"
				+ "o World");
		
		//Muda a localidade do programa
		Locale.setDefault(Locale.US);
		
		//%.2f = delimita quantas casas decimais aparecerão depois da virgula
		//%n = pula linha
		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.4f%n", x);
		
		
		System.out.printf("RESULTADO = %.4f%n", x , " METROS");
		
		System.out.printf("RESULTADO = %.4f METROS%n", x);
		
		//marcadores para cada tipo de variavel: 
		//%f = FLOAT E DOUBLE 
		//%d = INT
		//%s = STRING
		//%n = quebra de linha
		//%c = char
		
		String nome = "Irene";
		int idade = 58;
		double renda = 2500;
		
		System.out.printf("A renda da %s é de R$ %.2f e sua idade é %d anos%n", nome, renda, idade);
		
	}

}
