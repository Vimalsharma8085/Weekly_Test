package com.Geekster.Weeklytest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job
{
    @Id
    private Long id;
    private String title;
    private String description;
    private String location;
    @Min(value = 20000,message = "salary should be above 20000")
    private double salary;
    private String companyEmail;

    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private Type jobtype;
    private LocalDate appliedDate;
}
