package Classwork_7.Task_4;

public class ArrayExample {
    public static void main(String[] args) {
        String[] a = {"kakha", "Giorgi", "Vakho", "Irakli", "Tekle"};

        try {
            System.out.println("სტუდენტი N 5: " + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("მოცემული ნომრით სტუდენტი არ არსებობს!");
        }

        String newName = "Levani";

        String[] newArray = new String[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[a.length] = newName;

        System.out.println("დამატებული სტუდენტით: ");
        for (String name : newArray) {
            System.out.print(name + " ");
        }
    }
}
