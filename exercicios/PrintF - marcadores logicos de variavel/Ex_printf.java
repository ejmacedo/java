import java.util.Locale;
import java.util.Scanner;
public class Ex_printf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 20;
		int code = 5290;
		char gender = 'M';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("PRODUCTS");
		
		//%f = FLOAT E DOUBLE 
		//%d = INT
		//%s = STRING
		//%c = char
		//%n = quebra de linha
		
		
		System.out.printf("%s, which price is R$ %.2f%n", product1, price1);
        System.out.printf("%s, which price is R$ %.2f%n%n", product2, price2);
        System.out.printf("Record, %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
		
		sc.close();
		
	}
}
