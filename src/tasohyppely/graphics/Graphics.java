package tasohyppely.graphics;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Graphics {
    private static JFrame ikkuna;
    private static java.awt.Graphics g;
    private static int scale = 25;
    
    public static void init() {
        
        ikkuna = new JFrame("alahan hyppiä hyvä mies");
        ikkuna.setPreferredSize(new Dimension(800, 600));
        ikkuna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ikkuna.pack();
        ikkuna.setVisible(true);
    }
    
    private static void DrawPlayer(int x, int y) {
        g.drawLine(x + 1 * scale, y, x, y - 2 * scale);
        g.drawLine(x - 1 * scale, y, x, y - 2 * scale);
        g.drawLine(x, y - 4 * scale, x, y - 2 * scale);
        g.drawLine(x, y - 4 * scale, x + 1 * scale, y - 2 * scale);
        g.drawLine(x, y - 4 * scale, x - 1 * scale, y - 2 * scale);
        g.drawOval(x, y - 5 * scale, scale, scale);
    }
}
