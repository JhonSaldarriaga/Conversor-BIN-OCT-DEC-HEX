package model;

public class Hexadecimal {

	public static String decToHex(String num) {
		char [] r = new char [num.length()];
		int aux1 = Integer.parseInt(num);
		int aux2 = aux1 / 16;
		int aux3 = aux1 - (aux2*16);
		int i = 1;
		while(aux1 != 0 && i<=r.length) {
			if(aux3 == 10)
				r[r.length-i] = 'A';
			else if(aux3 == 11)
				r[r.length-i] = 'B';
			else if(aux3 == 12)
				r[r.length-i] = 'C';
			else if(aux3 == 13)
				r[r.length-i] = 'D';
			else if(aux3 == 14)
				r[r.length-i] = 'E';
			else if(aux3 == 15)
				r[r.length-i] = 'F';
			else
				r[r.length-i] = (""+aux3).charAt(0);
			
			aux1 = aux2;
			aux2 = aux1 / 16;
			aux3 = aux1 - (aux2*16);
			i++;
		}
		return String.valueOf(r);
	}
}
