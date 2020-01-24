//C:\Program Files\Java\jdk-13.0.2\bin>java.exe C:\Users\cgarrido\Desktop\CharacterInput.java
/*
Create a program that asks the user to enter their name and their age. 
Print out a message addressed to them that tells them the year that they will turn 100 years old. 
*/
import java.util.Scanner;
public class CharacterInput {
	public static void main(String[] args){
		System.out.println("What is your name?");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("Okay " + name + " how old are you?");
		int age = input.nextInt();
		int birth = 2020 - age;
		int lifespan = birth + 100;
		System.out.println("Hello " + name + ". You will turn one hundred years old in the year " + lifespan);
	}
}
