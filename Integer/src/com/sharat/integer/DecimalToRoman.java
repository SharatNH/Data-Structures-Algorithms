package com.sharat.integer;

/*
 * https://www.geeksforgeeks.org/converting-decimal-number-lying-between-1-to-3999-to-roman-numerals/
 * https://leetcode.com/problems/integer-to-roman/description/
 * 
 */
public class DecimalToRoman {

	public String converToRoman(int decimal){
		StringBuffer buffer = new StringBuffer();
		while(decimal > 0){
			decimal = literal(decimal,buffer);
		}
		return buffer.toString();
	}
	
	private int literal(int decimal,StringBuffer buffer){
        if(decimal >= 1000){
            buffer.append("M");
            decimal -= 1000;
            return decimal;
        }
        else if(decimal >= 900){
            buffer.append("CM");
            decimal -= 900;
            return decimal;
        }
        else if(decimal >= 500){
            buffer.append("D");
            decimal -= 500;
            return decimal;
        }
        else if(decimal >= 400){
            buffer.append("CD");
            decimal -= 400;
            return decimal;
        }
        else if(decimal >= 100){
            buffer.append("C");
            decimal -= 100;
            return decimal;
        }
        else if(decimal >= 90){
            buffer.append("XC");
            decimal -= 90;
            return decimal;
        }
        else if(decimal >= 50){
            buffer.append("L");
            decimal -= 50;
            return decimal;
        }
        else if(decimal >= 40){
            buffer.append("XL");
            decimal -= 40;
            return decimal;
        }
        else if(decimal >= 10){
            buffer.append("X");
            decimal -= 10;
            return decimal;
        }else if(decimal >= 9){
            buffer.append("IX");
            decimal -= 9;
            return decimal;
        }
        else if(decimal >=5){
            buffer.append("V");
            decimal -= 5;
            return decimal;
        }else if(decimal >= 4){
            buffer.append("IV");
            decimal -= 4;
            return decimal;
        }else {
            buffer.append("I");
            decimal -= 1;
            return decimal;
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToRoman dr=new DecimalToRoman();
		int decimal=3549;
		String roman=dr.converToRoman(decimal);
		System.out.println("roman: "+roman);
	}

}
