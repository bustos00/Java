import java.util.Scanner;

public class NumeroInteiro {

	public static void main(String[] args) {
		
		double a,b,c,d,r,s;
		
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro e positivo (A): ");

		a= hi.nextDouble();
		
		System.out.println("Digite o segundo numero inteiro e positivo (B): ");

		b= hi.nextDouble();
		
		System.out.println("Digite a terceira numero positivo (C): ");

		c= hi.nextDouble();
		
		
			r= Math.pow((a+b),2);
			s= Math.pow((b+c),2);
			
			d= (r+s)/2;
			
			System.out.println("Os valor D é: "+ d);
	}

}
