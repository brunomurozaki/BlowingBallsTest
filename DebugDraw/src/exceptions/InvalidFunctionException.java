package exceptions;

public class InvalidFunctionException extends Exception{

	private String funcao;
	public InvalidFunctionException(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
	public String getMessage() {
		return "Função " + this.funcao + " é inválida. Por favor, verifique se o número de variáveis, dimensões e operadores está correto.";
	}
}
