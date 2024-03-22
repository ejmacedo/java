
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em graus? ");
        int temp = sc.nextInt();
        System.out.println("Qual o limite maximo da temperatura? ");
        int min = sc.nextInt();
        System.out.println("Qual a limite minimo da temperatura? ");
        int max = sc.nextInt();

        
        if (temp >= max)
            System.out.println("A TEMP ESTA ACIMA DO MAXIMO PERMITIDO! ");
        else if (temp <= min)
            System.out.println("A TEMPERATURA ESTA ABAIXO DO MINIMO PERMITIDO! ");
        else {
        	System.out.println("A TEMPERATURA ESTÁ DENTRO DO LIMITE PERMITIDO! ");
        }

        sc.close();

    }
}