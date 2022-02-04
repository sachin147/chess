package domain.utils;

import domain.Cell;
import domain.Position;

import java.util.HashMap;
import java.util.Map;

public class BoardUtil {

    private static Map<String, Integer> alphabetPositionMap = new HashMap<>();

    static {
        alphabetPositionMap.put("A", 0);
        alphabetPositionMap.put("B", 1);
        alphabetPositionMap.put("C", 2);
        alphabetPositionMap.put("D", 3);
        alphabetPositionMap.put("E", 4);
        alphabetPositionMap.put("F", 5);
        alphabetPositionMap.put("G", 6);
        alphabetPositionMap.put("H", 7);
    }

    public static Cell getCell(String cellPosition) {
        String horizontalIndex = cellPosition.substring(0,1);
        String verticalIndex = cellPosition.substring(1,2);

        Position position = new Position(alphabetPositionMap.get(horizontalIndex), Integer.parseInt(verticalIndex) - 1);
        Cell cell = new Cell(position);
        return  cell;
    }
}
