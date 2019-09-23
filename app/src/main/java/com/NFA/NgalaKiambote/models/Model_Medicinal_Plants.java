package com.NFA.NgalaKiambote.models;

public class Model_Medicinal_Plants {

    private int images;
    private String name;
    private String common_name;
    private String geographical_location;
    private String habitat;
    private String species_description;
    private String use;
    private String parts_used;

    public Model_Medicinal_Plants() {

    }

    public Model_Medicinal_Plants(int images, String name, String common_name, String geographical_location, String habitat, String species_description, String use, String parts_used) {
        this.images = images;
        this.name = name;
        this.common_name = common_name;
        this.geographical_location = geographical_location;
        this.habitat = habitat;
        this.species_description = species_description;
        this.use = use;
        this.parts_used = parts_used;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getGeographical_location() {
        return geographical_location;
    }

    public void setGeographical_location(String geographical_location) {
        this.geographical_location = geographical_location;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSpecies_description() {
        return species_description;
    }

    public void setSpecies_description(String species_description) {
        this.species_description = species_description;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getParts_used() {
        return parts_used;
    }

    public void setParts_used(String parts_used) {
        this.parts_used = parts_used;
    }
}
