package Homework_4.Task_1;

public class Prism extends Kvadrati{
    float height;

    Prism(float gv, float h) {
        super(gv);
        height = h;
    }

    float getSurfaceArea() {
        return 2 * getArea() + 4 * (gverdi * height);
    }
}
