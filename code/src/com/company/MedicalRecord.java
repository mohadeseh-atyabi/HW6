package com.company;

import java.util.ArrayList;

public class MedicalRecord {

    private String description;

    private String diagnosis;

    private ArrayList<String> drugs;

    private String date;

    private ArrayList<Doctor> doctors;

    private String totalType;

    private SecurityLevel level;

    public MedicalRecord(){
        drugs = new ArrayList<String>();
        doctors = new ArrayList<Doctor>();
    }

    @Override
    public String toString(){}

    public void addDrug(String drug){}

    public void printDrugs(){}

    //Setter and getter methods for all fields are removed.
}
