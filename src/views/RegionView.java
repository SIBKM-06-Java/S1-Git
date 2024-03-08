package views;

import java.util.Scanner;
import controllers.RegionController;

public class RegionView {
    private RegionController regionController;
    private Scanner scanner;

    public RegionView(RegionController regionController) {
        this.regionController = regionController;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("===== Region Management System =====");
        System.out.println("1. Add Region");
        System.out.println("2. View All Regions");
        System.out.println("3. Search Region by Name");
        System.out.println("4. Update Region");
        System.out.println("5. Delete Region");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processUserInput() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addRegion();
                    break;
                case 2:
                    viewAllRegions();
                    break;
                case 3:
                    searchRegionByName();
                    break;
                case 4:
                    updateRegion();
                    break;
                case 5:
                    deleteRegion();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private void addRegion() {
        System.out.print("Enter region ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter region name: ");
        String name = scanner.nextLine();
        regionController.addRegion(id, name);
    }

    private void viewAllRegions() {
        System.out.println("=== All Regions ===");
        regionController.getAllRegions();
    }

    private void searchRegionByName() {
        System.out.print("Enter region name to search: ");
        String name = scanner.nextLine();
        regionController.searchByName(name);
    }

    private void updateRegion() {
        System.out.print("Enter region ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new region name: ");
        String name = scanner.nextLine();
        regionController.updateRegion(id, name);
    }

    private void deleteRegion() {
        System.out.print("Enter region ID to delete: ");
        int id = scanner.nextInt();
        regionController.deleteRegion(id);
    }

    public void closeScanner() {
        scanner.close();
    }
}
