
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = sc.nextInt();

        if (nota >= 7)
            System.out.println("APROVADO! ");
        else
            System.out.println("REPROVADO");

        sc.close();

    }
}
