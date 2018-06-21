import java.util.*;

public class QuantiSecondiPerScrivereUnNumero {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("inserisci il numero: ");
	long sec=System.currentTimeMillis();
	int num=s.nextInt();
	sec= (System.currentTimeMillis()-sec)/1000;
	System.out.println("hai impiegato: "+sec+" secondi");
	
}
}
