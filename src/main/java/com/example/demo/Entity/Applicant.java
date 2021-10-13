package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "applicant")
public class Applicant {
    /*@Id
    private long id;*/

    private String name;
    private String gender;
    private long aadharNumber;


    public Applicant(String name,String gender,long aadharNumber){
        this.name = name;
        this.gender = gender;
        this.aadharNumber = aadharNumber;
    }

    public Applicant() {
    }


    /*public long getId(){
        return id;
    }*/

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public long getAadharNumber(){
        return aadharNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAadharNumber(long aadharNumber){
        this.aadharNumber = aadharNumber;
    }

}
