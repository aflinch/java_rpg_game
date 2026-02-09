import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class GamePanel extends JPanel implements Runnable { // Implements Runnable for game loop
    // Define screen dimensions, game thread, etc.
    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true); // Improves rendering performance
        // Add KeyListener/MouseListener here
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        // The game loop logic goes here, handling updates and repainting
        while (gameThread != null) {
            // Update game state
            // Repaint the panel
            repaint();
            // Add a short delay or use a more robust timer/loop for consistent FPS
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Clears the panel
        // Your custom drawing code (e.g., drawing player, enemies, map)
        g.setColor(Color.WHITE);
        g.drawString("Hello, Game!", 100, 100);
        g.dispose(); // Release system resources
    }
}
