package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	boolean performsSurgery() {
		return false;
	}
	boolean makesHouseCalls() {
		return false;
	}
	public void assignPatient(Patient p) throws DoctorFullException {
		if(patients.size() > 3) {
			throw new DoctorFullException();
		}
		else {
			patients.add(p);
		}
	}
	ArrayList<Patient> getPatients() {
		return patients;
	}
	void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).caredFor = true;
		}
	}
}
