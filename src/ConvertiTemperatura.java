import java.util.*;

public class ConvertiTemperatura {
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.print("inserisci la temperatura ing adri centigradi: ");
		celsius=s.nextDouble();
		fahrenheit = celsius*9/5+32;
		
		System.out.print(" la corrispondente temperatura in scala fahrenheit e': "+ fahrenheit+"gradi");
	}
}
