
package tasohyppely.logic;

import tasohyppely.graphics.Graphics;

public class Game {
    
    private final Map map;
    private final int maxNopeus = 100;
    
    public Game(Map map) {
        this.map = map;
    }
    
    public void start() throws InterruptedException {
        Graphics g = new Graphics();
        g.init(this);
        while (true) {
            g.renderFrame();
            Thread.sleep(1000/60);
            map.moveObjects();
            applyGravity();
//            map.tulostaMap();
        }
    }
    
    public void applyGravity() {
        for (Object o : map.getObjects()) {
            if (o.getY() >= 500) {          //tää korvataan if(on a block)
                o.setVy(0);
            } else {
                if (o.getVy() >= maxNopeus) {
                    o.setVy(maxNopeus);
                } else {
                    o.setVy(o.getVy()+0.1);
                }
            }
        }
    }
    
    public Map getMap() {
        return map;
    }
    
}
