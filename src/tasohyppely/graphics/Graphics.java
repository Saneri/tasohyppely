package tasohyppely.graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Graphics {
    private static JFrame ikkuna;
    private static Viewport viewport;
    private static java.awt.Graphics2D g;
    private static final int scale = 8;
    
    public static void init() {
        viewport = new Viewport();
        ikkuna = new JFrame("alahan hyppiä hyvä mies");
        ikkuna.setPreferredSize(new Dimension(800, 600));
        ikkuna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ikkuna.getContentPane().add(viewport);
        ikkuna.pack();
        ikkuna.setVisible(true);
        g = (Graphics2D) viewport.getGraphics();
    }
    
    public static void renderFrame() {
        viewport.paint(g);
        viewport.update(g);
    }
    
    public static void drawPlayer(int x, int y) {
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
        g.drawOval(x - scale / 2, y - 5 * scale, scale, scale);
    }
    
    public static void drawPalikka(int x, int y) {
        g.drawRoundRect(x, y, 2 * scale, 2 * scale, scale, scale);
    }
    
    public static class Viewport extends Canvas {
        public Viewport() {
            setBackground(Color.WHITE);
            setSize(600, 500);
        }
        
        public void paint(Graphics g) {
            drawPlayer(34, 253);
            drawPalikka(512, 342);
            //drawPlayer(Player.getX(), Player.getY());
            //...
        }
    }
}
