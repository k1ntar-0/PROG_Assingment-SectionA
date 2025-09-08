
package tv_manager;
/*
Student Number: 10487456
Student Name: Ndaedzo Given Tshiovhe
Section A
*/
import java.util.Scanner;

public class TV_Manager {
    public static void main(String[] args) {
        Series series = new Series();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("Pick an option (1-6): ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    series.captureSeries();
                    break;
                case "2":
                    series.searchSeries();
                    break;
                case "3":
                    series.updateSeries();
                    break;
                case "4":
                    series.deleteSeries();
                    break;
                case "5":
                    series.seriesReport();
                    break;
                case "6":
                    series.exitSeriesApplication();
                    break;
                default:
                    System.out.println(" Invalid choice. Try again.\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("======  TV Series Manager ======");
        System.out.println("1. Capture a new series");
        System.out.println("2. Search for a series");
        System.out.println("3. ️Update a series");
        System.out.println("4. Delete a series");
        System.out.println("5. Print all series");
        System.out.println("6. Exit");
    }
}

