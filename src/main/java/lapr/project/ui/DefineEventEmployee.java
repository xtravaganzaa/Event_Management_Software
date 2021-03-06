/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lapr.project.controller.DefineEventEmployeeController;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployee;
import lapr.project.model.EventEmployeeList;
import lapr.project.model.EventRegistry;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class DefineEventEmployee extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private DefineEventEmployeeController controller;
    private DefaultListModel<User> modelUsersList = new DefaultListModel<>();
    private DefaultListModel<EventEmployee> modelEmployeesList = new DefaultListModel<>();
    private UserRegistry listUsers;
    private EventEmployeeList listEmployees;
    private EventRegistry listEvents;
    private EventCenter eventCenter;
    private Event event;
    private User user;

    /**
     * Creates new form DefineEventEmployee
     *
     * @param eventCenter
     */
    public DefineEventEmployee(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
        controller = new DefineEventEmployeeController(this.eventCenter);
        initComponents();

        eventEmployeeJList.setModel(modelEmployeesList);

        listUsers = controller.getUsersList();
        userJList.setModel(modelUsersList);
        for (int i = 0; i < listUsers.size(); i++) {
            modelUsersList.addElement(listUsers.getUser(i));
        }

        listEvents = controller.getEventList();
        for (int i = 0; i < listEvents.size(); i++) {
            eventComboBox.addItem(listEvents.getEvent(i));
        }

        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventEmployeeJList = new javax.swing.JList<EventEmployee>();
        jScrollPane2 = new javax.swing.JScrollPane();
        userJList = new javax.swing.JList<User>();
        addUserBtn = new javax.swing.JButton();
        removeUserBtn = new javax.swing.JButton();
        eventComboBox = new javax.swing.JComboBox<Event>();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        userIDTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Define Event Employee");

        jLabel1.setText("Event:");

        jLabel2.setText("Users List:");

        jLabel3.setText("Event Employee:");

        jScrollPane1.setViewportView(eventEmployeeJList);

        jScrollPane2.setViewportView(userJList);

        addUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon.png"))); // NOI18N
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        removeUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close-2-icon.png"))); // NOI18N
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

        eventComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventComboBoxActionPerformed(evt);
            }
        });

        okBtn.setText("Save");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Define employee by ID:");

        userIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magnifier-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeUserBtn)
                                    .addComponent(addUserBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(eventComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eventComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(addUserBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeUserBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        try {
            if (listEvents.size() == 0) {
                JOptionPane.showMessageDialog(null, "There are no events!");
            } else {
                User u = modelUsersList.getElementAt(userJList.getSelectedIndex());

                if (!checkEventEmployee(u.getUserName(), u.getEmail())) {
                    EventEmployee e = new EventEmployee(u, 0);
                    modelEmployeesList.addElement(e);
                } else {
                    JOptionPane.showMessageDialog(null, "This user is already in employee's list");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No user selected");
        }

    }//GEN-LAST:event_addUserBtnActionPerformed
    private boolean checkEventEmployee(String username, String email) {
        for (int i = 0; i < modelEmployeesList.size(); i++) {
            if (username.equals(modelEmployeesList.getElementAt(i).getUsername()) || email.equals(modelEmployeesList.getElementAt(i).getEmail())) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     */
    public void addEmployees() {
        event = (Event) eventComboBox.getSelectedItem();
        for (int i = 0; i < modelEmployeesList.size(); i++) {
            event.getEventEmployeeList().addEmployee(modelEmployeesList.getElementAt(i));
        }
    }

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        addEmployees();
        JOptionPane.showMessageDialog(null, "Employees defined with success!");
        dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    private void userIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTextFieldActionPerformed

        String userID = userIDTextField.getText();
        if (listEvents.size() == 0) {
            JOptionPane.showMessageDialog(null, "There are no events!");
        } else {
            if (!validateEmployee(userID)) {
                int cont = 0;
                for (int i = 0; i < listUsers.size(); i++) {
                    User u = listUsers.getUser(i);
                    if (u.getUserName().equals(userID) || u.getEmail().equals(userID)) {
                        EventEmployee e = new EventEmployee(u, 0);
                        listEmployees.addEmployee(e);
                        modelEmployeesList.addElement(e);
                        modelUsersList.removeElement(u);
                        cont++;
                    }
                }
                if (cont == 0) {
                    JOptionPane.showMessageDialog(null, "Given user doesn't exist");
                }
                cont = 0;
            } else {
                JOptionPane.showMessageDialog(null, "That user is already a Employee of that event");
            }
        }

        userIDTextField.setText("");

    }//GEN-LAST:event_userIDTextFieldActionPerformed

    /**
     *
     * @param id
     * @return
     */
    public boolean validateEmployee(String id) {
        for (int i = 0; i < listEmployees.size(); i++) {
            String[] split = listEmployees.getEmployee(i).toString().split("; ");
            split[0] = split[0].split(":")[1];
            split[1] = split[1].split(":")[1];
            split[2] = split[2].split(":")[1];
            if (split[1].equals(id) || split[2].equals(id)) {
                return true;
            }
        }
        return false;
    }

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void eventComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventComboBoxActionPerformed

        event = (Event) eventComboBox.getSelectedItem();

        if (eventComboBox.getSelectedItem().toString().equals(event.toString())) {
            modelEmployeesList.removeAllElements();
            updateEmployeeModel();
        } else {
            JOptionPane.showMessageDialog(null, "Already Selected");
        }
    }//GEN-LAST:event_eventComboBoxActionPerformed

    private void updateEmployeeModel() {
        listEmployees = event.getEventEmployeeList();
        for (int i = 0; i < listUsers.size(); i++) {
            if (i < listEmployees.size()) {
                modelEmployeesList.addElement(listEmployees.getEmployee(i));
            }
        }
    }

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserBtnActionPerformed
        try {
            EventEmployee e = modelEmployeesList.getElementAt(eventEmployeeJList.getSelectedIndex());
            modelEmployeesList.removeElement(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No employee selected");
        }
    }//GEN-LAST:event_removeUserBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<Event> eventComboBox;
    private javax.swing.JList<EventEmployee> eventEmployeeJList;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JTextField userIDTextField;
    private javax.swing.JList<User> userJList;
    // End of variables declaration//GEN-END:variables
}
