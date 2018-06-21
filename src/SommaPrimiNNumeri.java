import java.util.*;

public class SommaPrimiNNumeri {
	public static void main(String args[ ]) {
		Scanner s =  new Scanner(System.in);
		System.out.println("inserire il numero di volte per cui si vuole effettuare la somma: ");
		int i=1, sum=0, n=s.nextInt();
		while (i<=n) { // fin tanto che i resta minore o uguale a 20
			sum = sum+i; // oppure sum += i;
			i++; // oppure i++; incremento i ad ogni ciclo
			System.out.println(i);
		}
		System.out.println("La somma dei primi 20 numeri e’ = "+sum);
	}

}
