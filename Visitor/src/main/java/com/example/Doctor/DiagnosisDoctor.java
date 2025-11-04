package com.example.Doctor;

import com.example.Patient.AdultPatient;
import com.example.Patient.ChildPatient;
import com.example.Patient.SeniorPatient;

public class DiagnosisDoctor implements Doctor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("DiagnosisDoctor is diagnosing a child patient.");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("DiagnosisDoctor is diagnosing an adult patient.");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("DiagnosisDoctor is diagnosing a senior patient.");
    }
}
