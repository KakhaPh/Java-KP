package Homework_4.Task_4;

public class Cilinder extends Circle {
    float height;

    Cilinder(float r, float h) {
        super(r);
        height = h;
    }

    float getVolume() {
        return (float) (getArea() * height);
    }
}
