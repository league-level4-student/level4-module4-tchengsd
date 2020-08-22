package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	void addPatient(Patient p) {
		patients.add(p);
	}
	ArrayList<Patient> getPatients() {
		return patients;
	}
	void assignPatientsToDoctors() {
		int currentDoctor = 0;
		for(int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(currentDoctor).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				currentDoctor++;
				i--;
			}
		}
	}
}
