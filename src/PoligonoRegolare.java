import java.util.*;

public class PoligonoRegolare {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("inserire il valore per n: ");
	double n= s.nextDouble();
	System.out.println("inserire il valore per l: ");
	double l= s.nextDouble();
	double area=(n*Math.pow(l,2))/(4*Math.tan(Math.PI/n));
	/*L’area si calcola come :....
dove tan è l’operatore che restituisce la tangente di un
numero (Math.tan(x) con x double) e il valore Pgreco si
ottiene con Math.PI */
		System.out.println("l' area del poligono con "+ n+" lati di lunghezza "+ l+ "e': "+ area);
}
}
