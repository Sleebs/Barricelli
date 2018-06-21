import java.util.*;

public class PariODispari {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("inserire un numero: ");
	if(s.nextInt()%2==0)
		System.out.println("il numero inserito e' pari");
	else
		System.out.println("il numero inserito e' dispari");
}
}
