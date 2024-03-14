
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em graus? ");
        int temp = sc.nextInt();

        if (temp <= 15)
            System.out.println("TA FRIO! ");
        else if (temp > 15 && temp <= 25)
            System.out.println("TA UM CLIMA AGRADAVEL");
        else {
        	System.out.println("TA QUENTE!");
        }

        sc.close();

    }
}
