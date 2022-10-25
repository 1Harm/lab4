import java.awt.*;

public class Task5 {
    double x, y;

    void Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static class Line {
        Point p1, p2;

        Line(Point point1, Point point2) {
            this.p1 = point1;
            this.p2 = point2;
        }

        public double canad() {
            if (p1.getY() == p2.getY()) {
                return Math.abs(
                        (p1.getX() - p2.getX())
                );
            } else return 0;
        }

        public static void main(String args[]) {
            Line s = new Line(new Point(2, 2), new Point(5, 2));
            double as = (double) s.canad();
            System.out.println("Length   = " + as);
        }
    }
}
