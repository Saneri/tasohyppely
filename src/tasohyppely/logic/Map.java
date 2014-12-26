

package tasohyppely.logic;

public class Map {
    private final int pituus;
    private final int korkeus;
    private final char[][] map;
    
    public Map(int x, int y) {
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
        for (int i=0; i<korkeus; i++) {
            for (int s=0; s<pituus; s++) {
                System.out.print(map[s][i]+" ");
            }
            System.out.println("");
        }                   
    }
}
