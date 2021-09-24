package model;

public class Hexadecimal {

	private static int [] dec = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	private static char [] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};	
	private static String [] bin = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	
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
	
	public static String binToHex(String num) {
		if(num.length()%4 != 0) {
			int mod = num.length()%4;
			for(int i = 0; i<mod; i++) {
				num = 0 + num;
			}
		}
		
		String [] bloque = new String[num.length()/4];
		int index = 0;
		for(int i = 0; i<num.length(); i+=4) {
			bloque[index] = String.valueOf(num.charAt(i)) + String.valueOf(num.charAt(i+1)) + String.valueOf(num.charAt(i+2)) + String.valueOf(num.charAt(i+3));
			index++;
		}
		
		String r = "";
		
		for(int i = 0; i<bloque.length;i++) {
			for(int j = 0; j<bin.length; j++) {
				if(bloque[i].equals(bin[j]))
					r += hex[j];
			}
		}
		
		return r;
	}
}
