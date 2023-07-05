package EX4;
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void displayPoint(){
        System.out.println("The points is (X,Y): "+x+";"+y);
    }
    public static double calDistance(Point a, Point b){
        return Math.sqrt(((b.x-a.x)*(b.x-a.x))+(b.y-a.y)*(b.y-a.y));
    }
    public static double areaOfTriangle(Point a, Point b, Point c){
        double A = Point.calDistance(a,b);
        double B = Point.calDistance(b,c);
        double C = Point.calDistance(c,a);
        double s = (A + B + C) / 2;
        return Math.sqrt(s*(s-A)*(s-B)*(s-C));
    }
}
