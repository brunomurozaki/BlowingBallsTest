package function;

import exceptions.InvalidFunctionException;

public class RealFunction {

	private String functionForm;
	private FunctionDimension[] dimensions;
	
	public RealFunction(String functionForm) {
		this.functionForm = functionForm;
	}
	
	public boolean parseFunction() throws InvalidFunctionException{
		if(this.functionForm.isEmpty())
			throw new InvalidFunctionException(this.functionForm);
		
		char currentChar; 
		String currentNumber = "";
		for(int i = 0; i < this.functionForm.length(); i++)
		{
			currentChar = this.functionForm.charAt(i);
			
			// Se o caracter eh numerico, adiciono no numero da possivel variavel.
			if(isNumeric(currentChar)){
				currentNumber += currentChar;
				continue;
			}
			
			
		}
		
		return false;
	}
	
	private boolean isNumeric(char currentChar){
		return false;
	}
	
	public double testFunction(double[] parameters){
		
		return 0.0;
	}
	
}
