package utils;

import java.io.PrintStream;
import java.util.Scanner;

public class InputOutputCLI {	
	public Scanner input;
	public PrintStream output;	
	
	public InputOutputCLI(Scanner input, PrintStream output) {
		this.input = input;
		this.output = output;
	}
	
	public void Write(String content) {
		this.output.println(content);
	}
	
	public String Read() {	
		String content = this.input.nextLine();
		return content;
	}
	
	public Integer WaitInt() {
		return this.input.nextInt();
	}

}
