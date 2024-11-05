package Homework_4.Task_2;

public class MartkutxaParalelepipedi extends Martkutxedi{
    float height;

    MartkutxaParalelepipedi(float s, float g, float h) {
        super(s, g);
        height = h;
    }

    float getVolume() {
        return getArea() * height;
    }
}
