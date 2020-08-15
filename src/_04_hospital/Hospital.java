package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
}
