import java.util.ArrayList;


public class Patients {
	
	protected String PatientName;
	protected String PatientID;
	protected String AdmissionBranch;
	protected String DoctorID;
	protected String MedicalHistory;
	
	public Patients(){
		
	}
	public Patients(String n, String id, String dept, String docId, String h){
		
		PatientName = n;
		PatientID = id;
		AdmissionBranch = dept;
		DoctorID = docId;
		MedicalHistory = h;
		
	}

}
