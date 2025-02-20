//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
	 	mat = new char[3][3];

		for(int row=0; row<3; row++)
			for(int col=0; col<3; col++)
				mat[row][col]='X';

	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];

	int gamePos = 0;

	//row major order
	for(int row=0; row<3; row++)
		for(int col=0; col<3; col++)
			{
				mat[row][col] = game.charAt(gamePos);
				gamePos++;
			}

	}

	public String getWinner()
	{
		if(mat[0][0]==mat[0][1] && mat[0][1]==mat[0][2])
			return ("Team "+mat[0][0])+" won horizontally!!";

		else if(mat[1][0]==mat[1][1] && mat[1][1]==mat[1][2])
			return ("Team "+mat[1][0])+" won horizontally!!";

		else if(mat[2][0]==mat[2][1] && mat[2][1]==mat[2][2])
			return ("Team "+mat[2][0])+" won horizontally!!";

		else if(mat[0][0]==mat[1][0] && mat[1][0]==mat[2][0])
			return ("Team "+mat[0][0])+" won vertically!!";

		else if(mat[0][1]==mat[1][1] && mat[1][1]==mat[1][2])
			return ("Team "+mat[0][1])+" won vertically!!";

		else if(mat[0][2]==mat[1][2] && mat[1][2]==mat[2][2])
			return ("Team "+mat[0][2])+" won vertically!!";

		else if(mat[2][0]==mat[1][1] && mat[1][1]==mat[0][2])
			return ("Team "+mat[2][0])+" won diagonally!!";

		else if(mat[0][0]==mat[1][1] && mat[1][1]==mat[2][2])
			return ("Team "+mat[0][0])+" won diagonally!!";
		
		else 
			return ("Neither team won... so sad");

	}

	public String toString()
	{
		String output="";


		for(int row=0; row<3; row++)
			{for(int col=0; col<3; col++)
				output += (mat[row][col]+" ");
			output += "\n";}



		return output;
	}
}