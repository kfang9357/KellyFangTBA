package Game;
import java.util.Random;
import Areas.TreeArea;
import Board.Board;
import People.Person;
import Areas.Area;
import Areas.BearsDen;

import java.util.Scanner;

public class Runner {
	private static boolean gameOn = true;

	public static void main(String[] args)
	{
		int a = 0;
		int b = 0; //bears den
		int c = 0; //rivers
		int d = 0; //witch's cult

		Scanner in = new Scanner(System.in);
		System.out.println("Hello, Player. Do you want to play in the easy, medium, or hard mode? [E/M/H]");
		String mode = in.nextLine();
		if(mode.equals("E"))
		{
			a = 5;
			b = 3;
			c = 2;
		}
		else if (mode.equals("M"))
		{
			a = 8;
			b = 8;
			c = 10;
			d = 5;
		}
		else if (mode.equals("H"))
		{
			a = 10;
			b = 10;
			c = 10;
			d = 5;
		}
		System.out.println("...");
		System.out.println("You open your eyes and find yourself in the middle of nowhere.");
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println(name + ", you have to try and find your way out of the forest before your hp falls below 0.");

		Area[][] forest = new Area[a][a];
		Board map = new Board(forest);

		TreeArea t1 = new TreeArea(1,0);
		map.fill(t1);

		Random r = new Random ();;

		int n = r.nextInt(5);

		System.out.println(n);
		BearsDen a2 = new BearsDen (0, 0);
		BearsDen a3 = new BearsDen (0, 1);
		//TreeArea a1 = new TreeArea(2,2);

		//map.fill(a1);
		map.addArea(a2, 0, 0);
		map.addArea(a3, 0, 1);
	//	map.addArea(a2, 1,);

		map.printBoard();

		Person player1 = new Person("FirstName", "FamilyName", 0,0, 100);
		//forest[0][0].enterArea(player1);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, forest))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
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
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Area[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveArea(p);
					map[p.getxLoc()-1][p.getyLoc()].enterArea(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveArea(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterArea(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveArea(p);
					map[p.getxLoc()+1][p.getyLoc()].enterArea(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveArea(p);
					map[p.getxLoc()][p.getyLoc()-1].enterArea(p);
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
