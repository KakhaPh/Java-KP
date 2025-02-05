package MFinalExamPractice.Task_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReminderApp {
    public static void main(String[] args) {
        try {
            Date reminderTime1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-02-04 12:30:00");
            Date reminderTime2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-02-04 12:31:00");
            Date reminderTime3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-02-04 12:32:00");

            Reminder reminder1 = new Reminder("Reminder 1: Time To take a break!", reminderTime1);
            Reminder reminder2 = new Reminder("Reminder 2: Drink some water!", reminderTime2);
            Reminder reminder3 = new Reminder("Reminder 3: Stand up and Stretch!", reminderTime3);

            Thread thread1 = new ReminderThread(reminder1);
            Thread thread2 = new ReminderThread(reminder2);
            Thread thread3 = new ReminderThread(reminder3);

            thread1.start();
            thread2.start();
            thread3.start();

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
