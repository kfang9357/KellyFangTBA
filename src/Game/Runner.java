package Game;
import java.util.Random;

import Areas.*;
import Board.Board;
import People.Person;
import Areas.River;

import java.util.Scanner;

public class Runner {
	private static boolean gameOn = true;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is you first name?");
		String first = in.nextLine();
		System.out.println("What is your last name?");
		String last = in.nextLine();
		Person player1 = new Person(first, last, 0,0,100);

		int a = 0;
		int b = 0; //bears den
		int c = 0; //rivers
		int d = 0; //witch's cult

		System.out.println("Hello, " + first + ". Do you want to play in the easy, medium, or hard mode? [E/M/H]");
		String mode = in.nextLine();
		if(mode.equals("E"))
		{
			a = 5;
			b = 5;
			c = 5;
			d = 10;
		}
		else if (mode.equals("M"))
		{
			a = 7;
			b = 15;
			c = 15;
			d = 5;
		}
		else if (mode.equals("H"))
		{
			a = 9;
			b = 25;
			c = 20;
			d = 5;
		}

		else
		{
			System.out.println("Please choose a  mode. {E/M/H]");
		}
		System.out.println("...");
		System.out.println("You open your eyes and find yourself in the middle of nowhere.");
		System.out.println(first + ", you have to try and find your way out of the forest before your hp falls below 0.");

		Area[][] forest = new Area[a][a];
		Board map = new Board(forest);
		Area t1 = new Area (0,0);
		map.fill(t1);
		Random r = new Random ();

		for (int i = 0; i < d ; i++)
		{
			int n1 = r.nextInt(a);
			int n2 = r.nextInt(a);
			TreeArea d1 = new TreeArea (n1,n2);
			map.addArea(d1, n1, n2);
		}

		for (int i = 0; i < b ; i++)
		{
			int n1 = r.nextInt(a);
			int n2 = r.nextInt(a);
			BearsDen b1 = new BearsDen (n1,n2);
			map.addArea(b1, n1, n2);
		}

		for (int i = 0; i < c ; i++)
		{
			int n1 = r.nextInt(a);
			int n2 = r.nextInt(a);
			River r1 = new River (n1,n2);
			map.addArea(r1, n1, n2);
		}

		Civilization c1 = new Civilization(a-1,a-1);
		map.addArea(c1,a-1,a-1);

		map.printBoard();

		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, forest))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				player1.gethp();
				map.printBoard();
			}
			else {
				System.out.println("Please choose a valid move.");
			}

		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param x person moving
	 * @param map the 2D array of rooms
	 * @returnk
	 */
	public static boolean validMove(String move, Person x, Area[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (x.getxLoc() > 0)
				{
					map[x.getxLoc()][x.getyLoc()].leaveArea(x);
					map[x.getxLoc()-1][x.getyLoc()].enterArea(x);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (x.getyLoc()< map[x.getyLoc()].length -1)
				{
					map[x.getxLoc()][x.getyLoc()].leaveArea(x);
					map[x.getxLoc()][x.getyLoc() + 1].enterArea(x);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (x.getxLoc() < map.length - 1)
				{
					map[x.getxLoc()][x.getyLoc()].leaveArea(x);
					map[x.getxLoc()+1][x.getyLoc()].enterArea(x);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (x.getyLoc() > 0)
				{
					map[x.getxLoc()][x.getyLoc()].leaveArea(x);
					map[x.getxLoc()][x.getyLoc()-1].enterArea(x);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
