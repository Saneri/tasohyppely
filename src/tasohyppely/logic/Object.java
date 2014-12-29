
package tasohyppely.logic;

public abstract class Object {
    
    protected double x;
    protected double y;
    protected double Vx; //velocity
    protected double Vy; 
    
    public Object() {
        this.Vx = 0;
        this.Vy = 0;
    }

    public double getX() {return x;}
    public double getY() {return y;}
    public double getVx() {return Vx;}
    public double getVy() {return Vy;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setVx(double Vx) {this.Vx = Vx;}
    public void setVy(double Vy) {this.Vy = Vy;}   
}
