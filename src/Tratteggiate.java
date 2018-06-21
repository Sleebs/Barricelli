import java.util.*;

public class Tratteggiate {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String riga=s.nextLine();
		String[] line= riga.split("");
		String[] lineamin=riga.toLowerCase().split("");
		int i=0;
		for(String lettera : lineamin) { //lettera è solo per poi poter indicare la singola lettera, line invece è per poter indicare l' array
			i++;
			switch(lettera) {
			case "a":	System.out.print(line[i]+"-");
					break;
			case "b":	System.out.print(line[i]+"-");
					break;
			case "c":	System.out.print(line[i]+"-");
					break;
			case "d":	System.out.print(line[i]+"-");
					break;
			case "e":	System.out.print(line[i]+"-");
					break;
			case "f":	System.out.print(line[i]+"-");
					break;
			case "g":	System.out.print(line[i]+"-");
					break;
			case "h":	System.out.print(line[i]+"-");
					break;
			case "i":	System.out.print(line[i]+"-");
					break;
			case "j":	System.out.print(line[i]+"-");
					break;
			case "k":	System.out.print(line[i]+"-");
					break;
			case "l":	System.out.print(line[i]+"-");
					break;
			case "m":	System.out.print(line[i]+"-");
					break;
			case "n":	System.out.print(line[i]+"-");
					break;
			case "o":	System.out.print(line[i]+"-");
					break;
			case "p":	System.out.print(line[i]+"-");
					break;
			case "q":	System.out.print(line[i]+"-");
					break;
			case "r":	System.out.print(line[i]+"-");
					break;
			case "s":	System.out.print(line[i]+"-");
					break;
			case "t":	System.out.print(line[i]+"-");
					break;
			case "u":	System.out.print(line[i]+"-");
					break;
			case "v":	System.out.print(line[i]+"-");
					break;
			case "w":	System.out.print(line[i]+"-");
					break;
			case "x":	System.out.print(line[i]+"-");
					break;
			case "y":	System.out.print(line[i]+"-");
					break;
			case "z":	System.out.print(line[i]+"-");
					break;
			default: 	System.out.print(line[i]);
					break;
			}	
		}

	}
}
