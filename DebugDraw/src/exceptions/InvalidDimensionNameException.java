package exceptions;

public class InvalidDimensionNameException extends Exception{

	public InvalidDimensionNameException() {}
	
	@Override
	public String getMessage() {
		return "Nome da dimensão inválido. Apenas aceita um único caracter para identificá-la";
	}
	
	
}
