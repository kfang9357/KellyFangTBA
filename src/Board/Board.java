package Board;
import Areas.Area;
import Areas.BearsDen;
import Areas.TreeArea;
import Game.Runner;

public class Board {
    private Area[][] map;

    public Board(Area[][] board) {
        this.map = board;
    }
    public Board (int height, int width){
        map = new Area[height][width];
    }

    public void fill(Area area) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = area;
            }
        }
    }


    public void addArea(Area area, int row, int col)
    {
        map[row][col] = area;
    }

    public void printBoard()
    {
        for (Area[] i : map)
        {
            for (Area j : i)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public String toString() {
        String line = "";

        for (int i = 0; i < map.length; i++) {
            String row = "";
            for (int j = 0; j < map[i].length; j++) {
                row += map[i][j];
            }
            line += row + "\n";
        }

        return line;
    }

}
