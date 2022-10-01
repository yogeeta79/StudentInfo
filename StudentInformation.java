import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StudentInformation {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Border emptyBorder = BorderFactory.createEmptyBorder();
        Border loweredBorderEtched = new EtchedBorder(EtchedBorder.LOWERED);
        String[] CountryList = {"Pakistan","India","China","UK"};

        final JFrame frame= new JFrame();
        frame.setLayout(null);
        frame.setBounds(300, 100,900, 600);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Student Registrations Form");

        JLabel Name = new JLabel("Name");
        Name.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Name.setBounds(100, 50, 200, 20);

        final JTextField Namef = new JTextField();
        Namef.setBounds(400, 45, 150, 25);
        Namef.setFont((new Font("Open Sans", Font.BOLD, 18)));

        final JLabel RollNo = new JLabel("Roll no");
        RollNo.setFont((new Font("Open Sans", Font.BOLD, 18)));
        RollNo.setBounds(100, 100, 400, 25);

        final	JTextField Rollnof = new JTextField();
        Rollnof.setBounds(400, 95, 150, 25);
        Rollnof.setFont((new Font("Open Sans", Font.BOLD, 18)));

        final JLabel Gender = new JLabel("Gender");
        Gender.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Gender.setBounds(100, 150, 100, 20);

        final JRadioButton r1=new JRadioButton("Male");
        final JRadioButton r2=new JRadioButton("Female");

        r1.setBackground(Color.BLUE);
        r2.setBackground(Color.BLUE);

        r1.setFont((new Font("Open Sans", Font.BOLD, 14)));
        r2.setFont((new Font("Open Sans", Font.BOLD, 14)));

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);

        r1.setBounds(400,145,100,30);
        r2.setBounds(500,145,100,30);


        JLabel Batch = new JLabel("Batch");
        Batch.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Batch.setBounds(100, 250, 100, 20);

        final JTextField Batchf = new JTextField();
        Batchf.setBounds(400, 245, 150, 25);
        Batchf.setFont((new Font("Open Sans", Font.BOLD, 18)));


        JLabel Section = new JLabel("Section");
        Section.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Section.setBounds(100, 200, 100, 20);

        final JTextField Sectionf = new JTextField();
        Sectionf.setBounds(400, 195, 150, 25);
        Sectionf.setFont((new Font("Open Sans", Font.BOLD, 18)));

        final JLabel Qualification = new JLabel("Qualification");
        Qualification.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Qualification.setBounds(100, 300, 150, 20);

        final JCheckBox checkBox1 = new JCheckBox("Metric");
        checkBox1.setBounds(400,295, 70,20);
        checkBox1.setBackground(Color.BLUE);

        final JCheckBox checkBox2 = new JCheckBox("College");
        checkBox2.setBounds(470,295, 80,20);
        checkBox2.setBackground(Color.BLUE);

        final JCheckBox checkBox3 = new JCheckBox("UnderGraduate");
        checkBox3.setBounds(550,295, 130,20);
        checkBox3.setBackground(Color.BLUE);

        final JCheckBox checkBox4 = new JCheckBox("Graduate");
        checkBox4.setBounds(670,295, 100,20);
        checkBox4.setBackground(Color.BLUE);

        checkBox1.setFont((new Font("Open Sans", Font.BOLD, 14)));
        checkBox2.setFont((new Font("Open Sans", Font.BOLD, 14)));
        checkBox3.setFont((new Font("Open Sans", Font.BOLD, 14)));
        checkBox4.setFont((new Font("Open Sans", Font.BOLD, 14)));

        JLabel Country = new JLabel("Country");
        Country.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Country.setBounds(100, 350, 100, 20);

        final JComboBox Countries = new JComboBox(CountryList);
        Countries.setBounds(400, 345, 150, 25);
        Countries.setSelectedIndex(2);
        Countries.setFont((new Font("Open Sans", Font.BOLD, 14)));

        JLabel Address = new JLabel("Address");
        Address.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Address.setBounds(100, 400, 100, 20);

        final JTextArea Addressf= new JTextArea();
        Addressf.setBounds(400, 395, 300, 75);
        Addressf.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Addressf.setBorder(loweredBorderEtched);

        JButton exit = new JButton("Clear");
        exit.setBounds(100,500,100,20);
        exit.setFont((new Font("Open Sans", Font.BOLD, 18)));

        JButton Print = new JButton("Display");
        Print.setBounds(600, 500, 100, 20);
        Print.setFont((new Font("Open Sans", Font.BOLD, 18)));

        JButton Create = new JButton("Save");
        Create.setFont((new Font("Open Sans", Font.BOLD, 18)));
        Create.setBounds(350, 500, 100, 20);

        frame.add(Name);
        frame.add(Namef);
        frame.add(RollNo);
        frame.add(Rollnof);
        frame.add(Batch);
        frame.add(Batchf);
        frame.add(Section);
        frame.add(Sectionf);
        frame.add(Gender);
        frame.add(r1);
        frame.add(r2);
        frame.add(Qualification);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);
        frame.add(Address);
        frame.add(Addressf);
        frame.add(Country);
        frame.add(Countries);
        frame.add(exit);
        frame.add(Print);
        frame.add(Create);

        exit.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       System.exit(0);
                                   }
                               }
        );

        Create.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                String Name=Namef.getText();

                String Rollno=Rollnof.getText();
                String Batch=Batchf.getText();
                String gender;
                if(r1.isSelected()) {
                    gender="Male";
                }
                else{
                    gender="Female";
                }
                String Section= Sectionf.getText();
                String Country=(String) Countries.getSelectedItem();
                String Address= Addressf.getText();
                String Quali = "";
                if(checkBox1.isSelected()) {
                    Quali+="  Matric";
                }
                if(checkBox2.isSelected()) {
                    Quali+=",  College";
                }if(checkBox3.isSelected()) {
                    Quali+="  UnderGraduate";
                }if(checkBox4.isSelected()) {
                    Quali+="  Graduate";
                }

                JSONObject obj = new JSONObject();
                obj.put("Name",Name);
                obj.put("Gender",gender);
                obj.put("Rollno",Rollno);
                obj.put("Batch",Batch);
                obj.put("Section",Section);
                obj.put("Qualification",Quali);
                obj.put("Country",Country);
                obj.put("Address",Address);
                try {
                    FileWriter file = new FileWriter("StudentInfo.json");
                    file.write(obj.toString());
                    file.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        Print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String Print;
                Object obj;
                try {
                    obj = new JSONParser().parse(new FileReader("StudentInfo.json"));
                    JSONObject read = (JSONObject) obj;
                    Print = "Name = "+read.get("Name")+"\nRollno = "+read.get("Rollno")+"\nGender = "+read.get("Gender");
                    Print+="\nBatch = "+read.get("Batch")+"\nSection = "+read.get("Section")+"\nQualifciation = "+read.get("Qualification");
                    Print+="\nCountry = "+read.get("Country")+"\nAddress = "+read.get("Address");
                    JOptionPane.showMessageDialog(frame, Print);
                } catch (IOException | ParseException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        frame.setVisible(true);
    }
}


