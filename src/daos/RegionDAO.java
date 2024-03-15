package daos;

import models.Region;

import java.util.List;

public interface RegionDAO {
    List<Region> getAllRegions();
    Region getRegionById(int id);
    List<Region> searchRegionByName(String name);
    void createRegion(Region region);
    void updateRegion(Region region);
    void deleteRegion(int id);
}