import java.awt.*;
import java.util.Scanner;

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

        @Override
        public String toString() {
            return "Line{" +
                    "p1=" + p1 +
                    ", p2=" + p2 +
                    '}';
        }

        public double canad() {
            if (Math.abs(p2.getY() -p1.getY())>Math.abs(p1.getX() - p2.getX())) {
                return Math.abs(
                        (p2.getY() -p1.getY())
                );
            } else return 0;}

        public static void main(String args[]) {
            int N=2;
            int[] length=new int[N];
            Scanner input = new Scanner(System.in);
            Point[] d=new Point[N];
            for (int i = 0; i < N; i++) {
                d[i]=new Point(input.nextInt(), input.nextInt());
            }

            Line[] lines=new Line[N];
            Line s=new Line(new Point(0,0),new Point(0,0));
            for(int i=0;i<N-1;i++) {
                for (int j = 0; j < N; j++) {
                        s = new Line(new Point((int) d[i].getX(), (int) d[i].getY()), new Point((int) d[j].getX(), (int) d[j].getY()));
                }
            }
            System.out.println(s.toString());

            double as = s.canad();
            System.out.println("Length   = " + as);
        }
    }
}



