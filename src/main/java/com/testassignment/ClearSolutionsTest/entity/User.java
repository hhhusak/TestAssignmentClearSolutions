package com.testassignment.ClearSolutionsTest.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotEmpty(message = "User's email should not be empty!")
    private String email;

    @NotEmpty(message = "User's first name should not be empty!")
    private String firstName;

    @NotEmpty(message = "User's last name should not be empty!")
    private String lastName;

    @NotEmpty(message = "User's birth date should not be empty!")
    private LocalDate birthDate;

}
