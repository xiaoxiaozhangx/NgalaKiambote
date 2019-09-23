package com.NFA.NgalaKiambote.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model_User {

    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("user_patient")
    private String user_patient;

    @Expose
    @SerializedName("user_doctor")
    private String user_doctor;

    @Expose
    @SerializedName("user_nurse")
    private String user_nurse;

    @Expose
    @SerializedName("image")
    private String image;

    @Expose
    @SerializedName("email")
    private String email;

    @Expose
    @SerializedName("status")
    private String status;

    @Expose
    @SerializedName("weight")
    private double weight;

    @Expose
    @SerializedName("height")
    private double height;

    @Expose
    @SerializedName("bodyTemperature")
    private int body_temperature;

    @Expose
    @SerializedName("hearthBeat")
    private int hearth_beat;

    @Expose
    @SerializedName("success")
    private Boolean success;

    @Expose
    @SerializedName("message")
    private String message;

    @Expose
    @SerializedName("failure")
    private String failure;

    public Model_User() {

    }

    public Model_User(int id, String name, String user_patient, String user_doctor, String user_nurse, String image, String email, String status, double weight, double height, int body_temperature, int hearth_beat, Boolean success, String message, String failure) {
        this.id = id;
        this.name = name;
        this.user_patient = user_patient;
        this.user_doctor = user_doctor;
        this.user_nurse = user_nurse;
        this.image = image;
        this.email = email;
        this.status = status;
        this.weight = weight;
        this.height = height;
        this.body_temperature = body_temperature;
        this.hearth_beat = hearth_beat;
        this.success = success;
        this.message = message;
        this.failure = failure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_patient() {
        return user_patient;
    }

    public void setUser_patient(String user_patient) {
        this.user_patient = user_patient;
    }

    public String getUser_doctor() {
        return user_doctor;
    }

    public void setUser_doctor(String user_doctor) {
        this.user_doctor = user_doctor;
    }

    public String getUser_nurse() {
        return user_nurse;
    }

    public void setUser_nurse(String user_nurse) {
        this.user_nurse = user_nurse;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getBody_temperature() {
        return body_temperature;
    }

    public void setBody_temperature(int body_temperature) {
        this.body_temperature = body_temperature;
    }

    public int getHearth_beat() {
        return hearth_beat;
    }

    public void setHearth_beat(int hearth_beat) {
        this.hearth_beat = hearth_beat;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }
}
