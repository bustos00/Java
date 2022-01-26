import java.util.Scanner;

public class DistanciaPontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2;
		double d,p1,p2;
		
			Scanner kkl = new Scanner(System.in);
			
		System.out.println("Entre os dados x1: ");
		x1=kkl.nextInt();

		System.out.println("Entre os dados x1: ");
		x2=kkl.nextInt();
		
		System.out.println("Entre os dados y1: ");
		y1=kkl.nextInt();
		
		System.out.println("Entre os dados y2: ");
		y2=kkl.nextInt();
		
		p1=Math.pow((x2-x1),2);
		p2=Math.pow((y2-y1), 2);
		
		d= Math.sqrt(p1+p2);
		
		System.out.println("A distancia entre os pontos é: "+ d);
		
	}

}
