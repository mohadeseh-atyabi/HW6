package com.company;

import java.util.ArrayList;

public class Doctor {

    private String name;

    private ArrayList<Patient> patients;

    private String speciality;

    private String medicalNumber;

    private ArrayList<String> workPlaces;

    public Doctor(String name){
        this.name = name;
        patients = new ArrayList<Patient>();
        workPlaces = new ArrayList<String>();
    }

    public void referPatient(){}

    //Setter and getter methods for all fields are removed.
}
