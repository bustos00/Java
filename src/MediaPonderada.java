import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		int n1,n2,n3, med;
		Scanner dada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1= dada.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2= dada.nextInt();

		System.out.println("Digite a terceira nota: ");
		n3= dada.nextInt();


		n1=n1*2;
		n2=n2*3;
		n3=n3*5;

		med= (n1+n2+n3)/10;


		System.out.println("A media ponderada é: "+ med);

	}

}
