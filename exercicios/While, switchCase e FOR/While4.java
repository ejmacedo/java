import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de combustivel: 1 = Álcool 2 = Gasolina 3 = Diesel  ");
        int tipo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Digite o numero correspondente ao combustivel");
                    break;
            }
            tipo = sc.nextInt();
        }
        System.out.printf("OBRIGADO!%nGASOLINA: %d%nALCOOL: %d%nDIESEL: %d ", gasolina, alcool, diesel);
        sc.close();
    }
}