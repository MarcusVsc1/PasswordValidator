package exceptions;

public class BrokenRuleException extends Exception{

	public BrokenRuleException(String message) {
		super("A senha n�o satisfaz a pol�tica de senha na seguinte regra: " + message);
	}
	
	
}
