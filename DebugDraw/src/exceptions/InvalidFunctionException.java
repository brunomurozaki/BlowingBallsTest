package exceptions;

public class InvalidFunctionException extends Exception{

	private String funcao;
	public InvalidFunctionException(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
	public String getMessage() {
		return "Fun��o " + this.funcao + " � inv�lida. Por favor, verifique se o n�mero de vari�veis, dimens�es e operadores est� correto.";
	}
}
