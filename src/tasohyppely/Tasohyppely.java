package tasohyppely;

import tasohyppely.graphics.Graphics;
import tasohyppely.keyboard.KeyboardListener;
import tasohyppely.logic.Game;
import tasohyppely.logic.Map;
import tasohyppely.logic.Player;

public class Tasohyppely {
    
    public static void main(String[] args) throws InterruptedException {
        Map map = new Map(800,600);
        Game game = new Game(map);
        Player player = new Player();
        KeyboardListener KL = new KeyboardListener(player);
        map.addObject(20, 20, player);
        game.start();
    }
}
