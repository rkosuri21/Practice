import java.util.Scanner;

public class MidLibs
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("\nPlease enter a noun: ");
		String noun = keyboard.nextLine();
		System.out.println("\nPlease enter an adjective: ");
		String adjective = keyboard.nextLine();
		System.out.println("\nPlease enter a verb: ");
		String verb = keyboard.nextLine();
		System.out.println("\nPlease enter another noun: ");
		String noun2 = keyboard.nextLine();
		System.out.println("\nPlease enter another adjective: ");
		String adjective2 = keyboard.nextLine();
		System.out.println("\nPlease enter another verb: ");
		String verb2 = keyboard.nextLine();
		System.out.print("\nPlease enter another noun: ");
		String noun3 = keyboard.nextLine();
		System.out.print("\nPlease enter another adjective: ");
		String adjective3 = keyboard.nextLine();
		System.out.print("\nPlease enter another verb: ");
		String verb3 = keyboard.nextLine();
		System.out.print("\nPlease enter another verb: ");
		String verb4 = keyboard.nextLine();
		
		System.out.println("Racheal wanted to go to " + noun + " for vacation.");
		System.out.println("So she decided to pack a " + adjective + " dress she bought yesterday.");
		System.out.println("Then she remembered she left her cousin in their backyard so she started " + verb +".");
		System.out.println("When she reached her backyard, she saw him " + verb2 + " with a " + noun2 + ".");
		System.out.println("The toy was " + adjective2 + " and she instantly " + verb3 + " towards  it andn pushed it out of his hand.");
		System.out.println("Her cousin was going to " + verb4 + " it");
		System.out.println("That toy had " + noun3 + " crawling all over it.");
		System.out.println("Later she took him inside, gave him a bath and then gave him some snacks.");
		
	}

}
