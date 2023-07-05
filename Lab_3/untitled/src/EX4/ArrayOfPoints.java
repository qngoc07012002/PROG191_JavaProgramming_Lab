package EX4;

import java.util.Scanner;

public class ArrayOfPoints {
    Point[] arrayOfPoints = new Point[10];
    Scanner scn = new Scanner(System.in);
    public void enterPointToList(){
        arrayOfPoints[0] = new Point(1,1);
        arrayOfPoints[1] = new Point(2,2);
        arrayOfPoints[2] = new Point(3,3);
        arrayOfPoints[3] = new Point(4,4);
        arrayOfPoints[4] = new Point(5,5);
        arrayOfPoints[5] = new Point(6,6);
        arrayOfPoints[6] = new Point(7,7);
        arrayOfPoints[7] = new Point(8,8);
        arrayOfPoints[8] = new Point(9,9);
        arrayOfPoints[9] = new Point(10,10);
//       for (int i=0;i<10;i++){
//            System.out.println("Point "+(i+1)+":");
//            System.out.printf("X: ");
//            int x = Integer.parseInt(scn.nextLine());
//            System.out.printf("Y: ");
//            int y = Integer.parseInt(scn.nextLine());
//            arrayOfPoints[i] = new Point(x,y);
//        }
    }
    public void findLargestDistance(){
        double max = Point.calDistance(arrayOfPoints[0],arrayOfPoints[1]);
        int vt1=0;
        int vt2=1;
        for (int i=0;i<9;i++)
        {
            for (int j=i+1;j<10;j++){
                if (max < (Point.calDistance(arrayOfPoints[i],arrayOfPoints[j]))) {
                    max = Point.calDistance(arrayOfPoints[i],arrayOfPoints[j]);
                    vt1=i;
                    vt2=j;
                }
            }
        }
        System.out.println("Largest distance is: "+(float)max);
        arrayOfPoints[vt1].displayPoint();
        arrayOfPoints[vt2].displayPoint();
    }
    public void findTriangleLargest(){
        double max = Point.calDistance(arrayOfPoints[1],arrayOfPoints[0])+Point.calDistance(arrayOfPoints[2],arrayOfPoints[1])+Point.calDistance(arrayOfPoints[2],arrayOfPoints[0]);
        int vt1 = 0;
        int vt2 = 1;
        int vt3 = 2;
        for (int i=0;i<8;i++){
            for (int j=i+1;j<9;j++){
                for (int t=j+1;t<10;t++){
                    if (max < Point.calDistance(arrayOfPoints[j],arrayOfPoints[i])+Point.calDistance(arrayOfPoints[t],arrayOfPoints[j])+Point.calDistance(arrayOfPoints[t],arrayOfPoints[i])){
                        max = Point.calDistance(arrayOfPoints[j],arrayOfPoints[i])+Point.calDistance(arrayOfPoints[t],arrayOfPoints[j])+Point.calDistance(arrayOfPoints[t],arrayOfPoints[i]);
                        vt1 = i;
                        vt2 = j;
                        vt3 = t;
                    }
                }
            }
        }
        System.out.println("The largest triangle is: "+(float)max);
        arrayOfPoints[vt1].displayPoint();
        arrayOfPoints[vt2].displayPoint();
        arrayOfPoints[vt3].displayPoint();

    }
}

