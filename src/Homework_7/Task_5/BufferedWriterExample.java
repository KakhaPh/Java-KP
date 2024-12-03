package Homework_7.Task_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true));
            writer.write("ეს ტექსტი დამატებულია ფაილში.\n");
            writer.close();
            System.out.println("ტექსტი წარმატებით დაემატა ფაილში.");
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილში ჩაწერისას: " + e.getMessage());
        }
    }
}
