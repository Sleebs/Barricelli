import java.util.ArrayList;
import java.lang.Object;

public class test {
	static ArrayList<Integer> vettore= new ArrayList<Integer>();
	
	//costruttore
	public test(String s) {
		for(String t:s.split(" ") )
			/*if(Integer.parseInt(t)<0)
				throw new BadDataException();
			else */
				vettore.add(Integer.parseInt(t));
	}
	public test() {
		for(int i=0; i<5;i++)
			vettore.add(i);
	}
	
	public static int dim() {
		return vettore.size();
	}
	
	public static int getComp(int i) {
		return vettore.get(i);
	}
	
	public static ArrayList sommaDir(test a) {
		vettore.addAll(a.vettore);
		return vettore;
	}
	public static ArrayList somma(test a) {
		ArrayList<Integer> lista= new ArrayList<Integer>();
		if(vettore.size()==a.dim()) {
			for(int h:vettore)
				lista.add(vettore.get(h)+a.vettore.get(h));
		}
		else {
			test g= new test();
			return g.vettore;
		}
		return lista;		 
	}
	
	public static void main(String[] args) {
		/*test a= new test();
		System.out.println(a.getComp(3));*/
		System.out.println('A'-'D');
		System.out.println("questa è una riga \ne questa è un'altra riga");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[]args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> listab = new ArrayList<Integer>();
		ArrayList<Integer> listac = new ArrayList<Integer>();
		listac.addAll(lista);
		
		int a = 7, b = 5;
		boolean c;
		c = a == b;
		System.out.println(a+","+b+","+c);	
		double zero = 0;
		System.out.println(zero / zero); 
		double asd = 12.5654;
		asd*=100;
		int dsa=(int)asd;
		dsa/=100;
		System.out.println(dsa); 
		
	}*/
}
