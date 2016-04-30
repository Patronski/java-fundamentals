import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Holds Snake properties
 * {@link ArrayList} snakeParts
 * int tailLength
 * {@link Direction} direction
 */
public class Snake {

    public ArrayList<Point> snakeParts = new ArrayList<Point>();

    private int tailLength;

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public Point head, cherry;

    public Direction direction = Direction.DOWN;

    public void restart(Random random){
        direction = Direction.DOWN;
        tailLength = 0;
        head = new Point(0, 0);
        snakeParts.clear();
        cherry = new Point(
                random.nextInt(Game.SCREEN_WIDTH / Game.SCALE),
                random.nextInt(Game.SCREEN_HEIGHT / Game.SCALE));
        for (int i = 0; i < tailLength; i++) {
            snakeParts.add(new Point(head.x, head.y));
        }
    }

    public boolean hasTailAt(int x, int y) {
        for (Point point : snakeParts) {
            if (point.equals(new Point(x, y))) {
                if(snakeParts.get(0).equals(new Point(x, y))) {
                    break;
                }
                return true;
            }
        }
        return false;
    }
}