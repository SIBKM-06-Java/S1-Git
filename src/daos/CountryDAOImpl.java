package daos;

import models.Country;
import tools.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDAOImpl implements CountryDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CountryDAOImpl() {
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
    }

    @Override
    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<>();
        try {
            String query = "SELECT * FROM countries";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getString("id"));
                country.setName(resultSet.getString("name"));
                country.setRegionId(resultSet.getString("region"));
                countries.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;
    }

    @Override
    public Country getCountryById(String id) {
        Country country = null;
        try {
            String query = "SELECT * FROM countries WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                country = new Country();
                country.setId(resultSet.getString("id"));
                country.setName(resultSet.getString("name"));
                country.setRegionId(resultSet.getString("region"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return country;
    }

    @Override
    public List<Country> searchCountryByName(String name) {
        List<Country> countries = new ArrayList<>();
        try {
            String query = "SELECT * FROM countries WHERE name LIKE ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getString("id"));
                country.setName(resultSet.getString("name"));
                country.setRegionId(resultSet.getString("region"));
                countries.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;
    }

    @Override
    public void createCountry(Country country) {
        try {
            String query = "INSERT INTO countries (id, name, region) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, country.getId());
            preparedStatement.setString(2, country.getName());
            preparedStatement.setString(3, country.getRegionId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCountry(Country country) {
        try {
            String query = "UPDATE countries SET name=?, region=? WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, country.getName());
            preparedStatement.setString(2, country.getRegionId());
            preparedStatement.setString(3, country.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCountry(String id) {
        try {
            String query = "DELETE FROM countries WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}