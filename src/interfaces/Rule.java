package interfaces;

import exceptions.BrokenRuleException;

public interface Rule {
	
	public void runRule(String password) throws BrokenRuleException;
	
}
