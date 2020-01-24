//C:\Program Files\Java\jdk-13.0.2\bin>java.exe C:\Users\cgarrido\Desktop\OddEven.java
import java.util.Scanner;

class OddEven {
	public static void main(String args[]){
		int num;
		System.out.println("Enter an integer number:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (num % 2 == 0){
			System.out.println("Entered number is even.");
		}
		else{
			System.out.println("Entered number is odd.");
		}
	}
}
