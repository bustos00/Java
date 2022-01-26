import java.util.Scanner;

public class IdadeemDias {

	public static void main(String[] args) {
		int ano, mes, dias, idadeDias;
		Scanner oo = new Scanner(System.in);
		
		System.out.println("Digite seu idade em dias: ");
		idadeDias= oo.nextInt();
		
		ano=idadeDias/365;
		mes= idadeDias/30;
		dias= mes/ano;

		System.out.println("Seu idade expressa em anos é: "+ ano + " anos ");

		System.out.println("Seu idade expressa em meses é: " + mes + " meses ");
		
		
		System.out.println("Seu idade expressa em dias é: " + dias + " dias ");
		
	}

}
