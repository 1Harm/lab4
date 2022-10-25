import java.awt.*;

public class Task3 {
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

        public Point midpoint() {
            return new Point((int) ((p1.getX() + p2.getX()) / 2), (int) ((p1.getY() + p2.getY()) / 2));
        }

        public double canad() {
            if (p2.getY() -p1.getY()>p1.getX() - p2.getX()) {
                return Math.abs(
                        (p2.getY() -p1.getY())
                );
            } else return 0;
        }

        public static void main(String args[]) {
            Task5.Line s = new Task5.Line(new Point( 1, -5), new Point(5, 10));
            double as = (double) s.canad();
            System.out.println("Length   = " + as);
        }
    }
}
