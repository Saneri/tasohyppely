

package tasohyppely.logic;

import java.util.ArrayList;

public class Map {
    private final int pituus;
    private final int korkeus;
    private final char[][] map;
    private final ArrayList<Object> objects;
    private final ArrayList<Block> blocks;
    
    public Map(int x, int y) {
        objects = new ArrayList<>();
        blocks = new ArrayList<>();
        pituus = x;
        korkeus = y;
        map = new char[x][y];
        
        for (int i=0; i<korkeus; i++) {
            for (int s=0; s<pituus; s++) {
                map[s][i]= '.';
            }
        }
    }
    
    public void tulostaMap() {
        for (int i=0 ; i<6 ; i++) {
            System.out.println(" ");
        }
        for (int i=0; i<korkeus; i++) {
            for (int s=0; s<pituus; s++) {
                System.out.print(map[s][i]+" ");
            }
            System.out.println("");
        }                   
    }
    
    public void addBlock(int x, int y, Block block) {
        map[x][y] = 'B';
        blocks.add(block);
    }
    
    public void addObject(int x, int y, Object object) {
        map[x][y] = 'O';
        objects.add(object);
        object.setX(x);
        object.setY(y);
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }
    
    public ArrayList<Block> getBlocks() {
        return blocks;
    }
    
    public void moveObjects() {
        for (Object o : objects) {
            map[(int) o.getX()][(int) o.getY()] = '.';
            o.setX( (o.getX() + o.getVx()));
            o.setY( (o.getY() + o.getVy()));
            map[(int) o.getX()][(int) o.getY()] = 'O';
        }
    }
}
