import java.util.*;

public class AreaRettangoloInterattiva {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("inserire la base: ");
		int base=s.nextInt();
		System.out.print("iinserire l' altezza: ");
		int altezza=s.nextInt();
		System.out.println("L' altezza e': "+ base*altezza);
	}

}
