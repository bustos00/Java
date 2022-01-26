import java.util.Scanner;

public class EquacaoLineare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c,d,e,f,x,y;
		Scanner nnd = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente A: ");
		a=nnd.nextInt();
		
		System.out.println("Digite o coeficiente B: ");
		b=nnd.nextInt();

		System.out.println("Digite o coeficiente C: ");
		c=nnd.nextInt();
		
		System.out.println("Digite o coeficiente D: ");
		d=nnd.nextInt();
		
		System.out.println("Digite o coeficiente E: ");
		e=nnd.nextInt();
		
		System.out.println("Digite o coeficiente F: ");
		f=nnd.nextInt();
		
		x=((c+e)-(b+f))/ ((a+e)-(b+f));
		y= ((a+f)-(c+d)/(a+e)-(b+d));
	
			System.out.println("O valor de x é: "+ x);
			System.out.println("O valor de y é: "+ y);
		
		
	}

}
