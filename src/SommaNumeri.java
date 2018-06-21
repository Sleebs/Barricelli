import java.util.*;
public class SommaNumeri {
	public static void main(String args[ ]) {
		int i=0, n=0;
		String sum="";
		Scanner lett=new Scanner(System.in);
		do {
			System.out.print("Inserisci il numero da sommare (0 per terminare)");
			i=lett.nextInt();
					n++;
					if (i!=0){
						sum=sum+i+" ";
					}
			System.out.println(i);
		} while (i!=0);
		System.out.println("sono stati inseriti "+n+" numeri. segue la lista in ordine di inserimento: "+sum);
	}
}
