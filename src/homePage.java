import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class homePage extends JFrame {
	
	private static JButton CheckIn;
	private static JButton CheckOut;
	private static JButton Details;
	private static JButton AvailableDoctors;
	private static JButton Records;
	private static JButton Patients;
	
	
	public homePage(){
		
		super("Hospital Management");
		
		CheckIn = new JButton("Check In");
		CheckOut = new JButton("Check Out");
		Details = new JButton("Details of a patient");
		AvailableDoctors = new JButton("List of Doctors");
		Records = new JButton("Medical Records of a patient");
		Patients = new JButton("List of Admitted patients");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,1,5,5));
		panel.add(CheckIn);
		panel.add(CheckOut);
		panel.add(Details);
		panel.add(AvailableDoctors);
		panel.add(Records);
		panel.add(Patients);
		
		
		ActionHandler action = new ActionHandler();
		
		CheckIn.addActionListener(action);
		CheckOut.addActionListener(action);
		Details.addActionListener(action);
		AvailableDoctors.addActionListener(action);
		Records.addActionListener(action);
		Patients.addActionListener(action);
		
		
		add(panel);
	}
	
	private class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==CheckIn){
				Register r = new Register();
				r.Admit();
			}
			else if(e.getSource()==CheckOut){
				Register r = new Register();
				r.Discard();
			}
			else if(e.getSource()==Details){
				Register r = new Register();
				r.showDetails();
			}
			else if(e.getSource()==AvailableDoctors){
				DoctorList d = new DoctorList();
				d.ShowList();
			}
			else if(e.getSource()==Patients){
				Register r = new Register();
				r.ListOfPatients();
			}
			else if(e.getSource()==Records){
				Register r = new Register();
				r.RecordObservations();
			}
		}
		
	}
}
