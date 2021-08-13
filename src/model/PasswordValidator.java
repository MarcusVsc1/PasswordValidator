package model;

import java.util.List;

import interfaces.Rule;

public class PasswordValidator {
	
	List<Rule> rules;

	public PasswordValidator(List<Rule> rules) {
		this.rules = rules;
	}
	
	public boolean validate(String senha) {
		try {
			for (Rule rule : rules) {
				rule.runRule(senha);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
