import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 2017-04-14.
 */

public class Maze {
    private ArrayList<Character> mazeData = new ArrayList<>();

    public Maze(java.io.Reader file) {

        try {
            Reader reader = new FileReader(String.valueOf(file));
            while (file.read() != -1) {
                int i = 0;
                mazeData.set(i, (char)reader.read());
                i++;
            }
        }
        catch (IOException e) {
            System.out.println();
        }
    }

    public boolean isMovable(Position position) {

    }

    public boolean isGoal(){

    }

    public Position getStartPosition() {

    }
}
