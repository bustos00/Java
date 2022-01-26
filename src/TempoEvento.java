import java.util.Scanner;

public class TempoEvento {

	public static void main(String[] args) {
		int TotalSegundos,horas,minutos,segundos;
		
		Scanner sotie = new Scanner(System.in);
		
		System.out.println("Digite o total de segundo do evento: ");
		TotalSegundos= sotie.nextInt();
		
		horas=TotalSegundos/3600;
		minutos= TotalSegundos/60;
		segundos= minutos/60;

		  System.out.println("\nO tempo do evento é: " + horas +" horas "+ minutos + " minutos "  + segundos +" segundos ");


	}

}
