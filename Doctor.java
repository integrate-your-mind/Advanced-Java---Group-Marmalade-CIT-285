package sample;

import java.util.Map;

public class Doctor extends Provider {
    
    //Roman Mondello
    private Patient currentPatient = new Patient();
    //Roman Mondello
    
    //Roman Mondello
    public void viewPatientRecord(Map<Account, Account> accounts, Account account){
        //Code goes here for viewing the patient record via a hashcode lookup
        //from the controller
        if(accounts.containsKey(account)){
            //Display a menu to view other statistics about the patient for the  doctor
            //if the user is found
            //Such as Diagnosis, Appointments, and Test Results
        }
    }
    //Roman Mondello
}
