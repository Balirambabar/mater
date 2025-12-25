package com.Insurance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@Table(name="Citizen_Plan")
public class CitizenPlan {
    //mysql generation type - we need to use identity
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer citizenId;
    private String citizenName;
    private String citizenGender;
    private String planName;
    private String planStatus;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double benefitAmt;
    private LocalDate TerminationDate;
    private String terminationReason;


}
