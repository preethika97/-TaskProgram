package Assesment;
import java.util.*;

	public class NumberToWords {
	    public static void main(String[] args) {
	        System.out.print("Enter theNumber: ");
	        Scanner input = new Scanner(System.in);
	        int value = input.nextInt();
	        int onesDigit;
	        int tensDigit;
	        int hundredsDigit;
	        String[] ones = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
	                          "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
	                          "eighteen", "nineteen","twenty"};

	        String[] tens = {" "," ","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	        String[] hundreds = {" ","one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
	                "six hundred", "seven hundred", "eight hundred", "nine hundred"};

	            if (value <=20) {
	                String result = ones[value];
	                System.out.print("Result :" + result);
	                value = input.nextInt();
	            } else if (value <20 && value > 100) {
	                tensDigit = value % 10;//21%10=1
	                onesDigit = value / 10;
	                System.out.print("Result: "+ tens[tensDigit] + " " + ones[onesDigit]);
	                value = input.nextInt();

	            } else{
	                hundredsDigit = value / 100;//234/100=2
	               tensDigit = (value% 100)/10;//234%100=34/10=3
	               onesDigit = (value % 100)%10;//0//234%100=34%10=4
	                System.out.print("Result: "+ hundreds[hundredsDigit] + " " + tens[tensDigit] + " " + ones[onesDigit]);
	            }
	        }
	    }

