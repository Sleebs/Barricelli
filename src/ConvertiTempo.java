import java.util.*;

public class ConvertiTempo {
	public static long SO(long t) /*secondi in ore*/	{
		return SM(t)/60;
	}
	public static long SM(long t) /*secondi in minuti*/	{
		return t/60;
		
	}
	public static long MO(long t) /*minuti in ore*/		{
		return t/60;
	}
	public static long MS(long t) /*minuti in secondi*/	{
		return t*60;
	}
	public static long MG(long t) /*minuti in giorni ed ore*/{
		return MO(t)/24;
	}
	public static long MA(long t) /*minuti in anni e giorni*/{
		return MG(t)/365;
	}
	public static long OM(long t) /*ore in minuti*/		{
		return t*60;
	}
	public static long OS(long t) /*ore in secondi*/	{
		return OM(t)*60;
	}
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("m =  minuti , s = secondi , h = ore , g =  giorni e ore , a =  anni e giorni");
	System.out.print("inserire la quantita' di tempo da trasformare: ");
	long n=s.nextLong();
	System.out.print("trasformare i: ");
	String i = s.next();
	System.out.print(" in: ");
	i+= s.next();
	switch(i) {
		case "sh":	System.out.println(n+"secondi sono "+SO(n)+ " ore");
					break;
		case "sm":	System.out.println(n+"secondi sono "+SM(n)+ " minuti");
					break;
		case "mh":	System.out.println(n+"minuti sono "+MO(n)+ " ore");
					break;
		case "ms":	System.out.println(n+"minuti sono "+MS(n)+ " secondi");
					break;
		case "mg":	System.out.println(n+"minuti sono "+MG(n)+ " giorni e ore");
					break;
		case "ma":	System.out.println(n+"minuti sono "+MA(n)+ " anni e giorni");
					break;
		case "hs":	System.out.println(n+"ore sono "+OS(n)+ " secondi");
					break;
		case "hm":	System.out.println(n+"ore sono "+OM(n)+ " ominuti");
					break;			
	}	
}
}
