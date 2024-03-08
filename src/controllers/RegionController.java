package controllers;

import daos.RegionDAO;
import tools.DbConnections;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import models.Region;

public class RegionController {
    private RegionDAO regionDAO;

    public RegionController(Connection connection) {
        this.regionDAO = new RegionDAO(connection);
    }

    //Method unutk menambah region ke database 
    public void addRegion (int id, String name){

        try {
            Region region = new Region(id, name);
            regionDAO.addRegion(region);
            System.out.println("Region added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding region: " + e.getMessage());
        }
       
    }

    //Method unutk mendapatkan semua data region
    public void getAllRegions() {
        try {
            List<Region> regions = regionDAO.getAllRegions();
            for (Region region : regions){
                System.out.println("ID: " + region.getId() + ", Name: " + region.getName());
            }
        } catch (SQLException e){
            System.out.println("Error getting regions: " + e.getMessage());
        }
    }

    // Method untuk mendapatkan region data sesuai id
    public void getRegionById(int regionId) {
        try {
            Region region = regionDAO.getRegionById(regionId);
            if (region != null) {
                System.out.println("Region found - ID: " + region.getId() + ", Name: " + region.getName());
            } else {
                System.out.println("Region not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error getting region by ID: " + e.getMessage());
        }
    }

    //Method untuk melakukan update
    public void updateRegion(int id, String name) {
        try {
            regionDAO.updateRegion(id, name);
            System.out.println("Region updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating region: " + e.getMessage());
        }
    }

    //Method untuk menghapus region by id
    public void deleteRegion(int id) {
        try {
            regionDAO.deleteRegion(id);
            System.out.println("Region deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting region: " + e.getMessage());
        }
    }

    // Method untuk mencari region berdasarkan nama
    public void searchByName(String name) {
        try {
            List<Region> regions = regionDAO.searchByName(name);
            if (!regions.isEmpty()) {
                System.out.println("Regions found by name '" + name + "':");
                for (Region region : regions) {
                    System.out.println("ID: " + region.getId() + ", Name: " + region.getName());
                }
            } else {
                System.out.println("No regions found by name '" + name + "'.");
            }
        } catch (SQLException e) {
            System.out.println("Error searching regions by name: " + e.getMessage());
        }
    }
}
