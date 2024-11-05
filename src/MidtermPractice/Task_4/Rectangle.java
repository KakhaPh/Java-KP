package MidtermPractice.Task_4;

public class Rectangle extends Shape{
    float length;
    float width;

    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("ფართობი: " + area());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);

        rectangle.display();
    }
}
