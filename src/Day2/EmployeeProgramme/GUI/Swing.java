package Day2.EmployeeProgramme.GUI;

import Day2.EmployeeProgramme.Models.Employee;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

import static Day2.EmployeeProgramme.Models.GenerateEmployee.employees;

/**
 * Created by nicholas.ball on 12/10/2016.
 */
public class Swing implements ActionListener {

    private static JFrame mainFrame;
    private static JPanel listPanel, fieldPanel;
    private static JList<Employee> employeeJList;
    private static JTextField txtFirstName, txtLastName,
            txtDob, txtHireDate, txtJobRole;

    private int tempId;

    public void invokeGui() {
        mainFrame = new JFrame("Employee Programme");
        mainFrame.setSize(800, 400);
        mainFrame.setBackground(Color.DARK_GRAY);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame,
                        "Are you sure? Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }
            }

        };
        mainFrame.addWindowListener(l);

        mainFrame.setJMenuBar(createMenu());

        //set gridLayout
        JPanel content = (JPanel) mainFrame.getContentPane();
        content.setLayout(new GridLayout(1, 2, 5, 5));
        content.setBackground(Color.ORANGE);

        prepareJList();

        listPanel = new JPanel();
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());
        scrollPane.setPreferredSize(new Dimension(380, 320));
        listPanel.add(scrollPane);

        content.add(listPanel);

        fieldPanel = new JPanel();
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employees Details");
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldPanel(), BorderLayout.CENTER);

        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH);
        content.add(fieldPanel);

        mainFrame.setVisible(true);

    }

    private JList<Employee> createEmployeeList() {
        DefaultListModel<Employee> listModel = new DefaultListModel<>();
        if(employees.size() > 0)
            for(Employee e : employees)
                listModel.addElement(e);

        employeeJList.setModel(listModel);

        return employeeJList;
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.GRAY);
        //file menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.addActionListener(this);

        JMenuItem newMi = new JMenuItem("New");
        newMi.setMnemonic(KeyEvent.VK_N);
        newMi.addActionListener(this);


        JMenuItem addMi = new JMenuItem("Add");
        addMi.setMnemonic(KeyEvent.VK_A);
        addMi.addActionListener(this);


        JMenuItem removeMi = new JMenuItem("Remove");
        removeMi.setMnemonic(KeyEvent.VK_R);
        removeMi.addActionListener(this);


        JMenuItem exitMi = new JMenuItem("Exit");
        exitMi.setMnemonic(KeyEvent.VK_X);
        exitMi.addActionListener(this);


        JMenu optionMenu = new JMenu("Option");
        optionMenu.setMnemonic(KeyEvent.VK_O);
        optionMenu.addActionListener(this);


        JMenuItem listMi = new JMenuItem("List");
        listMi.setMnemonic(KeyEvent.VK_L);
        listMi.addActionListener(this);


        JMenuItem searchMi = new JMenuItem("Search");
        searchMi.setMnemonic(KeyEvent.VK_S);
        searchMi.addActionListener(this);



        fileMenu.add(newMi);
        fileMenu.add(addMi);
        optionMenu.add(listMi);
        optionMenu.add(searchMi);
        fileMenu.add(removeMi);
        fileMenu.add(exitMi);

        menuBar.add(fileMenu);
        menuBar.add(optionMenu);

        return menuBar;
    }

    private JPanel createFieldPanel() {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5));

        JLabel lblFirstName = new JLabel("First Name: ");
        inputPanel.add(lblFirstName);
        txtFirstName = new JTextField();
        inputPanel.add(txtFirstName);

        JLabel lblLastName = new JLabel("Last Name: ");
        inputPanel.add(lblLastName);
        txtLastName = new JTextField();
        inputPanel.add(txtLastName);

        JLabel lblDob = new JLabel("DOB: (YYYY/MM/DD) ");
        inputPanel.add(lblDob);
        txtDob = new JTextField();
        inputPanel.add(txtDob);

        JLabel lblHireDate = new JLabel("Hire Date: (YYYY/MM/DD) ");
        inputPanel.add(lblHireDate);
        txtHireDate = new JTextField();
        inputPanel.add(txtHireDate);

        JLabel lblJobRole = new JLabel("Job Role: ");
        inputPanel.add(lblJobRole);
        txtJobRole= new JTextField();
        inputPanel.add(txtJobRole);

        return inputPanel;
    }


    private void prepareJList() {
        employeeJList = new JList<>();
        employeeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        employeeJList.addListSelectionListener(new ListSelectionListener() {

           @Override
           public void valueChanged(ListSelectionEvent e) {
               if(!employeeJList.getValueIsAdjusting()) {
                   if(!employeeJList.isSelectionEmpty()) {
                       tempId = employeeJList.getSelectedValue().getId();
                       if(tempId >= 0) {
                           loadEmployeeField(tempId);
                       }



                   }

           }
           }
        });
    }

    private JPanel createButtonPanel() {
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //implement action when a button is clicked
        btnPanel.add(btnUpdate);


        return btnPanel;
    }

    private void loadEmployeeField(int index) {
        Employee temp = employees.get(index);
        txtFirstName.setText(temp.getFirstName());
        txtLastName.setText(temp.getSurname());
        txtDob.setText(temp.getDob().toString());
        txtHireDate.setText(temp.getHireDate().toString());
        txtJobRole.setText(temp.getJobRole());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if("New".equals(action)) {

        }
        else if("Exit".equals(action)) {
            mainFrame.dispose();
            System.exit(0);
        }
        else if("list".equals(action)) {

        }
        else if("Search".equals(action)) {
    }

}}

