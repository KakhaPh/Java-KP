package Homework_7.Task_1;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");

            if (file.createNewFile()) {
                System.out.println("ფაილი წარმატებით შეიქმნა: " + file.getName());
            } else {
                System.out.println("ფაილი უკვე არსებობს.");
            }

            System.out.println("ფაილის სახელი: " + file.getName());
            System.out.println("ფაილის გზა: " + file.getAbsolutePath());
            System.out.println("ფაილის ზომა: " + file.length() + " ბაიტი");
            System.out.println("ფაილი წაკითხვადია? " + file.canRead());
            System.out.println("ფაილი ჩასაწერია? " + file.canWrite());

        } catch (IOException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }
    }
}
