
package tasohyppely.logic;

public class Game {
    
    private final Map map;
    private final int maxNopeus = 5;
    private final double kiihtyvyys = 0.5;
    
    public Game(Map map) {
        this.map = map;
    }
    
    public void start() {
        while (true) {
            
        }
    }
    
    public void applyGravity() {
        for (Object o : map.getObjects()) {
            if (o.getVy() >= maxNopeus) {
                o.setVy(maxNopeus);
            } else {
                o.setVy(o.getVy()+0.2);
            }
        }
    }
}
