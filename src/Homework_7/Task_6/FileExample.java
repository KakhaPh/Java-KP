package Homework_7.Task_6;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // ფაილის შექმნა
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("ფაილი წარმატებით შეიქმნა: " + file.getName());
            } else {
                System.out.println("ფაილი უკვე არსებობს.");
            }
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის შექმნისას: " + e.getMessage());
        }

        // ფაილის წაშლა
        File fileToDelete = new File("example.txt");
        if (fileToDelete.delete()) {
            System.out.println("ფაილი წარმატებით წაიშალა: " + fileToDelete.getName());
        } else {
            System.out.println("ფაილის წაშლა ვერ მოხერხდა.");
        }
    }
}
