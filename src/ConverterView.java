import java.awt.event.ActionListener;
import javax.swing.*;


public class ConverterView extends JFrame{


	private JLabel numberToBeConverted = new JLabel("Number to be Converted:"); // creates a label which is asking for the value that should be converted
	private JTextField numberBeingConverted = new JTextField(10); // represents the value that the user types to be converted, with a textField size of 10
	
	private JLabel inputNumberBase = new JLabel("Input Number Base: "); // prompts a label which asks the user what base they want to be inputted
	private JButton inputBinaryButton = new JButton("Binary"); // base 2
	private JButton inputTernaryButton = new JButton("Ternary"); // base 3
	private JButton inputOctalButton = new JButton("Octal"); // base 8
	private JButton inputDecimalButton = new JButton("Decimal"); // base 10
	private JButton inputHexadecimalButton = new JButton("Hexadecimal"); // base 16
	// a bunch of buttons were created representing the input bases
	
	private JLabel outputNumberBase = new JLabel("Output Number Base: "); // prompts a label which asks the user what base they want to be outputted
	private JButton outputBinaryButton = new JButton("Binary"); // base 2
	private JButton outputTernaryButton = new JButton("Ternary"); // base 3
	private JButton outputOctalButton = new JButton("Octal"); // base 8
	private JButton outputDecimalButton = new JButton("Decimal"); // base 10
	private JButton outputHexadecimalButton = new JButton("Hexadecimal"); // base 16
	// a bunch of buttons were created representing the output bases
	
	private JButton convertButton = new JButton("Convert"); // represents the button that actually activates the conversion
	private JLabel convertedNumberLabel = new JLabel("Converted Number:"); // prompts a label which asks for a number to be converted
	private JTextField convertedNumber = new JTextField(10); // displays the number that should be converted after the algorithm and math is done
	
	
	ConverterView(){ // initializes the screen
		
		// prepares the view, adding in various components and aspects of the view
		JPanel convertPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // says that if you close the screen it closes, duh
		this.setSize(900, 200); // sets the screen size to a set size specified in terms of length and height
		
		// adds all of the following GUI properties to the panel
		convertPanel.add(numberToBeConverted);
		convertPanel.add(numberBeingConverted);
		
		convertPanel.add(inputNumberBase);
		convertPanel.add(inputBinaryButton); // input buttons added
		convertPanel.add(inputTernaryButton);
		convertPanel.add(inputOctalButton);
		convertPanel.add(inputDecimalButton);
		convertPanel.add(inputHexadecimalButton);

		
		convertPanel.add(outputNumberBase);
		convertPanel.add(outputBinaryButton); // output buttons added
		convertPanel.add(outputTernaryButton);
		convertPanel.add(outputOctalButton);
		convertPanel.add(outputDecimalButton);
		convertPanel.add(outputHexadecimalButton);
		
		convertPanel.add(convertButton);
		convertPanel.add(convertedNumberLabel);
		convertPanel.add(convertedNumber);
		
		this.add(convertPanel);
		
		// end of setting up the components
	}
	
	
	/**
	 * 
	 * getNumberToBeConverted is a method which is called for the purpose of obtaining and getting the number that needs to be converted
	 * @return the string value that is obtained from the user typing a set sequence of numbers or letters to be converted
	 */
	
	 public String getNumberToBeConverted(){
		 return numberBeingConverted.getText(); // returns the method which calls this method the text from the numberBeingConverted JTextField
	 }


	 /**
	  * 
	  * setConvertSolution is a method which is called to set and change the JTextField of the convertedNumber textfield by having it display the final calculated value that was converted
	  * @param convertedNumberVal
	  */
	
	public void setConvertSolution(String convertedNumberVal){
		 
		convertedNumber.setText(convertedNumberVal); // sets the textbox to the value of convertedNumberVal
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	
	
	
	/**
	 * 
	 * addConvertListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForConvertButton
	 */
	
	public void addConvertListener(ActionListener listenForConvertButton){
		
		convertButton.addActionListener(listenForConvertButton);
		
	}
	
	
	/**
	 * 
	 * displayErrorMessage is a method which is called to prompt a message specified to a window to signify to the user that they have incorrectly prepared a conversion setup, such as trying to convert a value of 12 from binary to decimal, as 12 is not a binary value
	 * @param errorMessage
	 */
	
	public void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage); // displays a message by having a message appear with the specified error message provided to it from the controller class
	}

	
	
	
	
	
	// necessary method that give instructions to the ActionListener class within the ViewController class

	
	/**
	 * addInputBinaryListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForInputBinary
	 */
	
	public void addInputBinaryListener(ActionListener listenForInputBinary) {
		inputBinaryButton.addActionListener(listenForInputBinary);
	}
	
	
	/**
	 * addInputTernaryListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForInputTernary
	 */
	
	public void addInputTernaryListener(ActionListener listenForInputTernary){
		inputTernaryButton.addActionListener(listenForInputTernary);
	}
	
	
	/**
	 * 
	 * addInputOctalListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForInputOctal
	 */
	
	public void addInputOctalListener(ActionListener listenForInputOctal) {
		inputOctalButton.addActionListener(listenForInputOctal);

	}
	
	
	/**
	 * addInputDecimalListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForInputDecimal
	 */
	
	public void addInputDecimalListener(ActionListener listenForInputDecimal){
		inputDecimalButton.addActionListener(listenForInputDecimal);
	}
	
	
	/**
	 * 
	 * addInputHexadecimalListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForInputHexadecimal
	 */
	
	public void addInputHexadecimalListener(ActionListener listenForInputHexadecimal){
		inputHexadecimalButton.addActionListener(listenForInputHexadecimal);
	}
	
	
	/**
	 * 
	 * addOutputBinaryListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForOutputBinary
	 */
	
	public void addOutputBinaryListener(ActionListener listenForOutputBinary) {
		outputBinaryButton.addActionListener(listenForOutputBinary);

	}
	
	
	/**
	 * addOutputTernaryListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForOutputTernary
	 */
	
	public void addOutputTernaryListener(ActionListener listenForOutputTernary){
		outputTernaryButton.addActionListener(listenForOutputTernary);
	}
	
	
	/**
	 * addOutputOctalListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForOutputOctal
	 */
	
	public void addOutputOctalListener(ActionListener listenForOutputOctal) {
		outputOctalButton.addActionListener(listenForOutputOctal);

	}
	
	
	/**
	 * addOutputDecimalListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForOutputDecimal
	 */
	
	public void addOutputDecimalListener(ActionListener listenForOutputDecimal){
		outputDecimalButton.addActionListener(listenForOutputDecimal);
	}
	
	
	/**
	 * addOutputHexadecimalListener is a method which is called for the purpose of having an action listener class acknowledge that a button has been pressed
	 * @param listenForOutputHexadecimal
	 */
	
	public void addOutputHexadecimalListener(ActionListener listenForOutputHexadecimal){
		outputHexadecimalButton.addActionListener(listenForOutputHexadecimal);
	}
	
	
	
	
}
