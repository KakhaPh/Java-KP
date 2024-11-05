package Homework_4.Task_4;

public class Circle {
    float radius;

    Circle(float r) {
        radius = r;
    }

    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}
