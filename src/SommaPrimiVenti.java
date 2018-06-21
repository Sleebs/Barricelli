
public class SommaPrimiVenti {
	public static void main(String args[ ]) {
		int i=1, sum=0;
		while (i<=20) { // fin tanto che i resta minore o uguale a 20
			sum = sum+i; // oppure sum += i;
			i = i+1; // oppure i++; incremento i ad ogni ciclo
			System.out.println(i);
		}
		System.out.println("La somma dei primi 20 numeri e’ = "+sum);
	}

}
