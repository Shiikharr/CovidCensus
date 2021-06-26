package com.example.covidcensus.model;

public class VaccineModel {

    private String vaccineCentre;
    private String vaccinationCharger;
    private String vaccinationAge;
    private String vaccinationTimings;
    private String vaccineName;
    private String vaccineCentreTime;
    private String vaccineCentreAddress;
    private String vaccineAvailable;

    public VaccineModel() {
    }

    public String getVaccineCentre() {
        return vaccineCentre;
    }

    public void setVaccineCentre(String vaccineCentre) {
        this.vaccineCentre = vaccineCentre;
    }

    public String getVaccinationCharger() {
        return vaccinationCharger;
    }

    public void setVaccinationCharger(String vaccinationCharger) {
        this.vaccinationCharger = vaccinationCharger;
    }

    public String getVaccinationAge() {
        return vaccinationAge;
    }

    public void setVaccinationAge(String vaccinationAge) {
        this.vaccinationAge = vaccinationAge;
    }

    public String getVaccinationTimings() {
        return vaccinationTimings;
    }

    public void setVaccinationTimings(String vaccinationTimings) {
        this.vaccinationTimings = vaccinationTimings;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCentreTime() {
        return vaccineCentreTime;
    }

    public void setVaccineCentreTime(String vaccineCentreTime) {
        this.vaccineCentreTime = vaccineCentreTime;
    }

    public String getVaccineCentreAddress() {
        return vaccineCentreAddress;
    }

    public void setVaccineCentreAddress(String vaccineCentreAddress) {
        this.vaccineCentreAddress = vaccineCentreAddress;
    }

    public String getVaccineAvailable() {
        return vaccineAvailable;
    }

    public void setVaccineAvailable(String vaccineAvailable) {
        this.vaccineAvailable = vaccineAvailable;
    }

    public VaccineModel(String vaccineCentre, String vaccinationCharger, String vaccinationAge, String vaccinationTimings, String vaccineName, String vaccineCentreTime, String vaccineCentreAddress, String vaccineAvailable) {
        this.vaccineCentre = vaccineCentre;
        this.vaccinationCharger = vaccinationCharger;
        this.vaccinationAge = vaccinationAge;
        this.vaccinationTimings = vaccinationTimings;
        this.vaccineName = vaccineName;
        this.vaccineCentreTime = vaccineCentreTime;
        this.vaccineCentreAddress = vaccineCentreAddress;
        this.vaccineAvailable = vaccineAvailable;
    }
}
