package PhoneBook;
import java.awt.Event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class HeraldPhoneBook implements ActionListener
{
    JFrame frame;
  JPanel panel_1,panel_2,panel_3,panel_4,panel_5;
  JLabel label_firstname;
  JLabel label_secondname;
  JLabel label_phone;
  JTextField textfield_1,textfield_2,textfield_3;
  JRadioButton radiobtn_1,radiobtn_2;
  ButtonGroup bg;
  JButton btn_clear;
  JButton btn_search;
  JButton btn_add;
  JButton btn_remove;
  JMenuBar menu_bar;
  JMenu menu_file,menu_edit,menu_help;
  JMenuItem Exit,Clear, Search,Add,Remove,About;
  JTable table_1;
  JScrollPane scroll_bar;
  JCheckBox check_box;
  TitledBorder border_1,border_2,border_3;
  DefaultTableModel table_model;
  Popup popup;
  
  HeraldPhoneBook(){
      //Start Frame Layout
  frame=new JFrame("Herald Phone BooK");
  frame.setSize(980,680);//setting size
  frame.setResizable(false);//frame cannot resize
  //frame.setLayout(new FlowLayout());//it does not let variable to overlap
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//it help the program from memory
  //End Frame Layout
  
//Start Panel Layout
  panel_1=new JPanel();
  panel_2=new JPanel();
  panel_3=new JPanel();
  panel_4=new JPanel();
  panel_5=new JPanel();
  //panel_1.setBackground(Color.BLACK);
  frame.add(panel_1);
  frame.add(panel_2 );
 frame.setLayout(new GridLayout(1,2));
 panel_2.setLayout(new GridLayout(3,1));
 panel_1.setLayout(new GridLayout(1,0));
 panel_2.add(panel_3);
 panel_2.add(panel_4);
 panel_2.add(panel_5);
//frame.add(panel_3);
//frame.add(panel_4);
//frame.add(panel_5);
panel_3.setLayout(new GridLayout(4,1));
panel_4.setLayout(new GridLayout(2,1)); 
panel_5.setLayout(new GridLayout(2,2));
  


//start adding table with scroll bar in frame
table_model=new DefaultTableModel();
table_1=new JTable(table_model);
//table_1.setCellEditor(false);

table_model.isCellEditable(100,4);

String model[]= {"","","",""};
table_model.setColumnIdentifiers(model);
//table_1.setModel(table_model);
table_1.setRowHeight(30);
try {
	
for(int i =0 ; i<100; i++) {
	Object [] rowwed = {"","","",""};
	table_model.addRow(rowwed);
	
 }
scroll_bar=new JScrollPane(table_1);
panel_1.add(scroll_bar);}
catch(ArrayIndexOutOfBoundsException array){
	System.out.println(array);
}


//end

//start radio button
radiobtn_1=new JRadioButton("Forename,Surname");
radiobtn_1.setToolTipText("Order By First Name , Last Name ");
radiobtn_1.addActionListener(this);


radiobtn_2=new JRadioButton("Surname,Forename");
radiobtn_2.setToolTipText("Order By Last Name , First Name ");
radiobtn_2.addActionListener(this);

panel_4.add(radiobtn_1);
panel_4.add(radiobtn_2);
//end radio button

//start button grouping
bg=new ButtonGroup();
bg.add(radiobtn_1);
bg.add(radiobtn_2);
//end

//start labelling with textarea
label_firstname=new JLabel("First Name");//creating object
label_secondname=new JLabel("Second Name");
label_phone=new JLabel("Phone Number");
panel_3.add(label_firstname);
textfield_1=new JTextField(15);
textfield_1.setToolTipText("Enter your First Name");
textfield_1.setEditable(false);
//if(radiobtn_1.isSelected()) {
//	textfield_1.setEditable(false);
//	radiobtn_1.setSelected(true);
//}
panel_3.add(textfield_1);//adding text area to frame
panel_3.add(label_secondname);

textfield_2=new JTextField(15);
textfield_2.setToolTipText("Enter your Last Name");
textfield_2.setEditable(false);

panel_3.add(textfield_2);
panel_3.add(label_phone);
textfield_3=new JTextField(15);
textfield_3.setToolTipText("Enter your Phone Number");
textfield_3.setEditable(false);
panel_3.add(textfield_3);
textfield_1.addActionListener(this);
textfield_2.addActionListener(this);
textfield_3.addActionListener(this);

//end 	




//start button
btn_clear=new JButton("Clear");
btn_clear.setMnemonic(KeyEvent.VK_C);
btn_clear.setToolTipText("Clear Text Field Area");
btn_clear.addActionListener(this);


btn_search=new JButton("Search");
btn_search.setMnemonic(KeyEvent.VK_S);
btn_search.setToolTipText("Search Phone Book");
btn_search.addActionListener(this);

btn_add=new JButton("Add");
btn_add.setMnemonic(KeyEvent.VK_A);
btn_add.setToolTipText("Add Information In Phone Book");
btn_add.addActionListener(this);


btn_remove=new JButton("Remove");
btn_remove.setMnemonic(KeyEvent.VK_R);
btn_remove.setToolTipText("Remove Information In Selected Row ");
btn_remove.addActionListener(this);


panel_5.add(btn_clear);
panel_5.add(btn_search);
panel_5.add(btn_add);
panel_5.add(btn_remove);
//end

//start creating menu bar and adding menu items
menu_bar=new JMenuBar();
menu_file=new JMenu("File");
menu_file.setMnemonic(KeyEvent.VK_F);
menu_file.setToolTipText("Open File");

menu_edit=new JMenu("Edit");
menu_edit.setMnemonic(KeyEvent.VK_E);
menu_edit.setToolTipText("Open Edit");

menu_help=new JMenu("Help");
menu_help.setMnemonic(KeyEvent.VK_H);
menu_help.setToolTipText("Open Help");

Exit=new JMenuItem("Exit");
Exit.setToolTipText("Exit Phone Book");
Exit.setMnemonic(KeyEvent.VK_E);
Exit.addActionListener( this);

Clear= new JMenuItem("Clear");
Clear.setMnemonic(KeyEvent.VK_C);
Clear.setToolTipText("Clear Text Field Area");
Clear.addActionListener(this);

Search=new JMenuItem("Search");
Search.setMnemonic(KeyEvent.VK_S);
Search.setToolTipText("Search Phone Book");
Search.addActionListener(this);

Add=new JMenuItem("Add");
Add.setMnemonic(KeyEvent.VK_A);
Add.setToolTipText("Add Information In Phone Book");
Add.addActionListener(this);


Remove=new JMenuItem("Remove");
Remove.setMnemonic(KeyEvent.VK_R);
Remove.setToolTipText("Remove Information In Selected Row ");
Remove.addActionListener(this);

About= new JMenuItem("About");
About.setMnemonic(KeyEvent.VK_A);
About.setToolTipText("About Phone Book ");
About.addActionListener(this);

menu_file.add(Exit);
menu_edit.add(Clear);
menu_edit.add(Search);
menu_edit.addSeparator();
menu_edit.add(Add);
menu_edit.add(Remove);
menu_help.add(About);


menu_bar.add(menu_file);
menu_bar.add(menu_edit);
menu_bar.add(menu_help);
frame.setJMenuBar(menu_bar);
//end

//start check box
check_box=new JCheckBox("Private");
check_box.setToolTipText("Select Private ");
panel_3.add(check_box);
check_box.addActionListener(this);
//end

//start titled border
border_1=new TitledBorder("Name:");
panel_1.setBorder(border_1);

border_2=new TitledBorder("Info:");
panel_3.setBorder(border_2);

border_3=new TitledBorder("File as:");
panel_4.setBorder(border_3);
//end


frame.setVisible(true);}
  
 Object[] row = new Object[4];
 

 

 

  public void actionPerformed(ActionEvent e)
  {

	  
	  //Exit code start
	  if(e.getSource()==Exit) {
      System.exit(0);
          
  }
	  //Exit code End
	  
	  //message dialog code start
	  if(e.getSource()== About) {
		  
		JOptionPane.showMessageDialog(null, "This is still in Trial Version");  
	  }
	  //end
	 
		//Add Button code start
	 try {
	  if(e.getSource()==btn_add || e.getSource()==Add) {
		  

	        

            String FName = textfield_1.getText().toString();
             String lName = textfield_2.getText().toString();
           if(!FName.matches("[A-Za-z]+")||!lName.matches("[A-Za-z]+"))
                throw new NumberFormatException();

		  row[0] = textfield_1.getText();
	          row[1] = textfield_2.getText();
	          row[2] = Integer.parseInt(textfield_3.getText()); ;
	          
	          if(check_box.isSelected()){
	        	  row[3] = "Private";
	          }
	          else {row[3] = "";} 
	          // add row to the model
	          table_model.insertRow(0,row);	  
	  }
	  }
	  
	  catch(NumberFormatException a){
		  JOptionPane.showMessageDialog(null, "Error\n"
		  		+ "1.Text Field Must Be Blank\n"
				+"2.First And Last name should be in alphabetical order.Number's are not allowed\n"
		  		+ "3.Phone number should be in numerical order.Cannot take alphabet's.\n"
		  		+"4. Phone number only hold upto 9 digits");
		  		
		
		  }
		  //end
	  
		//start clear button code
	  if(e.getSource()==Clear || e.getSource()==btn_clear) {

		  textfield_1.setText("");
		  textfield_2.setText("");
		  textfield_3.setText("");
		  
		   }
		//end	 
	    
	 
	  
	  //start search button code
	  if(e.getSource()==btn_search || e.getSource()==Search) {
		  JOptionPane.showMessageDialog(null,"Search functionality will be\n" + 
		  		"supported in the professional version");
	  }
	  //end
	  
	  //start remove button
	  try {
		  
	  if(e.getSource()==btn_remove || e.getSource()==Remove) {
		int selectedrow=table_1.getSelectedRow();
		table_model.removeRow(selectedrow);
		for(int i =0 ; i<1; i++) {
			Object [] rowwed = {"","","",""};
			table_model.addRow(rowwed);
			
		 }
	  
	  }}
	  catch(ArrayIndexOutOfBoundsException exc){
		 // System.out.println(exc);
		 JOptionPane.showMessageDialog(null,"Please select the row first");
	  }
	  //end
	  
	  //start radio button one
	  
	  if(e.getSource()==radiobtn_1) { 		
		  textfield_1.setEditable(true);
		  textfield_2.setEditable(true);
		  textfield_3.setEditable(true);
		radiobtn_1.setEnabled(false);
		radiobtn_2.setEnabled(false);
	  }
	  if(e.getSource()==radiobtn_2) {
		  textfield_1.setEditable(true);
		  textfield_2.setEditable(true);
		  textfield_3.setEditable(true);
		 table_1.moveColumn(0, 1);
		 radiobtn_1.setEnabled(false);
			radiobtn_2.setEnabled(false);
	  }

  }
  public static void main (String args[]){
    HeraldPhoneBook obj=new HeraldPhoneBook();
     JOptionPane.showMessageDialog(null, "Please select any button in File as panel to enabled Text field Area");
    }
  
}
