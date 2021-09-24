package model;

public class Binario {

	private static char [] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};	
	private static String [] bin = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};

	public static String hexToBin(String num) {
		String r = "";
		for(int i = 0; i<num.length();i++) {
			for(int j = 0; j<hex.length; j++) {
				if(num.charAt(i) == (hex[j]))
					r += bin[j];
			}
		}
		return r;
	}
}
