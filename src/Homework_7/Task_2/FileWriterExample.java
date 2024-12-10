package Homework_7.Task_2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("გამარჯობა, ეს ტექსტი ჩაიწერა ფაილში.\n");
            writer.write("ეს არის მეორე ხაზი.\n");
            writer.close();
            System.out.println("ტექსტი წარმატებით ჩაიწერა ფაილში!");
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილში ჩაწერისას: " + e.getMessage());
        }
    }
}
