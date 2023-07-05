package Ex3;

public class Main {
    public static void main(String[] args){
        Point point1 = new Point(0,3);
        Point point2 = new Point(4,0);
        Point point3 = new Point(1,1);
        point2.displayPoint();
        System.out.println("Distan between 2 points: "+(double)Point.calDistance(point1,point2));
        System.out.println("Are of Triangle: "+(float)Point.areaOfTriangle(point1,point2,point3));


    }
}
