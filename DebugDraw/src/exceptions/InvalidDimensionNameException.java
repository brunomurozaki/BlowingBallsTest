package exceptions;

public class InvalidDimensionNameException extends Exception{

	public InvalidDimensionNameException() {}
	
	@Override
	public String getMessage() {
		return "Nome da dimens�o inv�lido. Apenas aceita um �nico caracter para identific�-la";
	}
	
	
}
