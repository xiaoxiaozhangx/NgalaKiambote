package com.Ngala.Kiambote.models;

public class Model_MedicinalPlants {

    private int image;
    private String name;
    private String common_name;
    private String geographical_location;
    private String habitat;
    private String species_description;
    private String utility;
    private String parts_used;

    public Model_MedicinalPlants() {
    }

    public Model_MedicinalPlants(int image, String name, String common_name, String geographical_location, String habitat, String species_description, String utility, String parts_used) {
        this.image = image;
        this.name = name;
        this.common_name = common_name;
        this.geographical_location = geographical_location;
        this.habitat = habitat;
        this.species_description = species_description;
        this.utility = utility;
        this.parts_used = parts_used;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getUtility() {
        return utility;
    }

    public void setUtility(String utility) {
        this.utility = utility;
    }

    public String getParts_used() {
        return parts_used;
    }

    public void setParts_used(String parts_used) {
        this.parts_used = parts_used;
    }
}
