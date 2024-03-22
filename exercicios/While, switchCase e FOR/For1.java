import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de patinhos: ");
		int patinhos = sc.nextInt();
		
		for (int patinho=0; patinhos>=1; patinhos--) {
			patinho = patinhos -1;
			System.out.println(patinhos + " patinhos foram passear\n"
					+ "Além das montanhas\n"
					+ "Para brincar\n"
					+ "A mamãe gritou: Quá, quá, quá, quá\n"
					+ "Mas só " + patinho + " patinhos voltaram de lá.");
			

		}
			System.out.println("Morreu tudo os patinho");
		
		sc.close();
		
	}
}
