import java.awt.*;

public class Circle {
    private int x;
    private int y;
    private double radius;
    private String shape = "O";
    private static final double PI = 3.1415;
    Color color = new Color(1, 0, 0);

    public Circle(){
        this.x = 0;
        this.y = 0;
        this.radius = 0.0;
    }
    public Circle(int nx, int ny){
        this.x = nx;
        this.y = ny;
        this.radius = 0.0;
    }
    public Circle(int nx, int ny, double nRadius){
        this.x = nx;
        this.y = ny;
        this.radius = nRadius;
    }
    public void draw(){
        System.out.println(this.shape);
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return PI * this.radius * this.radius;
    }
    public void setX(int nX){
        this.x = nX;
    }
    public void setY(int nY){
        this.y = nY;
    }
    public void setRadius(double nr){
        this.radius = nr;
    }
    @Override
    public String toString(){
        return this.shape;
    }
    public boolean equals(Circle that){
        if (this.x == that.x &&
                this.y == that.y &&
                this.radius == that.radius){
            return true;
        }
        return false;
    }
}
