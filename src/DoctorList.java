import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class DoctorList {
	
	private static ArrayList<Doctors> Cardiologists = new ArrayList<Doctors>();
	private static ArrayList<Doctors> Neurologists = new ArrayList<Doctors>();
	private static ArrayList<Doctors> Gastroentrologists = new ArrayList<Doctors>();
	private static ArrayList<Doctors> Ostiopath = new ArrayList<Doctors>();
	private static ArrayList<Doctors> Pathologists = new ArrayList<Doctors>();
	private static ArrayList<Doctors> ENT = new ArrayList<Doctors>();
	private static ArrayList<Doctors> Oncologists = new ArrayList<Doctors>();
	
	public DoctorList(){}
	
	
	public DoctorList(int x){
		
		Cardiologists.add(new Doctors("DCar001", "Dr. A. Bose","Cardiology"));
		Cardiologists.add(new Doctors("DCar002", "Dr. V. Roy","Cardiology"));
		Cardiologists.add(new Doctors("DCar003", "Dr. C. Ray","Cardiology"));
		Cardiologists.add(new Doctors("DCar004", "Dr. D. Sen","Cardiology"));
		Cardiologists.add(new Doctors("DCar005", "Dr. R. Pal","Cardiology"));
		Cardiologists.add(new Doctors("DCar006", "Dr. S. Bhattacharya","Cardiology"));
		
		Neurologists.add(new Doctors("DNeu001", "Dr. P. Basak","Neurology"));
		Neurologists.add(new Doctors("DNeu002", "Dr. B. Barat","Neurology"));
		Neurologists.add(new Doctors("DNeu003", "Dr. J. Banerjee","Neurology"));
		Neurologists.add(new Doctors("DNeu004", "Dr. S. Ukil","Neurology"));
		Neurologists.add(new Doctors("DNeu005", "Dr. D. Bhattacharya","Neurology"));
		
		Gastroentrologists.add(new Doctors("DGas001", "Dr. S. Pal","Gastroentrology"));
		Gastroentrologists.add(new Doctors("DGas002", "Dr. B. Roy","Gastroentrology"));
		Gastroentrologists.add(new Doctors("DGas003", "Dr. W. Shil","Gastroentrology"));
		Gastroentrologists.add(new Doctors("DGas004", "Dr. P. Mitter","Gastroentrology"));
		Gastroentrologists.add(new Doctors("DGas005", "Dr. L. Ganguly","Gastroentrology"));
		
		Ostiopath.add(new Doctors("DOst001", "Dr. T. Mitra","Ostiopathy"));
		Ostiopath.add(new Doctors("DOst002", "Dr. B. Sen","Ostiopathy"));
		Ostiopath.add(new Doctors("DOst003", "Dr. R. Ray","Ostiopathy"));
		Ostiopath.add(new Doctors("DOst004", "Dr. T. Dutta","Ostiopathy"));
		Ostiopath.add(new Doctors("DOst005", "Dr. E. Ghosh","Ostiopathy"));
		Ostiopath.add(new Doctors("DOst005", "Dr. Y. Singh","Ostiopathy"));
		
		Pathologists.add(new Doctors("DPat001", "Dr. B. Bakshi","Ostiopathy"));
		Pathologists.add(new Doctors("DPat002", "Dr. A. Sen","Ostiopathy"));
		Pathologists.add(new Doctors("DPat003", "Dr. G. Ghosh","Ostiopathy"));
		Pathologists.add(new Doctors("DPat004", "Dr. N. Bagchi","Ostiopathy"));
		Pathologists.add(new Doctors("DPat005", "Dr. A. Dutta","Ostiopathy"));
		
		ENT.add(new Doctors("DENT001", "Dr. D. Bairagi","ENT"));
		ENT.add(new Doctors("DENT002", "Dr. E. Malik","ENT"));
		ENT.add(new Doctors("DENT003", "Dr. S. Mullick","ENT"));
		ENT.add(new Doctors("DENT004", "Dr. S. Bandopadhyay","ENT"));
		ENT.add(new Doctors("DENT005", "Dr. T. Barik","ENT"));
		
		Oncologists.add(new Doctors("DOnc001", "Dr. S. Ganguly","Oncology"));
		Oncologists.add(new Doctors("DOnc002", "Dr. A. Saha","Oncology"));
		Oncologists.add(new Doctors("DOnc003", "Dr. M. Dey","Oncology"));
		Oncologists.add(new Doctors("DOnc004", "Dr. B. Holmes","Oncology"));
		Oncologists.add(new Doctors("DOnc005", "Dr. W. Guin","Oncology"));
		Oncologists.add(new Doctors("DOnc006", "Dr. D. Bera","Oncology"));
		Oncologists.add(new Doctors("DOnc007", "Dr. N. Mohant","Oncology"));
	}
	
	

	public void addToList(String name, String dept){
		String code = null;		
		switch(dept){
		
		case "Cardiology" : 	code = "D" + dept.substring(0,3) + String.format("%03d",Cardiologists.size()+1);
								Cardiologists.add(new Doctors(code,name,dept));
								break;
		case "Neurology" : 		code = "D" + dept.substring(0,3) + String.format("%03d",Neurologists.size()+1);
								Neurologists.add(new Doctors(code,name,dept));
								break;
		case "Gastroentrology" : code = "D" + dept.substring(0,3) + String.format("%03d",Gastroentrologists.size()+1);
								Gastroentrologists.add(new Doctors(code,name,dept));
								break;
		case "Ostiopathy" : 	code = "D" + dept.substring(0,3) + String.format("%03d",Ostiopath.size()+1);
								Ostiopath.add(new Doctors(code,name,dept));
								break;
		case "Pathology" : 		code = "D" + dept.substring(0,3) + String.format("%03d",Pathologists.size()+1);
								Pathologists.add(new Doctors(code,name,dept));
								break;
		case "ENT" : 			code = "D" + dept.substring(0,3) + String.format("%03d",ENT.size()+1);
								ENT.add(new Doctors(code,name,dept));
								break;
		case "Oncology" : 		code = "D" + dept.substring(0,3) + String.format("%03d",Oncologists.size()+1);
								Oncologists.add(new Doctors(code,name,dept));
								break;
		}
	}
	
	public ArrayList<Doctors> getCardiologists(){
		return Cardiologists;
	}
	public ArrayList<Doctors> getNeurologists(){
		return Neurologists;
	}
	public ArrayList<Doctors> getOncologists(){
		return Oncologists;
	}
	public ArrayList<Doctors> getOstioPaths(){
		return Ostiopath;
	}
	public ArrayList<Doctors> getGastroentrologists(){
		return Gastroentrologists;
	}
	public ArrayList<Doctors> getPathologists(){
		return Pathologists;
	}
	public ArrayList<Doctors> getENTs(){
		return ENT;
	}
	
	public void ShowList(){
		
		final JList<Doctors> docList = new JList<Doctors>();
		final String[] deptList = {"Cardiology","Neurology","Gastroentrology","Ostiopathy","Pathology","ENT","Oncology"};
		final JComboBox<String> Dept = new JComboBox<String>(deptList);
		final JTextArea Details = new JTextArea();
		
		Details.setBorder(BorderFactory.createTitledBorder("Details"));
		
		docList.setFont(new Font("Comic Sans MS", Font.PLAIN, 9));
		docList.setVisibleRowCount(6);
		docList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		Dept.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			
				if(e.getStateChange()==ItemEvent.SELECTED){
					DefaultListModel model = new DefaultListModel();
					
					ArrayList d = new ArrayList<>();
					DoctorList dl = new DoctorList();
					switch(Dept.getSelectedIndex()){
						
					case 0 : d = Cardiologists;
							break;
					case 1 : d = Neurologists;
							break;
					case 2 : d = Gastroentrologists;
							break;
					case 3 : d = Ostiopath;
							break;
					case 4 : d = Pathologists;
							break;
					case 5 : d = ENT;
							break;
					case 6 : d = Oncologists;
							break;
					
					}
					
					for(int x=0;x<d.size();x++){
						model.addElement(d.get(x));
					}
					docList.setModel(model);
				}
			}
		});
		
		docList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				ArrayList d = new ArrayList<>();
				switch(Dept.getSelectedIndex()){
					
				case 0 : d = Cardiologists;
						break;
				case 1 : d = Neurologists;
						break;
				case 2 : d = Gastroentrologists;
						break;
				case 3 : d = Ostiopath;
						break;
				case 4 : d = Pathologists;
						break;
				case 5 : d = ENT;
						break;
				case 6 : d = Oncologists;
						break;
				
				}
				
				int index = docList.getSelectedIndex();
				if(index<0)
					index=0;
				Doctors dr = (Doctors) d.get(index);
				Details.setText("Doctor ID : "+dr.getDoctorID());
				Details.append("\nDoctor Name : "+dr.getDoctorName());
				Details.append("\nSpecialization : "+dr.getSpecialization());
				Details.append("\nNumber of Patients assigned : "+dr.getNoOfPatients());
				
			}
		});
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(Dept);
		panel1.add(new JScrollPane(docList));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 2,6,6));
		panel2.add(panel1);
		panel2.add(Details);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1, 2, 6, 6));
		
		final JTextField newDoc = new JTextField(20);
		final JButton add = new JButton("+");
		final JButton Show = new JButton("Show Patients");
		final JButton Cancel = new JButton("Cancel");
		
		panel3.add(new JLabel("Add a new Doctor to the selected department "));
		panel3.add(newDoc);
		panel3.add(add);
		newDoc.setMaximumSize(new Dimension(500, 30));
		
		panel4.add(Show);
		panel4.add(Cancel);
		
		final JPanel panel5 = new JPanel();
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
		panel5.add(panel2);
		panel5.add(panel3);
		panel5.add(panel4);
		
		final JTextArea patients = new JTextArea();
		patients.setPreferredSize(new Dimension(240, 250));
		patients.setBorder(BorderFactory.createTitledBorder("Patients of this Doctor"));
		final JPanel panel7 = new JPanel();
		panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));
		panel7.add(panel5);
		
		final JFrame f = new JFrame("Available Doctors");
		f.add(panel7);
		f.setVisible(true);
		f.setSize(500,250);
		f.setLocation(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				Register r = new Register();
				String code = Details.getText().substring(12,19);
				patients.setText(r.ListPatients(code));
				panel7.add(patients,BorderLayout.EAST);
				panel7.revalidate();
				panel7.repaint();
				f.add(panel7);
				f.setSize(700, 250);
				f.revalidate();
				f.repaint(); 
			}
		});
		
		Cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(newDoc.getText().equals("")){
					return;
				}
				if(!newDoc.getText().substring(0,3).equals("Dr.")){
					newDoc.setText("Dr."+newDoc.getText());
				}
				String name = newDoc.getText();
				String code = deptList[Dept.getSelectedIndex()];
				//JOptionPane.showMessageDialog(null, code, name, JOptionPane.PLAIN_MESSAGE);
				addToList(name, code);
				docList.revalidate();
			}
		});
		
		
	}
	
	public void AssignPatient(String docId){
		
		ArrayList d = new ArrayList<>();
		switch(docId.substring(1,4)){
			
		case "Car" : d = Cardiologists;
				break;
		case "Neu" : d = Neurologists;
				break;
		case "Gas" : d = Gastroentrologists;
				break;
		case "Ost" : d = Ostiopath;
				break;
		case "Pat" : d = Pathologists;
				break;
		case "ENT" : d = ENT;
				break;
		case "Onc" : d = Oncologists;
				break;
		}
		
		int index = Integer.parseInt(docId.substring(4));
		Doctors dr = (Doctors)d.get(index-1);
		dr.setNoOfPatients();
	}
	
	
	

}
