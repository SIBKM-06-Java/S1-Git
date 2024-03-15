package daos;

import models.Region;
import tools.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegionDAOImpl implements RegionDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public RegionDAOImpl() {
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
    }

    @Override
    public List<Region> getAllRegions() {
        List<Region> regions = new ArrayList<>();
        try {
            String query = "SELECT * FROM regions";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Region region = new Region();
                region.setId(resultSet.getInt("id"));
                region.setName(resultSet.getString("name"));
                regions.add(region);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regions;
    }

    @Override
    public Region getRegionById(int id) {
        Region region = null;
        try {
            String query = "SELECT * FROM regions WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                region = new Region();
                region.setId(resultSet.getInt("id"));
                region.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return region;
    }

    @Override
    public List<Region> searchRegionByName(String name) {
        List<Region> regions = new ArrayList<>();
        try {
            String query = "SELECT * FROM regions WHERE name LIKE ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Region region = new Region();
                region.setId(resultSet.getInt("id"));
                region.setName(resultSet.getString("name"));
                regions.add(region);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regions;
    }

    @Override
    public void createRegion(Region region) {
        try {
            String query = "INSERT INTO regions (name) VALUES (?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateRegion(Region region) {
        try {
            String query = "UPDATE regions SET name=? WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getName());
            preparedStatement.setInt(2, region.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteRegion(int id) {
        try {
            String query = "DELETE FROM regions WHERE id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}