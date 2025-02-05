package MFinalExamPractice.Task_4;

import java.util.Date;

public class ReminderThread extends Thread {
    private final Reminder reminder;
    private static final Object lock = new Object();

    public ReminderThread(Reminder reminder) {
        this.reminder = reminder;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(10000);
                Date currentTime = new Date();

                if(currentTime.after(reminder.getReminderTime())) {
                    synchronized (lock) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(reminder.getMessage());
                        }
                    }
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
