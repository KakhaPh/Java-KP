package Homework_3;

public class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(int z, int t) {
        int dx = this.x - z;
        int dy = this.y - t;
        return Math.sqrt(dx*dx + dy*dy);
    }
    double distance(Point p) {
        return distance(p.x, p.y);
    }
}
