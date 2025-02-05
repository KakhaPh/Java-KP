package MFinalExamPractice.Task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityPopulationSearch {
    public static void main(String[] args) {
        HashMap<String, Integer> cityPopulations = new HashMap<>();

        cityPopulations.put("Tbilisi", 450000);
        cityPopulations.put("Kutaisi", 125000);
        cityPopulations.put("Zugdidi", 110000);
        cityPopulations.put("Batumi", 150000);
        cityPopulations.put("Mcxeta", 25000);
        cityPopulations.put("Zestaponi", 60000);

        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ ქალაქის სახელი (ან ნაწილი): ");
        String userInput = scanner.nextLine().toLowerCase();

        boolean found = false;

        for (Map.Entry<String, Integer> entry : cityPopulations.entrySet()) {
            if (entry.getKey().toLowerCase().contains(userInput)) {
                System.out.println("ქალაქი: " + entry.getKey() + " პოპულაცია: " + entry.getValue());
                found = true;
            }
        }

        if(!found) {
            System.out.println("ქალაქი ვერ მოძებნა!");
        }

        scanner.close();


    }
}
