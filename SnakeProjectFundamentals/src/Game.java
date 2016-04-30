import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * This class is start point of the game. Call constructors of other classes and game starts.
 */
public class Game {

    private Snake snake;
    private RenderPanel renderPanel;
    // This will make one instance of class Snake. Main can access it directly.
    private static Game game;

    public boolean over = false, paused, isMovedToChangeDirection;
    public static final int SCREEN_WIDTH = 780, SCREEN_HEIGHT = 580;
    private Timer timer;
    public static final int SCALE = 60, SPEED = 90;
    public int ticks = 0;
    public int score;
    public int time;
    public Random random;

    /**
     * Default constructor
     */
    private Game() {
        snake = new Snake();
        renderPanel = new RenderPanel(snake);
        JFrame jFrame = new JFrame("Snake");

        jFrame.setVisible(true);
        jFrame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        jFrame.setResizable(false);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation((dim.width / 2) - (jFrame.getWidth() / 2), (dim.height / 2) - (jFrame.getHeight() / 2));

        jFrame.add(renderPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Handler handler = new Handler(renderPanel, snake);
        jFrame.addKeyListener(handler);
        timer = new Timer(SPEED, handler);
        startGame();
    }

    /**
     * Function for resetting the game. Starts from beginning with
     */
    public void startGame() {
        random = new Random();
        over = false;
        paused = false;
        time = 0;
        score = 0;
        ticks = 0;
        snake.restart(random);
        timer.start();
    }

    /**
     * Singleton implementation
     * @return Static Game objects without initializing again.
     */
    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public static void main(String[] args) {
        Runnable event = new Runnable() {
            @Override
            public void run() {
                Game game = Game.getInstance();
            }
        };
        SwingUtilities.invokeLater(event);
    }

}
