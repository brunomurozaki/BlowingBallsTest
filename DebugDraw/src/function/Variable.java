package function;

import exceptions.InvalidDimensionNameException;

public class Variable {

	private FunctionDimension dimension;
	private double multiplier;
	private double exponent;
	
	public Variable() {
		this.dimension = new FunctionDimension('x');
		defaultInicialization();
	}
	
	public Variable(double multiplier) {
		this.dimension = null;
		defaultInicialization();
		this.multiplier = multiplier;
	}
	
	public Variable(double multiplier, double exponent) {
		this.dimension = null;
		this.multiplier = multiplier;
		this.exponent = exponent;
	}
	
	public Variable(char dimension){
		this.dimension = new FunctionDimension(dimension);
		defaultInicialization();
	}
	
	public Variable(char dimension, double multiplier){
		this.dimension = new FunctionDimension(dimension);
		defaultInicialization();
		this.multiplier = multiplier;
	}
	
	public Variable(char dimension, double multiplier, double exponent){
		this.dimension = new FunctionDimension(dimension);
		this.multiplier = multiplier;
		this.exponent = exponent;
	}
	
	public Variable(String dimension) throws InvalidDimensionNameException{
		this.dimension = new FunctionDimension(dimension);
		defaultInicialization();
	}
	
	public Variable(String dimension, double multiplier) throws InvalidDimensionNameException{
		this.dimension = new FunctionDimension(dimension);
		defaultInicialization();
		this.multiplier = multiplier;
	}
	
	public Variable(String dimension, double multiplier, double exponent) throws InvalidDimensionNameException{
		this.dimension = new FunctionDimension(dimension);
		this.multiplier = multiplier;
		this.exponent = exponent;
	}
	
	private void defaultInicialization() {
		this.multiplier = 1.0;
		this.exponent = 1.0;
	}
}
