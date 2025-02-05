package MFinalExamPractice.Task_4;

import java.util.Date;

public class Reminder {
    private final String message;
    private final Date reminderTime;

    public Reminder(String message, Date reminderTime) {
        this.message = message;
        this.reminderTime = reminderTime;
    }

    public String getMessage() {
        return message;
    }

    public Date getReminderTime() {
        return reminderTime;
    }
}
