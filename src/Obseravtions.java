import java.text.SimpleDateFormat;
import java.util.Date;


public class Obseravtions {
	
	private int heartRate;
	private int BloodPressureHigh;
	private int BloodPressureLow;
	private float Temperature;
	private Date date;
	
	
	public Obseravtions(){
		
	}
	public Obseravtions(int h, int bpH, int bpL, float t, Date d){
		heartRate = h;
		BloodPressureHigh = bpH;
		BloodPressureLow = bpL;
		Temperature = t;
		date = d;
	}
	
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	public int getBloodPressureHigh() {
		return BloodPressureHigh;
	}
	public void setBloodPressureHigh(int bloodPressureHigh) {
		BloodPressureHigh = bloodPressureHigh;
	}
	public int getBloodPressureLow() {
		return BloodPressureLow;
	}
	public void setBloodPressureLow(int bloodPressureLow) {
		BloodPressureLow = bloodPressureLow;
	}
	public float getTemperature() {
		return Temperature;
	}
	public void setTemperature(float temperature) {
		Temperature = temperature;
	}
	public String toString(){
		return String.format("Heart Rate : %d\nBlodd Pressure : %d/%d\nTemperature : %f\n%s\n\n", heartRate,BloodPressureHigh,BloodPressureLow,Temperature,(new SimpleDateFormat("dd/MM/yyyy").format(date)));
	}
	
}
