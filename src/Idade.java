import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		int ano,mes,dia,totalDias;
		
		Scanner xlala = new Scanner(System.in);
		
		System.out.println("Digite seu ano: ");
		ano=xlala.nextInt();
		
		System.out.println("Digite seu mes: ");
		mes=xlala.nextInt();
		
		System.out.println("Digite seu dia: ");
		dia=xlala.nextInt();
		
		totalDias=ano *356;
		
		System.out.println("A idade expressa em dias é: " + totalDias);
	}

}
