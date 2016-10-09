import java.util.Scanner;
import java.util.Random;
public class Ex_01
{
	public static void main(String[]args)
	{
		Random wild = new Random();
		int player = wild.nextInt(6) + 1;
		System.out.println("Your number is " + player);
		int computer = wild.nextInt(6) + 1;
		System.out.println("The computer's number is " + computer);
		
		boolean winner;
		
		winner = rollDice(player, computer);
		if(winner == true)
		{
			System.out.println("Heyyy you won. I knew you could do it. not really");
		}
		if(winner == false)
		{
			System.out.println("Wow you suck");
		}
	}
	
	public static boolean rollDice(int player, int computer)
	{
		if(player > computer)
		{
			return true;
		}
		if(computer > player)
		{
			return false;
		}
		
		return false;
	}
}