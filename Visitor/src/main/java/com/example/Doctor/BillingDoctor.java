package com.example.Doctor;

import com.example.Patient.AdultPatient;
import com.example.Patient.ChildPatient;
import com.example.Patient.SeniorPatient;

public class BillingDoctor implements Doctor{
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Billing for Child Patient: $50");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Billing for Adult Patient: $100");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Billing for Senior Patient: $70");
    }
}
