package com.graduate.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer companyId;
    @NotNull
    private String companyName;
    private String companyBase;
    private String baseAirdrome;
    private String typesOfEnterprises;
    private String registeredCapital;
    private String legalRepresentative;
    private String contactInformationOfLegalPerson;
    private String termOfValidity;
    private String natureOfBusiness;

}
