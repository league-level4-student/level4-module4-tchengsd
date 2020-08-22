package _04_hospital;

public class Patient {
	boolean caredFor = false;
	boolean feelsCaredFor() {
		return caredFor;
	}
	void checkPulse() {
		caredFor = true;
	}
}
