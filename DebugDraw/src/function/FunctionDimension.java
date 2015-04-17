package function;

import exceptions.InvalidDimensionNameException;

public class FunctionDimension {

	private char name;
	
	public FunctionDimension(char name) {
		this.name = name;
	}
	
	public FunctionDimension(String name) throws InvalidDimensionNameException {
		if(name.length() > 1)
			throw new InvalidDimensionNameException();
		
		this.name = name.charAt(0);
	}
}
