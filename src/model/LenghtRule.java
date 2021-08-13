package model;

import exceptions.BrokenRuleException;
import interfaces.Rule;

public class LenghtRule implements Rule{
	
	private Integer min;
	private Integer max;
	
	public LenghtRule(Integer min, Integer max) {
		this.min = min;
		this.max = max;
	}
	
	@Override
	public void runRule(String password) throws BrokenRuleException {
		if(password.length() < min || password.length() > max) 
			throw new BrokenRuleException
			(String.format("Senha precisa ter entre %s e %s caracteres.", min, max)); 
	}

}
