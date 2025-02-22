package com.example.aurigraph.farmers.DTO;

import com.example.aurigraph.farmers.Domain.LandOwner;
import com.example.aurigraph.farmers.Domain.PropertyDetails;
import com.example.aurigraph.farmers.Domain.Witness;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

public class CompleteLandDetailsDTO {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAksmvbsMembershipNumber() {
        return aksmvbsMembershipNumber;
    }

    public void setAksmvbsMembershipNumber(String aksmvbsMembershipNumber) {
        this.aksmvbsMembershipNumber = aksmvbsMembershipNumber;
    }

    public List<LandOwner> getLandOwners() {
        return landOwners;
    }

    public void setLandOwners(List<LandOwner> landOwners) {
        this.landOwners = landOwners;
    }

    public List<PropertyDetails> getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(List<PropertyDetails> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }

    public List<Witness> getWitnesses() {
        return witnesses;
    }

    public void setWitnesses(List<Witness> witnesses) {
        this.witnesses = witnesses;
    }

    private String accountNumber;  // Account number


    private String accountHolder;  // Account Holder name


    private LocalDate dateCreated;


    private String ifscCode;  // IFSC Code

    private String swiftCode;  // SWIFT Code

    private String bank;  // Bank name


    private String branch;  // Branch name


    private String aksmvbsMembershipNumber;  // Membership Number

    private List<LandOwner> landOwners;

    private List<PropertyDetails> propertyDetails;

    private List<Witness> witnesses;

}
