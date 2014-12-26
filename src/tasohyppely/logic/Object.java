
package tasohyppely.logic;

public abstract class Object {
    
    protected int x;
    protected int y;
    protected double Vx; //velocity
    protected double Vy; 
    
    public Object(int x, int y) {
        this.x = x;
        this.y = y;
        this.Vx = 0;
        this.Vy = 0;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public double getVx() {return Vx;}
    public double getVy() {return Vy;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setVx(double Vx) {this.Vx = Vx;}
    public void setVy(double Vy) {this.Vy = Vy;}   
}
