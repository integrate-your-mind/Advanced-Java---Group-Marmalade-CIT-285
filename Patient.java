/*
 * Copyright (c) Roman Mondello
 */

package sample;

public class Patient extends Account {

    protected String mInsuranceNumber;
    protected TestResult[] mTestResults;
    protected Appointment[] mAppointments;
    protected Medication[] mMedications;
    protected Bill[] mBills;
    protected Questionaire[] mQuestionnaires;
    protected Reminder[] reminders;
    protected Goal[] goals;

    public String getInsuranceNumber() {
        return mInsuranceNumber;
    }

    public static class PatientBuilder<C extends Patient,
            B extends PatientBuilder <C, B>> extends
            AccountBuilder <C, B> {
        public Builder() {
            this((C) new Patient());
        }

        protected Builder(C obj) {
            super(obj);
        }

        B setInsuranceNumber(String insuranceNumber) {
            obj.mInsuranceNumber = insuranceNumber;
            return (B) this;
        }

        B setTestResults(TestResult[] testResults) {
            obj.mTestResults = testResults;
            return (B) this;
        }

        B setAppointments(Appointment[] appointments) {
            obj.mAppointments = appointments;
            return (B) this;
        }

        B setMedications(Medication[] medications) {
            obj.mMedications = medications;
            return (B) this;
        }

        B setBills(Bill[] bills) {
            obj.mBills = bills;
            return (B) this;
        }

        B setQuestionaires(Questionaire[] questionaires) {
            obj.mQuestionnaires = questionaires;
            return (B) this;
        }

        B setReminders(Reminder[] reminders) {
            obj.reminders = reminders;
            return (B) this;
        }

        B setGoals(Goal[] goals) {
            obj.goals = goals;
            return (B) this;
        }
    }
}
