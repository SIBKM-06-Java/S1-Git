package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Region;

public class RegionDAO {
    private Connection connection;

    //Menginisialisasi koneksi
    public RegionDAO (Connection connection){
        this.connection = connection;
    }

    //Method untuk menambahkan region ke database
    public void addRegion(Region region) throws SQLException {
        String q = "INSERT INTO db_hr.region (id,name) VALUES(?,?)";
        
        try {
            PreparedStatement statement = connection.prepareStatement(q);
            statement.setInt(1, region.getId());
            statement.setString(2, region.getName());
            statement.executeUpdate();
        } catch (Exception e){
            System.out.println("Error DAO : " + e.getMessage());
        }
    }

    //Method untuk mendapatkan semua data region dari database
    public List<Region> getAllRegions () throws SQLException {
        List<Region> regionList = new ArrayList<>();
        String q = "SELECT * FROM db_hr.region";

        try (PreparedStatement statement = connection.prepareStatement(q); ResultSet result = statement.executeQuery()){
            while (result.next()){

                int id = result.getInt("id");
                String name = result.getString("name");

                Region region = new Region(id, name);
                regionList.add(region);
            }
        }

        return regionList;
       
    }

    //Method untuk mendapatkan region data sesuai id
    public Region getRegionById (int regionId) throws SQLException {

        String q = "SELECT * FROM db_hr.region WHERE id = ?";
        Region region = null;

        try (PreparedStatement statement = connection.prepareStatement(q)) {
            statement.setInt(1, regionId);
            try (ResultSet result = statement.executeQuery()){
                if (result.next()){
                    int id = result.getInt("id");
                    String name = result.getString("name");
                    region = new Region(id, name);
                }
            }
        }

        return region;
    }

    //Method untuk melakukan Update region
    public void updateRegion (int id, String name) throws SQLException {
        String q = "UPDATE db_hr.region SET name = ? WHERE id = ?";
        
        try (PreparedStatement statement = connection.prepareStatement(q)) {
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error DAO : " + e.getMessage());
        }
    }

    //Method untuk menghapus region by Id
    public void deleteRegion (int id) throws SQLException {
        String q = "DELETE FROM db_hr.region WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(q)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    //Method untuk cari region berdasarkan nama
    public List<Region> searchByName (String name) throws SQLException {
        List<Region> regions = new ArrayList<>();
        String q = "SELECT * FROM db_hr.region WHERE name LIKE = ?";

        try (PreparedStatement statement = connection.prepareStatement(q)){
            statement.setString(2, "%" + name + "%");
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()){
                    int id = result.getInt("id");
                    String regionName = result.getString("name");
                    Region region = new Region(id, regionName);
                    regions.add(region);
                }
            }
        } catch (Exception e) {
            System.out.println("Error DAO : " + e.getMessage());
        }
        return regions;
    }

}
