package tasohyppely;

import tasohyppely.graphics.Graphics;

public class Tasohyppely {
    
    public static void main(String[] args) {
        Graphics.init();
        for (;;) {
            Graphics.drawPlayer(200, 200);
            Graphics.drawPalikka(100, 50);
        }
    }
}
