import javax.swing.JFrame;


public class mainClass {
	
	public static void main(String ars[]){
		
		homePage h = new homePage();
		h.setVisible(true);
		h.setSize(300,300);
		h.setLocation(350, 100);
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DoctorList d = new DoctorList(1);
		Register r = new Register(1);
	}

}
