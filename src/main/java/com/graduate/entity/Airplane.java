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
public class Airplane {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer airplaneId;
    @NotNull
    private String airplaneCompany;
    private String dateOfProduction;
    private Integer numberOfPeopleOnBoard;
}
