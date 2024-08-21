import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ViewController {

	
	private BaseConverterModel theModel; // initializes theModel as an object in reference to the class BaseConverterModel
	private ConverterView theView; // initializes theView as an object in reference to the class ConverterView
	public String inputNumberBase = ""; // a global variable representing the input base number so that all of the classes within this class can access and share the same updated data
	public String outputNumberBase = ""; // a global variable representing the output base number so that all of the classes within this class can access and share the same updated data
	
	
	
	
	public ViewController(ConverterView theView, BaseConverterModel theModel) {
		// TODO Auto-generated constructor stub
		this.theView = theView; // states that theView being used is utilizing the specified object from theView in the class ConverterView so that the following properties can be manipulated to alter the code
		this.theModel = theModel; // states that theModel being used is utilizing the specified object from theModel in the class BaseConverterModel so that the following properties can be manipulated to alter the code
		
		
		
		this.theView.addConvertListener(new ConvertListener()); // should control the final convert button
        
		this.theView.addInputBinaryListener(new InputBinaryListener()); // initializes a class designated to the binary listener below in reference to the output button
        this.theView.addInputTernaryListener(new InputTernaryListener()); // initializes a class designated to the ternary listener below in reference to the output button
        this.theView.addInputOctalListener(new InputOctalListener()); // initializes a class designated to the octal listener below in reference to the output button
        this.theView.addInputDecimalListener(new InputDecimalListener()); // initializes a class designated to the decimal listener below in reference to the output button
        this.theView.addInputHexadecimalListener(new InputHexadecimalListener()); // initializes a class designated to the hexadecimal listener below in reference to the output button

        
        this.theView.addOutputBinaryListener(new OutputBinaryListener()); // initializes a class designated to the binary listener below in reference to the output button
        this.theView.addOutputTernaryListener(new OutputTernaryListener()); // initializes a class designated to the ternary listener below in reference to the output button
        this.theView.addOutputOctalListener(new OutputOctalListener()); // initializes a class designated to the octal listener below in reference to the output button
        this.theView.addOutputDecimalListener(new OutputDecimalListener()); // initializes a class designated to the decimal listener below in reference to the output button
        this.theView.addOutputHexadecimalListener(new OutputHexadecimalListener()); // initializes a class designated to the hexadecimal listener below in reference to the output button

	}
	
	/**
	 * 
	 * ConvertListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
		
	class ConvertListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			String numberToBeConverted = ""; // represents the number that is going to be converted
			
			
			try { // a try catch method is used to identify if an error is found within the following code that checks to see if a conversion is successful or not
				System.out.println("Number Being Converted: " + theView.getNumberToBeConverted()); // prints the following values to the console so I can visually see the numbers being converted, and the input and outputted bases that the user has inputted
				System.out.println("Input Base: " + inputNumberBase);
				System.out.println("Output Base: " + outputNumberBase);


				numberToBeConverted = theView.getNumberToBeConverted(); // obtains the value that the user inputted to the JTextField from the ConverterView class
				
				theModel.convert(numberToBeConverted, inputNumberBase, outputNumberBase); // provides the various information to the convert method within theModel class
				
				
				theView.setConvertSolution(theModel.getConvertedNumber()); // gets the converted value from the BaseConverterModel class
				
				
			} catch(NumberFormatException ex){ // if there is an error found in the conversion, suggesting that there is a number format exception found within the BaseConverterModel convert method, suggesting that an incompatible number was inputted to convert functionally to a proper output value
				System.out.println(ex); // prints an error message that is designated by the error
				theView.displayErrorMessage("You need to enter a possible value corresponding to the operands designated");
			}
		}
		
		
	}
	

	
	/**
	 * 
	 * InputBinaryListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class InputBinaryListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			inputNumberBase = "BINARY BASE"; // states that this is the current state of the specified base
		//	System.out.println(inputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * InputTernaryListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class InputTernaryListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			inputNumberBase = "TERNARY BASE"; // states that this is the current state of the specified base
		//	System.out.println(inputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * InputOctalListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class InputOctalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			inputNumberBase = "OCTAL BASE"; // states that this is the current state of the specified base
		//	System.out.println(inputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * InputDecimalListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class InputDecimalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			inputNumberBase = "DECIMAL BASE"; // states that this is the current state of the specified base
		//	System.out.println(inputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * InputHexadecimalListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class InputHexadecimalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			inputNumberBase = "HEXADECIMAL BASE"; // states that this is the current state of the specified base
		//	System.out.println(inputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * OutputBinaryListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class OutputBinaryListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			outputNumberBase = "BINARY BASE"; // states that this is the current state of the specified base
		//	System.out.println(outputNumberBase);

			
		}
		
	}
	
	
	/**
	 * 
	 * OutputTernaryListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class OutputTernaryListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			outputNumberBase = "TERNARY BASE"; // states that this is the current state of the specified base
	//		System.out.println(outputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * OutputOctalListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class OutputOctalListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			// TODO Auto-generated method stub

			outputNumberBase = "OCTAL BASE"; // states that this is the current state of the specified base
		//	System.out.println(outputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * OutputDecimalListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class OutputDecimalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			outputNumberBase = "DECIMAL BASE"; // states that this is the current state of the specified base
	//		System.out.println(outputNumberBase);

		}
		
	}
	
	
	/**
	 * 
	 * OutputHexadecimalListener is a class which is used in response to having had an action listener response by having an event take place below
	 */
	
	class OutputHexadecimalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			outputNumberBase = "HEXADECIMAL BASE"; // states that this is the current state of the specified base
	//		System.out.println(outputNumberBase);

		}
		
	}
	
	
	
	
	
}
