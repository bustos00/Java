import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		
		Scanner llo = new Scanner(System.in);
		
		double cf,cd,cc,imp;
		
		System.out.println("Digite o custo de fabrica do carro: ");
		cf=llo.nextDouble();
		
		imp= cf*0.45;
		cd= cf*0.28;
		cc= cf+cd+imp;
		
	System.out.println("O custo do carro ao consumidor é: "+ cc );

	}

}
