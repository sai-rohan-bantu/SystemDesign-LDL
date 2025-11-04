package com.example.Patient;

import com.example.Doctor.Doctor;

public class ChildPatient implements Patient {
    @Override
    public void accept(Doctor doctor) {
        doctor.visit(this);
    }
}
