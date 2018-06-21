import java.util.*;

public class NumeriPerfetti {
	
	public static ArrayList<Integer> Divisori(int temp) {
		  ArrayList<Integer> a = new ArrayList<Integer>();	//dichiarare un arraylist
		for(int i=1;i<temp;i++) {
			if(temp%i==0) {
				a.add(i);
			}
		}
		return a;
	}
	public static boolean Perf(int temp) {
		int somma_temp=0;
		for(int i=0; i<Divisori(temp).size();i++) { //non ha bisogno del -1
			somma_temp+=Divisori(temp).get(i);
		}
		if(temp==somma_temp)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	System.out.print("inserire il numero desiderato: ");
	int num=s.nextInt();
		for(int i=1;i<num;i++) {
			if(Perf(i))
				System.out.println(i);
		}
	}
}
