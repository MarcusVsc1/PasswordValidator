package ui;

import java.util.Arrays;
import java.util.Scanner;

import org.passay.EnglishCharacterData;

import model.CharacterRule;
import model.LenghtRule;
import model.PasswordValidator;
import model.WhitespaceRule;
import utils.InputOutputCLI;

public class Program {

	public static void main(String[] args) {
		start(new InputOutputCLI(new Scanner(System.in), System.out));
	}
	
	public static void start(InputOutputCLI cli) {
		cli.Write("Digite a senha.");
		String password = cli.Read();
		
		PasswordValidator validator = new PasswordValidator(Arrays.asList(
				new LenghtRule(8, 30),
				new CharacterRule(EnglishCharacterData.UpperCase, 2),
				new CharacterRule(EnglishCharacterData.LowerCase, 1),
				new CharacterRule(EnglishCharacterData.Digit, 2),
				new CharacterRule(EnglishCharacterData.Special, 1),
				new WhitespaceRule()));
		
		if(validator.validate(password)) {
			cli.Write("Senha válida!");
		}
	}
	
	

}
