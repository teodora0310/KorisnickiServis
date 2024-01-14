package com.example.KorisnickiServis.domain;

import java.time.LocalDate;

public class Manager {

    private String gymName;

    private LocalDate dateOfHire;

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
}
