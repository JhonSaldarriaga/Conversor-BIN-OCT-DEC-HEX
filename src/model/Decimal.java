package model;

public class Decimal {
	
	public static int hexToDec(String num) {
		int r = 0;
		int index = 0;
		for(int i = num.length() - 1; i>=0 ; i--) {
			
			if(num.charAt(i)=='A' || num.charAt(i)=='a') 
				r += 10 * Math.pow(16, index);
			else if(num.charAt(i)=='B' || num.charAt(i)=='b')
				r += 11 * Math.pow(16, index);
			else if(num.charAt(i)=='C' || num.charAt(i)=='c')
				r += 12 * Math.pow(16, index);
			else if(num.charAt(i)=='D' || num.charAt(i)=='d')
				r += 13 * Math.pow(16, index);
			else if(num.charAt(i)=='E' || num.charAt(i)=='e')
				r += 14 * Math.pow(16, index);
			else if(num.charAt(i)=='F' || num.charAt(i)=='f')
				r += 15 * Math.pow(16, index);
			else
				r += Integer.parseInt(num.charAt(i)+"") * Math.pow(16, index);
			
			index++;
		}
		return r;
	}
	
	public static int binToDec(String num) {
		return xToDec(num, 2);
	}
	
	public static int octToDec(String num) {
		return xToDec(num, 8);
	}
	
	private static int xToDec(String num, int base) {
		int r = 0;
		int index = 0;
		for(int i = num.length() - 1; i>=0 ; i--) {
			r += Integer.parseInt(num.charAt(i)+"") * Math.pow(base, index);
			index++;
		}
		return r;
	}
}
