
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano:  ");
        int ano = sc.nextInt();
        

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
            System.out.println("ANO BISSEXTO! ");
        else {
        	System.out.println("NAO E ANO BISSEXTO");
        }

        sc.close();
       
    }
}
