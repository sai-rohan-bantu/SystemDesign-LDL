package com.example.Patient;

import com.example.Doctor.Doctor;

public class SeniorPatient implements Patient {
    @Override
    public void accept(Doctor doctor) {
        doctor.visit(this);
    }
}
