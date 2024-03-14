
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <16 )
            System.out.println("NAO PODE VOTAR! ");
        else if (idade >= 16 && idade <= 18)
            System.out.println("VOTO FACULTATIVO!");
        else if (idade >18 && idade < 60) {
        	System.out.println("É OBRIGATORIO VOTAR!");
        }else {
        	System.out.println("VOTO FACULTATIVO!");
        }

        sc.close();
       
    }
}
