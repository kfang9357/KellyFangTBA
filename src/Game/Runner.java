package Game;
import java.util.Random;
import Areas.TreeArea;
import Board.Board;
import Objects.Person;
import Areas.Area;
import Areas.Civilization;
import Areas.BearsDen;
import Areas.TreeArea;
import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

public class Runner {
	private static boolean gameOn = true;

	public static void main(String[] args)
	{
		Area[][] forest = new Area[5][5];
		Board map = new Board(forest);

		Random r = new Random ();;

		int n = r.nextInt(5);

		System.out.println(n);
		BearsDen a2 = new BearsDen (n, n);
		//TreeArea a1 = new TreeArea(2,2);

		//map.fill(a1);
		map.addArea(a2, n, n);
	//	map.addArea(a2, 1,);

		map.printBoard();

		Person player1 = new Person("FirstName", "FamilyName", 0,0, 100);
		//forest[0][0].enterArea(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, forest))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
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
