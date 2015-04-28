
public class Doctors {
	
	private String DoctorID;
	private String DoctorName;
	private String Specialization;
	private int NoOfPatients = 0;
	
	public Doctors(String Id,String name,String sp){
		DoctorID = Id;
		DoctorName = name;
		Specialization = sp;
	}
	
	public void addDoctor(String Id,String name,String sp){
		
		setDoctorID(Id);
		setDoctorName(name);
		setSpecialization(sp);
		DoctorList d = new DoctorList();
		d.addToList(name,Id);
	}

	public String getDoctorID() {
		return DoctorID;
	}

	public void setDoctorID(String doctorID) {
		DoctorID = doctorID;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public int getNoOfPatients() {
		return NoOfPatients;
	}

	public void setNoOfPatients() {
		NoOfPatients++;
	}
	
	public String toString(){
		return String.format("%s : %s", DoctorID,DoctorName);
	}
	
	

}
