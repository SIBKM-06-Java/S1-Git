package controllers;

import daos.RegionDAO;
import daos.RegionDAOImpl;
import models.Region;
import views.RegionView;

import java.util.List;

public class RegionController {
    private RegionDAO regionDAO;
    private RegionView regionView;

    public RegionController() {
        regionDAO = new RegionDAOImpl();
        regionView = new RegionView();
    }

    public void getAllRegions() {
        List<Region> regions = regionDAO.getAllRegions();
        regionView.displayRegions(regions);
    }

    public void getRegionById() {
        int id = regionView.getRegionId();
        Region region = regionDAO.getRegionById(id);
        regionView.displayRegion(region);
    }

    public void searchRegionByName() {
        String name = regionView.getRegionName();
        List<Region> regions = regionDAO.searchRegionByName(name);
        regionView.displayRegions(regions);
    }

    public void createRegion() {
        String name = regionView.getRegionName();
        Region region = new Region();
        region.setName(name);
        regionDAO.createRegion(region);
        System.out.println("Region created successfully!");
    }

    public void updateRegion() {
        int id = regionView.getRegionId();
        Region region = regionDAO.getRegionById(id);
        if (region != null) {
            String name = regionView.getRegionName();
            region.setName(name);
            regionDAO.updateRegion(region);
            System.out.println("Region updated successfully!");
        } else {
            System.out.println("Region not found!");
        }
    }

    public void deleteRegion() {
        int id = regionView.getRegionId();
        Region region = regionDAO.getRegionById(id);
        if (region != null) {
            regionDAO.deleteRegion(id);
            System.out.println("Region deleted successfully!");
        } else {
            System.out.println("Region not found!");
        }
    }
}