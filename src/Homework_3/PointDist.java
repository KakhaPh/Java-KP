package Homework_3;

public class PointDist {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        System.out.println(p1.x + p1.y);
        System.out.println(p2.x + p2.y);
        System.out.println(p1.distance(6,8));
        System.out.println(p1.distance(p2));
    }
}
