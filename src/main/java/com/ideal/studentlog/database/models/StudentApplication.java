package com.ideal.studentlog.database.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class StudentApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NonNull
    Date appliedDate;

    @NonNull
    String approvedBy;

    @NonNull
    String name;

    @NonNull
    Date dateOfBirth;

    @NonNull
    String bloodGroup;

    @NonNull
    String birthRegistrationId;

    @NonNull
    String registrationId;

    @NonNull
    String presentAddress;

    @NonNull
    String permanentAddress;

    @NonNull
    String guardianName;

    String guardianEmail;

    @NonNull
    String guardianPhone;

    @NonNull
    Integer appliedForGrade;

        

}
