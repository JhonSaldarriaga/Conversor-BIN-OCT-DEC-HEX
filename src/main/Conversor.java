package main;

import model.Decimal;
import model.Hexadecimal;

public class Conversor {
	
	public static void main(String [] args) {
		
		System.out.println(Decimal.hexToDec("2CE"));
		System.out.println(Decimal.octToDec("1316"));
		System.out.println(Decimal.binToDec("1011001110"));
		System.out.println(Hexadecimal.decToHex("718"));
		System.out.println(Hexadecimal.binToHex("1111001110"));
	}
}
