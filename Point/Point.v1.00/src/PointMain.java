import java.awt.*;

public class PointMain {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics();

        Point p1 = new Point();
        Point p2 = new Point(20, 100);

        System.out.println("Point 1 is " + p1);
        System.out.println("Point 2 is " + p2);

        p2.translate(-3, 6);    // moves p2 left 3 and down 6
        System.out.println("Point 2 is " + p2);

        System.out.println("Point 2 is " + p2.distanceFromOrigin() + " pixels from the origin (0,0)");

        p1.draw(g);
        p2.draw(g);
    }

}