
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas mesetas voce ganha? ");
        double sal = sc.nextDouble();

        if (sal < 400 )
            System.out.println("isento do IR ");
        else if (sal >= 400 && sal <=599) {
        	sal = sal * 0.1;
            System.out.printf("Voce pagará: R$ %.2f de IR", sal);
        }else{
            sal = sal * 0.15;
                System.out.printf("Voce pagará: R$ %.2f de IR", sal);
        }
        

        sc.close();
       
    }
}
