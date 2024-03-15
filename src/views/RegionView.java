package views;

import models.Region;

import java.util.List;
import java.util.Scanner;

public class RegionView {
    private Scanner scanner;

    public RegionView() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("=== Region Management ===");
        System.out.println("1. Get All Regions");
        System.out.println("2. Get Region by ID");
        System.out.println("3. Search Region by Name");
        System.out.println("4. Create Region");
        System.out.println("5. Update Region");
        System.out.println("6. Delete Region");
        System.out.println("0. Exit");
        System.out.println("=========================");
    }

    public int getInput() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void displayRegions(List<Region> regions) {
        System.out.println("=== Regions ===");
        for (Region region : regions) {
            System.out.println("ID: " + region.getId());
            System.out.println("Name: " + region.getName());
            System.out.println("----------------");
        }
    }

    public int getRegionId() {
        System.out.print("Enter Region ID: ");
        return scanner.nextInt();
    }

    public String getRegionName() {
        System.out.print("Enter Region Name: ");
        scanner.nextLine(); // consume the newline character
        return scanner.nextLine();
    }

    public void displayRegion(Region region) {
        if (region != null) {
            System.out.println("=== Region ===");
            System.out.println("ID: " + region.getId());
            System.out.println("Name: " + region.getName());
        } else {
            System.out.println("Region not found!");
        }
    }
}