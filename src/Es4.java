import java.util.*;

public class Es4 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("inserire un valore double: ");
	Double val=  s.nextDouble(),y=Math.sqrt(val);
	if(y*y==val)
		System.out.println(val+" uguale a "+y+"*"+y);
	else
		System.out.println(val+" diverso da "+y+"*"+y);
		
	
}
}
