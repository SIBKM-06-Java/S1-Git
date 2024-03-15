package daos;

import models.Country;

import java.util.List;

public interface CountryDAO {
    List<Country> getAllCountries();
    Country getCountryById(String id);
    List<Country> searchCountryByName(String name);
    void createCountry(Country country);
    void updateCountry(Country country);
    void deleteCountry(String id);
}