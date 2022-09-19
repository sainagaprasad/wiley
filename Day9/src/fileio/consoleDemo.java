package fileio;

import java.io.Console;

public class consoleDemo {
	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("enter your name: ");
		String user = "a";
		user=c.readLine();
		System.out.println(user);
	}
}
//doesnt run because console is dedicated to command prompt of the os and cant be run using ide 