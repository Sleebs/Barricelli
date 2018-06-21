import java.util.*;
public class GeneratoreNumeriZeroTre {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	long numeroR = System.currentTimeMillis()%4;
	System.out.println("inserisci un numero: ");
	if(s.nextInt()== numeroR)
		System.out.println("indovinato");
	else
		System.out.println("Sbagliato, il numero era: "+ numeroR);
}
}
