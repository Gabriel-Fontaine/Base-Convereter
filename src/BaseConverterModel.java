import java.util.*;


public class BaseConverterModel {
	
	String convertedNumber; // 
	private String finalConvertedVal; // represents the value that is given back to the controller class after the value has been calculated properly
	
	    public static void main(String[] args) {
	    	
	    }
	    
	    
	    
	/**
	 * convert is a method which is called to have various string and integer conversions utilized to change the base value and number to its associated input to output base
	 * @param numberToBeConverted
	 * @param inputNumberBase
	 * @param outputNumberBase
	 */
	
	public void convert(String numberToBeConverted, String inputNumberBase, String outputNumberBase){ // is given the number that needs to be converted, the specified base that the number originates from, and the desired base value that should be provided and converted back

		// initially ensuring that all of the input number bases get converted to a decimal base for ease of converting
		if (inputNumberBase == "BINARY BASE") {
			int convertedNumber = Integer.parseInt((numberToBeConverted), 2); // the value of 2 in retrospect from binary to decimal
			numberToBeConverted = Integer.toString(convertedNumber); // has to be equated to a different value so that when the getter method getConvertedNumber is referenced, the method is able to extract the proper converted value
		
		} else if (inputNumberBase == "TERNARY BASE") {
			int convertedNumber = Integer.parseInt((numberToBeConverted), 3); // the value of 3 in retrospect from ternary to decimal
			numberToBeConverted = Integer.toString(convertedNumber); // has to be equated to a different value so that when the getter method getConvertedNumber is referenced, the method is able to extract the proper converted value
		
		} else if (inputNumberBase == "OCTAL BASE") {
			int convertedNumber = Integer.parseInt((numberToBeConverted), 8); // the value of 8 in retrospect from octal to decimal
			numberToBeConverted = Integer.toString(convertedNumber); // has to be equated to a different value so that when the getter method getConvertedNumber is referenced, the method is able to extract the proper converted value
		
		} else if (inputNumberBase == "HEXADECIMAL BASE"){
			int convertedNumber = Integer.parseInt(numberToBeConverted, 16); // converts from base 10 to base 16 also known as hexadecimal
			numberToBeConverted = Integer.toString(convertedNumber);
			
		} else if (inputNumberBase == "DECIMAL BASE"){
			int convertedNumber = Integer.parseInt((numberToBeConverted), 10); // converts to base 10 by default
			numberToBeConverted = Integer.toString(convertedNumber); // has to be equated to a different value so that when the getter method getConvertedNumber is referenced, the method is able to extract the proper converted value
		}
		
		
		

		// checks for the output base number in contrast to have the input done first so that the output number base can be subsequently performed, once all of the appropriate values have been converted to base 10 for ease of conversion, as it is much easier to find an equivalent value of that base in terms of base 10, later to be converted to the proper conversion base
		if (outputNumberBase == "BINARY BASE") {
			String convertedNumber = Integer.toBinaryString(Integer.parseInt(numberToBeConverted)); // converts the number to be converted to a string value that is technically an integer value represented as a string
			finalConvertedVal = convertedNumber; // has to be equated to a different value so that when the getter method getConvertedNumber is referenced, the method is able to extract the proper converted value
		
		} else if (outputNumberBase == "TERNARY BASE") {
			int ternaryVal = Integer.parseInt(numberToBeConverted); // the total value for the ternary val that is being converted
			int remainder = 0; // the remainder value that is obtained when dividing the ternaryVal previously obtained
			String finalProductForTernary = ""; // note that this is the collection of values for ternary in reverse order
			String finalFinalProductForTernary = ""; // represents the actual reversed value of the ternary conversion once it has been properly done
			char extractedChar; // represents a particular value from the string when reversing the string position
			
			
			// converts in reverse order, trust me it still works
			do  { // Attaining the ternary conversion in reverse order by obtaining the remainder of the number being converted divided by base 3
				remainder = ternaryVal % 3; // finds out the remainder
				finalProductForTernary += remainder; // updates the remainder value to the ternary value
				ternaryVal = ternaryVal / 3; // divides the value by 3 to represent the new version of ternaryVal, after the remainder has been obtained
			} while (ternaryVal > 0);
			
			
		//	System.out.println(finalProductForTernary + " final product val"); // prints the reversed value of the conversion to ternary
			for (int numPos = 0; numPos < finalProductForTernary.length(); numPos += 1){ // looping through the length of the subsequent string to reverse the position of the previous string
				extractedChar = finalProductForTernary.charAt(numPos); // obtains the character at the designated location of numPos, in regard to finalProductForTernary
				finalFinalProductForTernary = extractedChar + finalFinalProductForTernary; // the finalFinalProductForTernary variable represents the new string value of the ternary product after having rearranged the letters in reverse
			}
			
			


			finalConvertedVal = finalFinalProductForTernary; // assigns the final value that is being converted to the converted value found from the ternary conversion algorithm above
			
		} else if (outputNumberBase == "OCTAL BASE") {
			String convertedNumber = Integer.toOctalString(Integer.parseInt(numberToBeConverted)); // converts the value of convertNumber to an octal base value from base 10
			finalConvertedVal = convertedNumber;
			
		} else if (outputNumberBase == "HEXADECIMAL BASE") {
			String convertedNumber = Integer.toHexString(Integer.parseInt(numberToBeConverted)); // converts the value of convertNumber to an hexadecimal base value from base 10
			finalConvertedVal = convertedNumber;
		
		} else if (outputNumberBase == "DECIMAL BASE") {
			String convertedNumber = Integer.toString(Integer.parseInt(numberToBeConverted)); // converts the value of convertNumber to an decimal base value from base 10
			finalConvertedVal = convertedNumber;
		}
		
		
	}
	
	
	
	
	/**
	 * 
	 * getConvertedNumber is a method which is called to obtain the converted value from this class, to validate if the conversion is successful or not
	 * @return the string value which represents the converted value of the number which needed to be converted, being provided back to the ViewController
	 */
	
	public String getConvertedNumber(){
		System.out.println("\nFinal Converted Value: " + finalConvertedVal + " !!!"); // prints to the screen the final converted value to the console
		return finalConvertedVal;
	}
	
	
	
}




