package model;

import org.passay.EnglishCharacterData;

import exceptions.BrokenRuleException;
import interfaces.Rule;

public class CharacterRule implements Rule {

	Integer quantidade;
	EnglishCharacterData caracter;
	
	public CharacterRule(EnglishCharacterData characterData, Integer quantidade) {
		super();
		this.caracter = characterData;
		this.quantidade = quantidade;
	}

	@Override
	public void runRule(String password) throws BrokenRuleException {
		String ruleChars = caracter.getCharacters();
		if(!isInRule(ruleChars, password))
			throw new BrokenRuleException
			(String.format("Senha não passou na política de tipos de caracteres")); 
	}

	private boolean isInRule(String ruleChars, String password) {
		Integer charsNecessarios = 0;
		for (char c : password.toCharArray()) {
			if(ruleChars.contains(String.valueOf(c)))
				charsNecessarios++;
		}
		if(charsNecessarios >= quantidade)
			return true;
		
		return false;
	}
	
	
}
