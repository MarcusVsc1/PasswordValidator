package model;

import exceptions.BrokenRuleException;
import interfaces.Rule;

public class WhitespaceRule implements Rule {

	@Override
	public void runRule(String password) throws BrokenRuleException {
		if(password.contains(" "))
			throw new BrokenRuleException
			(String.format("Senha não pode ter espaço em branco")); 
	}

}
