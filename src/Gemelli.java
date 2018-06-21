import java.util.*;

public class Gemelli {
	public static boolean  CoppiaMinore(int partenza, int arrivo) {
		if(partenza+2>=arrivo)
			return false;
		else
			return true;	
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("limite superiore: ");
		int lim=s.nextInt(),n=1;
		while(CoppiaMinore(n, lim)){
			System.out.print(n+" ");
			n+=2;
			System.out.println(n);
		}
		
	}
}
