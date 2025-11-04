package com.example.Doctor;

import com.example.Patient.AdultPatient;
import com.example.Patient.ChildPatient;
import com.example.Patient.SeniorPatient;

public interface Doctor {
    void visit(ChildPatient childPatient);
    void visit(AdultPatient adultPatient);
    void visit(SeniorPatient seniorPatient);
}
