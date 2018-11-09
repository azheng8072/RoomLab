package Game;
import Rooms.Room;

public class Board {
    Room[][] map;
//
//    public Board(Room[][] map)
//    {
//        this.map = map;
//    }
//
//    public Board(int height, int width)
//    {
//        map = new Room[height][width];
//    }
//
//    public void addRoom(Room room, int row, int col)
//    {
//        map[row][col] = room;
//    }

    public static String printBoard(int height, int width)
    {
        String str = "";
        for(int i = 0; i<height; i++)
        {
            for(int j = 0; j<width; j++)
            {
                str = str + "[x]";
            }
            str = str + "\n";
        }
        return str;
    }
}

