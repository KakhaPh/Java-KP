package Homework_4.Task_2;

public class Test {
    public static void main(String[] args) {
        MartkutxaParalelepipedi mp1 = new MartkutxaParalelepipedi(2,3,4);
        MartkutxaParalelepipedi mp2 = new MartkutxaParalelepipedi(3,4,5);

        float volume1 = mp1.getVolume();
        float volume2 = mp2.getVolume();

        System.out.println("მოცულობა 1: " + volume1);
        System.out.println("მოცულობა 2: " + volume2);

    }
}
