package models;

public class Country {
    private String id;
    private String name;
    private String region;

    public Country() {
    }

    public Country(String id, String name, String region) {
        this.id = id;
        this.name = name;
        this.region = region;
    }

    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return region;
    }

    public void setRegionId(String region) {
        this.region = region;
    }
}