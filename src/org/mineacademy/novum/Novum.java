package org.mineacademy.novum;

import com.massivecraft.factions.cmd.CmdFactionsAccessSetFill;
import com.sk89q.worldedit.antlr.ExpressionParser;
import org.mineacademy.novum.house.House;
import org.mineacademy.novum.person.Employee;
import org.mineacademy.novum.person.Person;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Novum {

	private static final int LEFT_NUMBER = 0;
	private static final int RIGHT_NUMBER = 1;
	private static final int OPERATOR = 2;

	public static void main(String[] args) {
		Novum novum = new Novum();

		try{ //error stuff bellow
			novum.loop();
		}catch (Throwable t){
			System.out.println("There is an error somewhere, you fucked up!" + t.getMessage());
			t.printStackTrace();
		}
	}
	private void loop(){ //main calculator loop

		Scanner scanner = new Scanner(System.in); //"We have detected no contraband in your suitcase sir."
		String message = "";


		int mode = LEFT_NUMBER; // left number, 1 right number, 2 = operator (+ - / *)
		double leftNumber = 0, rightNumber = 0; //makin' them double

		while(!message.equals("exit")) { //loop-killer + calculator

			if (mode > OPERATOR)
				mode = 0;

			if (mode == LEFT_NUMBER)
				 System.out.println("First number please");
			else if (mode == RIGHT_NUMBER)
				 System.out.println("Second one please");
			else
				 System.out.println("Now the operator, please!");

			message = scanner.nextLine();
			System.out.println("You typed: " + message);

			if (mode == LEFT_NUMBER)
				try {
					leftNumber = Double.parseDouble(message);
				} catch (NumberFormatException ex) {
					System.out.println("Invalid left number: " + message);
					continue;
				}

			else if (mode == RIGHT_NUMBER)
				try {
					rightNumber = Double.parseDouble(message);
				} catch (NumberFormatException ex) {
					System.out.println("Invalid right number: " + message);
					continue;
				}
			else{
				switch (message){
					case "+":
						System.out.println("Answer: " + (leftNumber + rightNumber));
						break;

					case "-":
						System.out.println("Answer: " + (leftNumber - rightNumber));
						break;

					case "*":
						System.out.println("Answer: " + (leftNumber * rightNumber));
						break;

					case "/":
						System.out.println("Answer: " + (leftNumber / rightNumber));
						break;

					case "%":
						System.out.println("Answer: " + (leftNumber % rightNumber) + " Modulo is for chumps!");
						break;
					default:

						System.out.println(message + " ...You think that this is an operator? Use proper operators, you filthy ram-downloader!");
						continue;
		}}



			mode++;
		}

		System.out.println("Self-destruct complete");
	}
}
