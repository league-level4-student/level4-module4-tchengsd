package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	@Override
	boolean performsSurgery() {
		return false;
	}
	@Override
	boolean makesHouseCalls() {
		return true;
	}
}
