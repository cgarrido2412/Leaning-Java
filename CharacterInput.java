//C:\Program Files\Java\jdk-13.0.2\bin>java.exe C:\Users\cgarrido\Desktop\CharacterInput.java
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
