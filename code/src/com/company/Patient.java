package com.company;

import java.util.ArrayList;

public class Patient {

    private String birthDate;

    private String gender;

    private String basicInsurance;

    private String SupplementaryInsurance;

    private String educationalDegree;

    private String geographicalPosition;

    private String job;

    private String livingPlace;

    private ArrayList<Doctor> doctors;

    private MedicalRecord medicalRecord;

    public Patient(){
        doctors = new ArrayList<Doctor>();
        medicalRecord = new MedicalRecord();
    }

    public void printDoctors(){}

    public void chooseDoctor(){}

    public void addDoctor(Doctor newDoctor){}

    public void printMedicalRecord(){}

    //Setter and getter methods for all fields are removed.
}
