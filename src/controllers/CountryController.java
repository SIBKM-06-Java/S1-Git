package controllers;

import daos.CountryDAO;
import daos.CountryDAOImpl;
import models.Country;
import views.CountryView;

import java.util.List;

public class CountryController {
    private CountryDAO countryDAO;
    private CountryView countryView;

    public CountryController() {
        countryDAO = new CountryDAOImpl();
        countryView = new CountryView();
    }

    public void run() {
        int choice;
        do {
            choice = countryView.getMenuChoice();
            switch (choice) {
                case 1:
                    viewAllCountries();
                    break;
                case 2:
                    searchCountryByName();
                    break;
                case 3:
                    addNewCountry();
                    break;
                case 4:
                    updateCountry();
                    break;
                case 5:
                    deleteCountry();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);
    }

    private void viewAllCountries() {
        List<Country> countries = countryDAO.getAllCountries();
        countryView.displayCountries(countries);
    }

    private void searchCountryByName() {
        String name = countryView.getCountryName();
        List<Country> countries = countryDAO.searchCountryByName(name);
        countryView.displayCountries(countries);
    }

    private void addNewCountry() {
        String id = countryView.getCountryId();
        String name = countryView.getCountryName();
        String region = countryView.getRegionId();
        Country country = new Country(id, name, region);
        countryDAO.createCountry(country);
        System.out.println("New country added successfully.");
    }

    private void updateCountry() {
        String id = countryView.getCountryId();
        Country country = countryDAO.getCountryById(id);
        if (country != null) {
            String name = countryView.getCountryName();
            String region = countryView.getRegionId();
            country.setName(name);
            country.setRegionId(region);
            countryDAO.updateCountry(country);
            System.out.println("Country updated successfully.");
        } else {
            System.out.println("Country not found.");
        }
    }

    private void deleteCountry() {
        String id = countryView.getCountryId();
        Country country = countryDAO.getCountryById(id);
        if (country != null) {
            countryDAO.deleteCountry(id);
            System.out.println("Country deleted successfully.");
        } else {
            System.out.println("Country not found.");
        }
    }
}