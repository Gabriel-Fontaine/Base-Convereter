

/**
* BaseConverter
* Task - A2 Base Converter: Uses the concept of MVC and principles such as polymorphism and inheritance to showcase how using GUI and various properties can be manipulated through the use of multiple classes that can control specific aspects of a program to carry out tasks, with this task  the program to have any specified number inputted into the GUI, later to have the input and output bases altered based on the user's specified inputs to the GUI through assigning values from buttons
* U7A2
* @author Gabriel Fontaine
* @version May 16 Thursday 2024
*
*/


public class BaseConverter {
	
	 public static void main(String[] args) {
		 
		// basically just initializes and designates the properties to MVC classes
		ConverterView theView = new ConverterView();
		BaseConverterModel theModel = new BaseConverterModel();
		ViewController theController = new ViewController(theView, theModel);
		theView.setVisible(true); // states that you should be able to see the screen
		
	 }
}

