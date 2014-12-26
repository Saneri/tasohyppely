package tasohyppely.graphics;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Graphics {
    private static JFrame ikkuna;
    
    public static void init() {
        ikkuna = new JFrame("alahan hyppiä hyvä mies");
        ikkuna.setPreferredSize(new Dimension(800, 600));
        ikkuna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ikkuna.pack();
        ikkuna.setVisible(true);
    }
}
