import java.awt.*;

public class Point {
    int x;
    int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString("( " + x + ", " + y + " )", x + 5, y - 5);
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}