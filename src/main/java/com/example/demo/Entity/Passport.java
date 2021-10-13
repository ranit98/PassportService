package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "passport")
public class Passport {

    private String name;
    private String gender;
    private long aadharNumber;
    private String issueDate;
    private String expiryDate;

    public Passport(String name,String gender,long aadharNumber,String issueDate,String expiryDate){
        this.name = name;
        this.gender = gender;
        this.aadharNumber = aadharNumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public Passport() {
    }


    /*public long getPassportId(){
        return passportId;
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

    public String getIssueDate(){
        return issueDate;
    }

    public String getexpiryDate(){
        return expiryDate;
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

    public void setIssueDate(String issueDate){
        this.issueDate = issueDate;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }
}
