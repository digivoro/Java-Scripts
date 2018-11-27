/**
 * Exercise102
 */
import java.awt.*;

public class Exercise102 {

    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
    
    public static void main(String[] args) {
        Point blank = new Point(5, 8);
        Rectangle rect = new Rectangle(0, 2, 4, 4);
        Point center = findCenter(rect);
        double dist = distance(center, blank);
        System.out.println(dist);
    }

}

/**
 * Expected Output:
 * 
 * In distance
 *  p1 = center = 2,4
 *  p2 = blank = 5,8
 * 
 *  dist = sqrt((5-2)^2+(8-4)^2)
 *       = sqrt(9+16) = 5
 */