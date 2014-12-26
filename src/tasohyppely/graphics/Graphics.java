package tasohyppely.graphics;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Graphics {
    private static JFrame ikkuna;
    private static java.awt.Graphics g;
    private static final int scale = 16;
    
    public static void init() {
        
        ikkuna = new JFrame("alahan hyppiä hyvä mies");
        ikkuna.setPreferredSize(new Dimension(800, 600));
        ikkuna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ikkuna.pack();
        ikkuna.setVisible(true);
    }
    
    public static void DrawPlayer(int x, int y) {
        // oikea jalka
        g.drawLine(x + 1 * scale, y, x, y - 2 * scale);
        // vasen jalka
        g.drawLine(x - 1 * scale, y, x, y - 2 * scale);
        // vartalo
        g.drawLine(x, y - 4 * scale, x, y - 2 * scale);
        // oikea käsi
        g.drawLine(x, y - 4 * scale, x + 1 * scale, y - 2 * scale);
        // vasen käsi
        g.drawLine(x, y - 4 * scale, x - 1 * scale, y - 2 * scale);
        // pää
        g.drawOval(x, y - 5 * scale, scale, scale);
    }
    
    public static void drawPalikka(int x, int y) {
        g.drawRoundRect(x, y, 2 * scale, 2 * scale, scale / 4, scale / 4);
    }
}
