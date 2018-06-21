import java.util.*;

public class SwappInt {
	public static void main (String[] args) {
		int x,y,p;
		Scanner s = new Scanner(System.in);
		System.out.print("Inserire il valode di x: ");
		x=s.nextInt();
		System.out.print("Inserire il valode di y: ");
		y=s.nextInt();
		
		System.out.println("il valore di x e': " + x + " il valore di y e': "+ y);
		p=y;y=x;x=p;
		System.out.println("il valore di x e': " + x + " il valore di y e': "+ y);
		
	}
}
