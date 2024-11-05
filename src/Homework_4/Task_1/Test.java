package Homework_4.Task_1;

public class Test {
    public static void main(String[] args) {
        Prism prisma1 = new Prism(2,2);
        Prism prisma2 = new Prism(4,5);


        float area1 = prisma1.getSurfaceArea();
        float area2 = prisma2.getSurfaceArea();

        System.out.println("პრიზმა 1: " + area1);
        System.out.println("პრიზმა 2: " + area2);

        if(area1 > area2) {
            System.out.println("მაქს. ფართობი: " + area1);
        }else {
            System.out.println("მაქს. ფართობი: " + area2);
        }
    }
}
