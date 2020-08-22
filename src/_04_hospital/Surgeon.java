package _04_hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	@Override
	boolean performsSurgery() {
		return true;
	}
	@Override
	boolean makesHouseCalls() {
		return false;
	}
}
