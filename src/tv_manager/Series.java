package tv_manager;
/*
Student Number: 10487456
Student Name: Ndaedzo Given Tshiovhe
Section A
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Series {
    private List<SeriesModel> seriesList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    
    // methods
    public void captureSeries() {
        System.out.print("Enter series ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter series name: ");
        String name = scanner.nextLine();

        int ageRestriction;
        while (true) {
            System.out.print("Enter age restriction (2 - 18): ");
            try {
                ageRestriction = Integer.parseInt(scanner.nextLine());
                if (ageRestriction >= 2 && ageRestriction <= 18) break;
                else System.out.println("️ Age must be between 2 and 18.");
            } catch (NumberFormatException e) {
                System.out.println("️ Please enter a valid number.");
            }
        }

        System.out.print("Enter number of episodes: ");
        int episodes = Integer.parseInt(scanner.nextLine());

        seriesList.add(new SeriesModel(id, name, ageRestriction, episodes));
        System.out.println(" Series captured successfully!\n");
    }

    public void searchSeries() {
        System.out.print("Enter series ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (SeriesModel series : seriesList) {
            if (series.getId() == id) {
                System.out.println(" Found: " + series + "\n");
                return;
            }
        }

        System.out.println(" No series found with ID: " + id + "\n");
    }

    public void updateSeries() {
        System.out.print("Enter series ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (SeriesModel series : seriesList) {
            if (series.getId() == id) {
                System.out.println(" Current: " + series);

                System.out.print("Enter new name (or press Enter to skip): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) series.setName(name);

                System.out.print("Enter new age restriction (or press Enter to skip): ");
                String ageStr = scanner.nextLine();
                if (!ageStr.isEmpty()) {
                    try {
                        int age = Integer.parseInt(ageStr);
                        if (age >= 2 && age <= 18) {
                            series.setAgeRestriction(age);
                        } else {
                            System.out.println("️ Invalid age. Skipping.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("️Invalid input. Skipping age update.");
                    }
                }

                System.out.print("Enter new number of episodes (or press Enter to skip): ");
                String epStr = scanner.nextLine();
                if (!epStr.isEmpty()) {
                    try {
                        int eps = Integer.parseInt(epStr);
                        series.setEpisodes(eps);
                    } catch (NumberFormatException e) {
                        System.out.println("️Invalid input. Skipping episode update.");
                    }
                }

                System.out.println(" Series updated!\n");
                return;
            }
        }

        System.out.println(" Series not found.\n");
    }

    public void deleteSeries() {
        System.out.print("Enter series ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (SeriesModel series : seriesList) {
            if (series.getId() == id) {
                System.out.print("️Are you sure you want to delete this series? (y/n): ");
                String confirm = scanner.nextLine();

                if (confirm.equalsIgnoreCase("y")) {
                    seriesList.remove(series);
                    System.out.println("️Series deleted!\n");
                } else {
                    System.out.println("Deletion cancelled.\n");
                }
                return;
            }
        }

        System.out.println("Series not found.\n");
    }

    public void seriesReport() {
        if (seriesList.isEmpty()) {
            System.out.println("No series to display.\n");
            return;
        }

        System.out.println("Series Report:");
        for (SeriesModel series : seriesList) {
            System.out.println(series);
        }
        System.out.println();
    }

    public void exitSeriesApplication() {
        System.out.println("Thanks for using the Series Manager. Bye!");
        System.exit(0);
    }

    // -----------------------
    // 🔹 Non-interactive methods (for JUnit tests)
    // -----------------------
    public void addSeries(SeriesModel series) {
        seriesList.add(series);
    }

    public SeriesModel getSeriesById(int id) {
        for (SeriesModel s : seriesList) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean updateSeriesName(int id, String newName) {
        SeriesModel s = getSeriesById(id);
        if (s != null) {
            s.setName(newName);
            return true;
        }
        return false;
    }

    public boolean deleteSeriesById(int id) {
        SeriesModel s = getSeriesById(id);
        if (s != null) {
            seriesList.remove(s);
            return true;
        }
        return false;
    }

    public String seriesReportAsString() {
        if (seriesList.isEmpty()) return "No series to display.\n";

        StringBuilder sb = new StringBuilder("Series Report:\n");
        for (SeriesModel s : seriesList) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }
}
