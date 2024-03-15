package views;

import models.Country;

import java.util.List;
import java.util.Scanner;

public class CountryView {
    private Scanner scanner;

    public CountryView() {
        scanner = new Scanner(System.in);
    }

    public int getMenuChoice() {
        System.out.println("=== Country Menu ===");
        System.out.println("1. View All Countries");
        System.out.println("2. Search Country by Name");
        System.out.println("3. Add New Country");
        System.out.println("4. Update Country");
        System.out.println("5. Delete Country");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void displayCountries(List<Country> countries) {
        System.out.println("=== Country List ===");
        for (Country country : countries) {
            System.out.println("ID: " + country.getId());
            System.out.println("Name: " + country.getName());
            System.out.println("Region ID: " + country.getRegionId());
            System.out.println("---------------------------");
        }
    }

    public String getCountryId() {
        System.out.print("Enter Country ID: ");
        return scanner.next();
    }

    public String getCountryName() {
        System.out.print("Enter Country Name: ");
        return scanner.next();
    }

    public String getRegionId() {
        System.out.print("Enter Region ID: ");
        return scanner.next();
    }

    public void displayCountry(Country country) {
        if (country != null) {
            System.out.println("=== Country Details ===");
            System.out.println("ID: " + country.getId());
            System.out.println("Name: " + country.getName());
            System.out.println("Region ID: " + country.getRegionId());
        } else {
            System.out.println("Country not found.");
        }
    }
}