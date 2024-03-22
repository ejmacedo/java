
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o ano de seu nascimento? ");
        int ano = sc.nextInt();
        
        if (ano > 2013)
            System.out.println("VOCE E UMA CRIANÇA AINDA ");
        else if (ano <= 2013 && ano >= 2007)
            System.out.println("VOCE É UM PRÉ ADOLESCENTE");
        else if (ano < 2007 && ano >= 2005){
        	System.out.println("VOCE É UM ADOLESCENTE! ");
        }else if(ano < 2005 && ano >= 1964) {
        	System.out.println("VOCE É ADULTO! ");
        }else {
        	System.out.println("IDOSO!! ");
        }

        sc.close();

    }
}