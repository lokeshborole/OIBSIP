import java.util.Scanner;

public class No_guessing_game {
	public static void main(String arg[])
	{


		try (Scanner sc = new Scanner(System.in)) {
			int number = 1 + (int)(100 * Math.random());

			int count = 7 , i , User_Input;

			System.out.println("\n\n ------------ WELCOME --------------\n\n" 
								+ " A number is already chosen  b/w  1 to 100  \n" 
								+ " You have to Input the number within 7 trials to win.");


			for (i = 0; i < count; i++) {
				System.out.print("\nGuess the number : ");
				User_Input = sc.nextInt();

				if (number == User_Input)
				{
					System.out.println("Congratulations! You Win");
					System.out.println(	"The number was : " + number);
					System.out.println("");
					break;
				}

				else if (number > User_Input	&& i != count - 1)
				{
					System.out.println(	"The number is greater than " + User_Input);
				}

				else if (number < User_Input	&& i != count - 1) 
				{
					System.out.println("The number is less than " + User_Input);
				}
			}

			if (i == count) {
				System.out.println(	"You Lose");
				System.out.println("You have exhausted 7 trials\n");
				System.out.println(	"The number was : " + number);
				System.out.println("");
			}

		}
	}
}
