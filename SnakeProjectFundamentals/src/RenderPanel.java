import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Class for drawing
 */
public class RenderPanel extends JComponent {

    private Snake snake;

    /**
     * Constructor. Initializes Snake and pictures. Called from Game default costructor
     * @param snake Snake object
     */
    public RenderPanel(Snake snake) {
        loadPictures();
        this.snake = snake;
    }

    public BufferedImage headImg;
    public BufferedImage backgroundImg;
    public BufferedImage snakeBodyImg;
    public BufferedImage frog;

    /**
     * Loads all pictures in the game
     * @exception IOException
     */
    public void loadPictures() {
        try {
            headImg = ImageIO.read(this.getClass().getResource("pics/head.png"));
            backgroundImg = ImageIO.read(this.getClass().getResource("pics/backgroundSwamp.jpg"));
            snakeBodyImg = ImageIO.read(this.getClass().getResource("pics/body.png"));
            frog = ImageIO.read(this.getClass().getResource("pics/frog.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Everything is drawn here
     * @param g Graphics
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw field
        g.drawImage(backgroundImg, 0, 0, null);
        // draw food
        g.drawImage(frog, snake.cherry.x * Game.SCALE, snake.cherry.y * Game.SCALE, null);
        // draw snake body
        g.setColor(Color.red);
        for (Point point : snake.snakeParts){
            g.drawImage( snakeBodyImg, point.x * Game.SCALE, point.y * Game.SCALE, null);
        }
        // draw head
        g.drawImage( headImg, snake.head.x * Game.SCALE, snake.head.y * Game.SCALE, null);
        // draw score
        String text = "Score: " + Game.getInstance().score + ", Length: " + snake.getTailLength() + ", Moves: " + Game.getInstance().time;
        g.setColor(Color.BLACK);
        g.setFont(new Font("Verdana", Font.BOLD, 12));
        g.drawString(text, 10 , Game.SCREEN_HEIGHT - 40);
        // draw pause
        if(Game.getInstance().paused){
            String pauseText = "Paused";
            g.setColor(Color.red);
            g.setFont(new Font("Verdana", Font.BOLD, 35));
            g.drawString(pauseText, 150 , Game.SCREEN_HEIGHT / 2);
        }

        if(Game.getInstance().over){
            String gameOver = "GAME OVER";
            g.setColor(Color.red);
            g.setFont(new Font("Verdana", Font.BOLD, 35));
            g.drawString(gameOver, 200 , Game.SCREEN_HEIGHT/2 - 50);
            String press = "press space to resume";
            g.setColor(Color.red);
            g.setFont(new Font("Verdana", Font.ITALIC, 20));
            g.drawString(press, 200 , Game.SCREEN_HEIGHT/2);
        }
    }
}
