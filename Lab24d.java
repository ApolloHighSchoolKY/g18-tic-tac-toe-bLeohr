//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

	//Read how many times to read
	int gameNum = file.nextInt();
	file.nextLine();

	for(int i=0; i<gameNum; i++)
	{
	//Make tic tac toe object for each game	
	TicTacToe game = new TicTacToe(file.nextLine());
	//Print game
	System.out.println(game);
	//Print winner
	System.out.println(game.getWinner()+"\n\n");
	}


		file.close();
	}
}



