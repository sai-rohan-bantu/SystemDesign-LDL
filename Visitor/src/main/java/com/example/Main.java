package com.example;

import com.example.Doctor.BillingDoctor;
import com.example.Doctor.DiagnosisDoctor;
import com.example.Doctor.Doctor;
import com.example.Patient.AdultPatient;
import com.example.Patient.ChildPatient;
import com.example.Patient.Patient;
import com.example.Patient.SeniorPatient;


public class Main {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern Example");

        Patient[] patients = {
                new ChildPatient(), new AdultPatient(), new SeniorPatient()};
        // Create visitors for different operations
        Doctor diagnosisVisitor = new DiagnosisDoctor();
        Doctor billingVisitor = new BillingDoctor();
        // Each patient accepts the visitors to perform the operations
        for (Patient patient : patients) {
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }
    }
}