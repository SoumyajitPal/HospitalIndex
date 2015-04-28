import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Register extends Patients {
	
	private static JTextField id;
	private static JTextField name;
	private static JTextField docId;
	private static JTextField date;
	private static JTextArea history;
	
	private static JTextField hRate;
	private static JTextField bpHigh;
	private static JTextField bpLow;
	private static JTextField temp;
	
	
	private Date CheckInDate;
	private ArrayList<Obseravtions> Records = new ArrayList<Obseravtions>();
	private static ArrayList<Patients> patientList = new ArrayList<Patients>();
	private static ArrayList<Register> registerList = new ArrayList<Register>();
	
	
	private static JButton Create;
	private static JButton Cancel;
	private static JComboBox<String> Dept;
	
	private static JList docList;
	
	private static JRadioButton New;
	private static JRadioButton Old;
	private static JFrame f;
	
	public Register(){
		
	}
	
	public Register(int x){
		patientList.add(new Patients("P. Mahato","238811","Cardiology","DCar003","Consistent High Pressure for 7 years"));
		patientList.add(new Patients("S. Das","11343","Cardiology","DCar001","No history"));
		patientList.add(new Patients("W. Barman","44112","Neurology","DNeu003","Dementia symptoms"));
		patientList.add(new Patients("R. Dikshit","998235","Neurology","DNeu002","Optical nerves affected by blaze"));
		patientList.add(new Patients("S. Shil","44129","Neurology","DNeu001","Left hand paralysed, recoverable"));
		patientList.add(new Patients("A. Mondal","51164","Pathology","DPat003","No History"));
		patientList.add(new Patients("J. Roy","50332","Ostiopathy","DOst002","Fractured left collar bone"));
		patientList.add(new Patients("F. Paul","46130","Gastroentrology","DGas004","Traces of ulcer"));
		patientList.add(new Patients("S. Saxena","61190","Gastroentrology","DGas001","Gall Bladder stone"));
		patientList.add(new Patients("N. Gokhale","87234","Oncology","DOnc003","Malignant tumour found and removed"));
		patientList.add(new Patients("D. Ujjain","23423","Oncology","DOnc002","Liver cancer \nRadiations 1st stage"));
		patientList.add(new Patients("A Banerjee","76234","Oncology","DOnc001","Cancerous tumour in left lung"));
		patientList.add(new Patients("S. Malhotra","83421","ENT","DENT005","Short of hearing, left ear"));
		patientList.add(new Patients("N. Nishant","134753","ENT","DENT003","Nasal blockage, severe pain"));
		patientList.add(new Patients("R. Rakshit","22422","ENT","DENT001","Throat infection"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy      hh:m::ss", Locale.ENGLISH);
		
		registerList.add(new Register("P. Mahato","238811","Cardiology","DCar003","Consistent High Pressure for 7 years",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("S. Das","11343","Cardiology","DCar001","No history",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("W. Barman","44112","Neurology","DNeu003","Dementia symptoms",sdf.format(new Date(114, 12, 3, 4, 7, 13))));
		registerList.add(new Register("R. Dikshit","998235","Neurology","DNeu002","Optical nerves affected by blaze",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("S. Shil","44129","Neurology","DNeu001","Left hand paralysed, recoverable",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("A. Mondal","51164","Pathology","DPat003","No History",sdf.format(new Date(114, 5, 3, 4, 7, 13))));
		registerList.add(new Register("J. Roy","50332","Ostiopathy","DOst002","Fractured left collar bone",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("F. Paul","46130","Gastroentrology","DGas004","Traces of ulcer",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("S. Saxena","61190","Gastroentrology","DGas001","Gall Bladder stone",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("N. Gokhale","87234","Oncology","DOnc003","Malignant tumour found and removed",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("D. Ujjain","23423","Oncology","DOnc002","Liver cancer \nRadiations 1st stage",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("A Banerjee","76234","Oncology","DOnc001","Cancerous tumour in left lung",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("S. Malhotra","83421","ENT","DENT005","Short of hearing, left ear",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("N. Nishant","134753","ENT","DENT003","Nasal blockage, severe pain",sdf.format(new Date(114, 10, 3, 4, 7, 13))));
		registerList.add(new Register("R. Rakshit","22422","ENT","DENT001","Throat infection",sdf.format(new Date(114, 7, 3, 4, 7, 13))));
		
	}
	
	public Register(String n, String id, String dept, String docId, String h, String d){
		super(n,id,dept,docId,h);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy      hh:m::ss", Locale.ENGLISH);
		try {
			CheckInDate = sdf.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DoctorList dl = new DoctorList();
		dl.AssignPatient(docId);
	}
	
	public String ListPatients(String code){
		String text = "";
		Register r = new Register();
		for(int x=0; x<registerList.size(); x++){
			r = (Register)registerList.get(x);
			if(r.DoctorID.equals(code)){
				text = text + "\n" + r.PatientName;
			}
		}
		return text;
	}
	
	
	public void Admit(){
		
		id = new JTextField(30);
		name = new JTextField(30);
		docId = new JTextField(30);
		date = new JTextField(30);
		history = new JTextArea();
		
		history.setBorder(BorderFactory.createTitledBorder("Medical History"));
		
		String[] deptList = {"Cardiology","Neurology","Gastroentrology","Ostiopathy","Pathology","ENT","Oncology"};
		
		New = new JRadioButton("New Patient");
		Old = new JRadioButton("Old Patient(have ID)");
		
		DefaultListModel model = new DefaultListModel();
		
		ArrayList d = new ArrayList<>();
		DoctorList drl = new DoctorList();
		d = drl.getCardiologists();
		for(int x=0;x<d.size();x++){
			model.addElement(d.get(x));
		}
		

		
		Create = new JButton("Admit Patient");
		Cancel = new JButton("Cancel");
		docList = new JList<Doctors>();
		docList.setModel(model);
		
		
		Dept = new JComboBox<String>(deptList);
		
		Dept.setPreferredSize(new Dimension(140, 10));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy          hh:mm:ss");
		int Today = Calendar.getInstance().get(Calendar.DATE);
		int Month = Calendar.getInstance().get(Calendar.MONTH);
		int Year = Calendar.getInstance().get(Calendar.YEAR);
		
		int Hour = Calendar.getInstance().get(Calendar.HOUR);
		int Minute = Calendar.getInstance().get(Calendar.MINUTE);
		int Second = Calendar.getInstance().get(Calendar.SECOND);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Year, Month, Today, Hour, Minute, Second);
		date.setText(sdf.format(cal.getTime()));
		date.setEditable(false);
		
		docList.setFont(new Font("Comic Sans MS", Font.PLAIN, 9));
		docList.setVisibleRowCount(6);
		docList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		ButtonGroup group = new ButtonGroup();
		group.add(New);
		group.add(Old);
		Old.setSelected(true);
		
		New.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					Random r = new Random();
					id.setText(Integer.toString(r.nextInt(100000)));
					id.setEditable(false);
				}
			}
		});
		
		Old.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED){
					id.setText("");
					id.setEditable(true);
					
				}
			}
		});
		
		Actionhandler action = new Actionhandler();
		Dept.addItemListener(action);
		docList.addListSelectionListener(action);
		Create.addActionListener(action);
		Cancel.addActionListener(action);
		id.addActionListener(action);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4,2,5,5));
		panel1.add(Old);
		panel1.add(New);
		panel1.add(new JLabel("Patient ID"));
		panel1.add(id);
		panel1.add(new JLabel("Patient Name"));
		panel1.add(name);
		panel1.add(new JLabel("Date"));
		panel1.add(date);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(Dept);
		panel2.add(new JScrollPane(docList));
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2,5,5));
		panel3.add(panel2);
		panel3.add(history);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(2, 2, 5, 5));
		panel4.add(new JLabel("Assigned Doctor Id"));
		panel4.add(docId);
		panel4.add(Create);
		panel4.add(Cancel);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
		panel5.add(panel1);
		panel5.add(panel3);
		panel5.add(panel4);
		
		f = new JFrame("Admit Patient");
		
		f.add(panel5);
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class Actionhandler implements ActionListener,ItemListener,ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			int dr = 1 + docList.getSelectedIndex();
			//JOptionPane.showMessageDialog(null, Dept.getSelectedItem().toString(), "Yay", JOptionPane.PLAIN_MESSAGE);
			docId.setText("D"+Dept.getSelectedItem().toString().substring(0,3)+String.format("%03d", dr));
			docId.setEditable(false);
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==Dept){
				if(e.getStateChange()==ItemEvent.SELECTED){
					DefaultListModel model = new DefaultListModel();
					
					ArrayList d = new ArrayList<>();
					DoctorList dl = new DoctorList();
					switch(Dept.getSelectedIndex()){
						
					case 0 : d = dl.getCardiologists();
							break;
					case 1 : d = dl.getNeurologists();
							break;
					case 2 : d = dl.getGastroentrologists();
							break;
					case 3 : d = dl.getOstioPaths();
							break;
					case 4 : d = dl.getPathologists();
							break;
					case 5 : d = dl.getENTs();
							break;
					case 6 : d = dl.getOncologists();
							break;
					
					}
					
					for(int x=0;x<d.size();x++){
						model.addElement(d.get(x));
					}
					
					
					docList.setModel(model);
					f.revalidate();
					f.repaint();
				}
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==id){
				int flag = 0;
				if(Old.isSelected()){
					
					if(id.getText().equals("")){
						//JOptionPane.showMessageDialog(null, "Bang", "Bang", JOptionPane.PLAIN_MESSAGE);
						return;
					}
					
					for(int x=0; x<patientList.size();x++){
						if(patientList.get(x).PatientID.equals(id.getText())){
							name.setText(patientList.get(x).PatientName);
							docId.setText(patientList.get(x).DoctorID);
							history.setText(patientList.get(x).MedicalHistory);
							flag = 1;
							
							break;
						}
					}
					
					if(flag==0){
						JOptionPane.showMessageDialog(null, "No Patient was found in database with ID "+id.getText(), "Error", JOptionPane.ERROR_MESSAGE);
						id.setText("");
						return;
					}
				}
				
				
			}
			
			else if(e.getSource()==Create){
					if(New.isSelected()){
					if(id.getText().equals("") || name.getText().equals("") || docId.getText().equals("")){
						return;
					}
					Patients p = new Patients();
					p.AdmissionBranch = Dept.getSelectedItem().toString();
					p.DoctorID = docId.getText();
					p.MedicalHistory = history.getText();
					p.PatientID = id.getText();
					p.PatientName = name.getText();
					
					patientList.add(p);
					
					Register r = new Register();
					
					r.AdmissionBranch = p.AdmissionBranch;
					r.DoctorID = p.DoctorID;
					r.MedicalHistory = p.MedicalHistory;
					r.PatientID = p.PatientID;
					r.PatientName = p.PatientName;
					try {
						r.CheckInDate = (new SimpleDateFormat("dd MMMM yyyy    hh:mm:ss")).parse(date.getText());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					DoctorList dl = new DoctorList();
					dl.AssignPatient(docId.getText());
					registerList.add(r);
				}
					
					else if(Old.isSelected()){
						if(id.getText().equals("")){
							JOptionPane.showMessageDialog(null, "Enter ID", "", JOptionPane.PLAIN_MESSAGE);
							return;
						}
						Register r = new Register();
						r.AdmissionBranch = Dept.getSelectedItem().toString();
						r.DoctorID = docId.getText();
						r.MedicalHistory = history.getText();
						r.PatientID = id.getText();
						r.PatientName = name.getText();
						try {
							r.CheckInDate = (new SimpleDateFormat("dd MMMM yyyy    hh:mm:ss")).parse(date.getText());
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						DoctorList dl = new DoctorList();
						dl.AssignPatient(docId.getText());
						registerList.add(r);
					}
					
					f.dispose();
			}
			else if(e.getSource()==Cancel){
				f.dispose();
				
			}
		}
		
	}
	
	public void Discard(){
		
		id = new JTextField(30);
		date = new JTextField(30);
		name = new JTextField(30);
		Create = new JButton("Check Out");
		Cancel = new JButton("Cancel");
		final JTextField toDate = new JTextField(30);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy          hh:mm:ss");
		int Today = Calendar.getInstance().get(Calendar.DATE);
		int Month = Calendar.getInstance().get(Calendar.MONTH);
		int Year = Calendar.getInstance().get(Calendar.YEAR);
		
		int Hour = Calendar.getInstance().get(Calendar.HOUR);
		int Minute = Calendar.getInstance().get(Calendar.MINUTE);
		int Second = Calendar.getInstance().get(Calendar.SECOND);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Year, Month, Today, Hour, Minute, Second);
		toDate.setText(sdf.format(cal.getTime()));
		toDate.setEditable(false);
		date.setEditable(false);
		name.setEditable(false);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2, 5, 5));
		panel.add(new JLabel("Patient ID"));
		panel.add(id);
		panel.add(new JLabel("Check In Date"));
		panel.add(date);
		panel.add(new JLabel("Check Out Date"));
		panel.add(toDate);
		panel.add(new JLabel("Bill Amount : "));
		panel.add(name);
		panel.add(Create);
		panel.add(Cancel);
		
		f = new JFrame("Check Out");
		f.add(panel);
		f.setVisible(true);
		f.setSize(500,200);
		f.setLocation(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		id.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int flag = -1;
				if(id.getText().equals("")){
					return;
				}
				for(int x=0; x<registerList.size(); x++){
					if(id.getText().equals(registerList.get(x).PatientID)){
						SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy     hh:mm:ss");
						date.setText(sdf.format(registerList.get(x).CheckInDate));
						flag = x;
						int days = 0;
						try {
							days = sdf.parse(toDate.getText()).getDate() - sdf.parse(date.getText()).getDate() ;
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						double d = (double)(1+days)*400;
						name.setText(Double.toString(d));
						break;
					}
				}
				if(flag==-1){
					JOptionPane.showMessageDialog(null, "No Such Patient ID found", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		
		Create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int flag = -1;
				if(id.getText().equals("")){
					return;
				}
				for(int x=0; x<registerList.size(); x++){
					if(id.getText().equals(registerList.get(x).PatientID)){
						registerList.remove(x);
						flag = x;
						f.dispose();
					}
				}
				if(flag==-1){
					JOptionPane.showMessageDialog(null, "No Such Patient ID found", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		
		Cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		
		
	}
	
	public void showDetails(){
		id = new JTextField(30);
		name = new JTextField(30);
		docId = new JTextField(30);
		history = new JTextArea();
		final JTextArea obs = new JTextArea();
		obs.setBorder(BorderFactory.createTitledBorder("Observations"));
		history.setBorder(BorderFactory.createTitledBorder("Medical History"));
		
		name.setEditable(false);
		history.setEditable(false);
		docId.setEditable(false);
		
		name.setEditable(false);
		final JTextField dept = new JTextField(30);
		final JTextField docName = new JTextField(30);
		
		docName.setEditable(false);
		dept.setEditable(false);
		
		Create = new JButton("Show");
		Cancel = new JButton("Cancel");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2, 5, 5));
		panel.add(new JLabel("Patient ID"));
		panel.add(id);
		panel.add(new JLabel("Patient Name"));
		panel.add(name);
		panel.add(new JLabel("Assigned Doctor ID"));
		panel.add(docId);
		panel.add(new JLabel("Doctor Name"));
		panel.add(docName);
		panel.add(new JLabel("Department concerned"));
		panel.add(dept);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2,5,5));
		panel2.add(Create);
		panel2.add(Cancel);
		
		JPanel panel3 = new JPanel();
		
		f = new JFrame("Patient Details");
		
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(panel);
		panel3.add(new JScrollPane(history));
		panel3.add(new JScrollPane(obs));
		panel3.add(panel2);
		
		f.add(panel3);
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int flag = 0;
				if(id.getText().equals("")){
					//JOptionPane.showMessageDialog(null, "Bang", "Bang", JOptionPane.PLAIN_MESSAGE);
					return;
				}
				obs.setText("");
				for(int x=0; x<registerList.size();x++){
					if(registerList.get(x).PatientID.equals(id.getText())){
						name.setText(registerList.get(x).PatientName);
						docId.setText(registerList.get(x).DoctorID);
						history.setText(registerList.get(x).MedicalHistory);
						dept.setText(registerList.get(x).AdmissionBranch);
						for(int y=0; y<registerList.get(x).Records.size(); y++){
							obs.append(registerList.get(x).Records.get(y).toString());
						}
						ArrayList d = new ArrayList<>();
						DoctorList dl = new DoctorList();
						switch(registerList.get(x).AdmissionBranch){
							
						case "Cardiology" : d = dl.getCardiologists();
											break;
						case "Neurology" : d = dl.getNeurologists();
											break;
						case "Gastroentrology" : d = dl.getGastroentrologists();
											break;
						case "Ostiopathy" : d = dl.getOstioPaths();
											break;
						case "Pathology" : d = dl.getPathologists();
											break;
						case "ENT" : d = dl.getENTs();
											break;
						case "Oncology" : d = dl.getOncologists();
											break;
						
						}
						Doctors dr = (Doctors)d.get(Integer.parseInt(docId.getText().substring(5))-1); 
						docName.setText(dr.getDoctorName());
						flag = 1;
						
						break;
					}
				}
				
				if(flag==0){
					JOptionPane.showMessageDialog(null, "No Patient was found in database with ID "+id.getText(), "Error", JOptionPane.ERROR_MESSAGE);
					id.setText("");
					return;
				}
			}
		});
		
		Cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		
		
	}
	
	public void ListOfPatients(){
		
		Register r = new Register();
		
		JTextArea area = new JTextArea();
		area.append("PatientID" + "\t" + "PatientName" + "\t\t" + "AdmissionBranch" + "\t" + "DoctorID" + "\n");
		for(int x=0; x<registerList.size(); x++){
			r = (Register)registerList.get(x);
			if(r.AdmissionBranch.equals("Gastroentrology"))
				area.append(r.PatientID + "\t" + r.PatientName + "\t\t" + r.AdmissionBranch + "\t" + r.DoctorID + "\n");
			else
				area.append(r.PatientID + "\t" + r.PatientName + "\t\t" + r.AdmissionBranch + "\t\t" + r.DoctorID + "\n");
		}
		area.setBorder(BorderFactory.createBevelBorder(8, Color.green, Color.black));
		area.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
		area.setEditable(false);
		final JFrame f = new JFrame();
		Cancel = new JButton("Back");
		Cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(area, BorderLayout.NORTH);
		panel.add(Cancel, BorderLayout.WEST);
		f.add(panel);
		f.setVisible(true);
		f.setSize(500,340);
		f.setLocation(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void RecordObservations(){
		
		id = new JTextField(30);
		name = new JTextField(30);
		docId = new JTextField(30);
		
		hRate = new JTextField(15);
		bpHigh = new JTextField(15);
		bpLow = new JTextField(15);
		temp = new JTextField(15);
		
		hRate.setBorder(BorderFactory.createTitledBorder("Heart Rate"));
		bpHigh.setBorder(BorderFactory.createTitledBorder("Blodd Pressure(Systolic)"));
		bpLow.setBorder(BorderFactory.createTitledBorder("Blood Pressure(Diastolic)"));
		temp.setBorder(BorderFactory.createTitledBorder("Body Temperature"));
		
		Create = new JButton("Add Record");
		Cancel = new JButton("Cancel");
		
		RecordHandler rH = new RecordHandler();
		
		Create.addActionListener(rH);
		Cancel.addActionListener(rH);
		id.addActionListener(rH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2,5,5));
		panel.add(new JLabel("Patient ID"));
		panel.add(id);
		panel.add(new JLabel("Patient Name"));
		panel.add(name);
		panel.add(new JLabel("Doctor ID"));
		panel.add(docId);
		panel.add(hRate);
		panel.add(temp);
		panel.add(bpHigh);
		panel.add(bpLow);
		panel.add(Create);
		panel.add(Cancel);
		
		f = new JFrame();
		f.add(panel);
		f.setVisible(true);
		f.setSize(500,300);
		f.setLocation(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private class RecordHandler implements ActionListener{

		private int index = -1;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==id){
				Register r = new Register();
				if(id.getText().equals("")){
					return;
				}
				for(int x=0; x<registerList.size(); x++){
					r = (Register)registerList.get(x);
					if(r.PatientID.equals(id.getText())){
						index = x;
						name.setText(r.PatientName);
						break;
					}
				}
				if(index==-1){
					JOptionPane.showMessageDialog(null, "No such patient ID in database", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(e.getSource()==Create){
				if(index==-1){
					JOptionPane.showMessageDialog(null, "Invalid Patient ID", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(docId.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Invalid Doctor ID", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				Register r = new Register();
				r = (Register)registerList.get(index);
				if(!docId.getText().equals(r.DoctorID)){
					JOptionPane.showMessageDialog(null, "This Patient is not under your care sir.", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(hRate.getText().equals("") || bpHigh.getText().equals("") || bpLow.getText().equals("") || temp.getText().equals("")){
					return;
				}
				int h = Integer.parseInt(hRate.getText());
				int bpH = Integer.parseInt(bpHigh.getText());
				int bpL = Integer.parseInt(bpLow.getText());
				float t = Float.parseFloat(temp.getText());
				SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy          hh:mm:ss");
				int Today = Calendar.getInstance().get(Calendar.DATE);
				int Month = Calendar.getInstance().get(Calendar.MONTH);
				int Year = Calendar.getInstance().get(Calendar.YEAR);
				
				int Hour = Calendar.getInstance().get(Calendar.HOUR);
				int Minute = Calendar.getInstance().get(Calendar.MINUTE);
				int Second = Calendar.getInstance().get(Calendar.SECOND);
				
				Calendar cal = Calendar.getInstance();
				cal.set(Year, Month, Today, Hour, Minute, Second);
				registerList.get(index).Records.add(new Obseravtions(h, bpH, bpL, t,cal.getTime()));
				f.dispose();
			}
			
			else if(e.getSource()==Cancel){
				f.dispose();
			}
		}
		
		
	}
	
	

}
