
package tasohyppely.keyboard;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import tasohyppely.logic.Player;

public class KeyboardListener implements KeyListener {

    private final Player player;
    
    public KeyboardListener(Player player) {
        this.player = player;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_KP_RIGHT:
                player.setVx(2);
                break;
                
            case KeyEvent.VK_KP_LEFT:
                player.setVx(-2);
                break;
                
            case KeyEvent.VK_SPACE:
                player.setVy(-5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_KP_RIGHT:
            case KeyEvent.VK_KP_LEFT:
                player.setVx(0);
                break;
        }
    }
}
