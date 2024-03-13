import java.util.Scanner;

public class ExIfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o salário: ");
        double salario = sc.nextInt();

        double aumento1 = salario * 0.20;
        double aumento2 = salario * 0.15;
        double aumento3 = salario * 0.10;
        double aumento4 = salario * 0.5;

        double novoSalario1 = salario + aumento1;
        double novoSalario2 = salario + aumento2;
        double novoSalario3 = salario + aumento3;
        double novoSalario4 = salario + aumento4;


        if (salario <= 280)
            System.out.print("Salário antes do reajuste: " + salario + 
                            "\nPercentual de aumento: 20%" + 
                            "\nO valor acrescido foi de: " + aumento1 + 
                            "\nO novo salário após o aumento é de: " + novoSalario1);
        else if (salario > 280 && salario <= 700)
                            System.out.print("Salário antes do reajuste: " + salario + 
                            "\nPercentual de aumento: 15%" + 
                            "\nO valor acrescido foi de: " + aumento2 + 
                            "\nO novo salário após o aumento é de: " + novoSalario2);
        else if (salario > 700 && salario <= 1500)
                            System.out.print("Salário antes do reajuste: " + salario + 
                            "\nPercentual de aumento: 10%" + 
                            "\nO valor acrescido foi de: " + aumento3 + 
                            "\nO novo salário após o aumento é de: " + novoSalario3);
        else if (salario > 1500)
                            System.out.print("Salário antes do reajuste: " + salario + 
                            "\nPercentual de aumento: 5%" + 
                            "\nO valor acrescido foi de: " + aumento4 + 
                            "\nO novo salário após o aumento é de: " + novoSalario4);
        else
            System.out.println("Digita seu salario direito rapaz!!");



    }
}