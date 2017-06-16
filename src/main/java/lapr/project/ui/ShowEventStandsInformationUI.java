/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lapr.project.controller.ShowEventStandsInformationController;
import lapr.project.model.EventCenter;
import lapr.project.model.Stand;
import lapr.project.model.StandRegistry;

/**
 *
 * @author MarioDias
 */
public class ShowEventStandsInformationUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private ShowEventStandsInformationController controller;
    private final EventCenter eventCenter;
    private StandRegistry standRegistry;
    private DefaultListModel<Stand> modelStand = new DefaultListModel<>();
    private float[][] intervalMatrix;

    /**
     * Creates new form ShowEventStandsInformationUI
     *
     * @param eventCenter
     */
    public ShowEventStandsInformationUI(EventCenter eventCenter) {
        initComponents();
        this.eventCenter = eventCenter;
        controller = new ShowEventStandsInformationController(this.eventCenter);
        standRegistry = controller.getStandRegistry();
        standJList.setModel(modelStand);
        SturgesRule();

        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        intervalsCombobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        standJList = new javax.swing.JList<>();
        Interval = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frequencyTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show Event Stands");
        setResizable(false);

        jLabel1.setText("Stands List:");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        intervalsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalsComboboxActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(standJList);

        Interval.setText("jLabel2");

        jLabel2.setText("Frequency:");

        frequencyTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intervalsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Interval)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frequencyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Interval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(intervalsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(frequencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void intervalsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalsComboboxActionPerformed
        modelStand.clear();
        for (int i = 0; i < standRegistry.size(); i++) {
            if (standRegistry.getStand(i).getArea() < intervalMatrix[intervalsCombobox.getSelectedIndex()][1] && standRegistry.getStand(i).getArea() > intervalMatrix[intervalsCombobox.getSelectedIndex()][0]) {
                modelStand.addElement(standRegistry.getStand(i));
            }
        }
        float n = (float)modelStand.size() / standRegistry.size();
        float frequency = (n*100);
        frequencyTextField.setText(String.format("%.2f%%",frequency));
    }//GEN-LAST:event_intervalsComboboxActionPerformed

    private void SturgesRule() {
        int totalAmplitude = TotalAmplitude();
        int k = (int) (1 + 3.3 * Math.log10((double) standRegistry.size()));
        int amplitude = totalAmplitude / k;
        createElements(amplitude, k);
    }

    private void createElements(int amplitude, int k) {
        float value = standRegistry.getStand(0).getArea();
        intervalMatrix = new float[k][2];
        for (int i = 0; i < k; i++) {
            intervalMatrix[i][0] = value;
            intervalMatrix[i][1] = value + amplitude;
            intervalsCombobox.addItem("[ " + intervalMatrix[i][0] + " ; " + intervalMatrix[i][1] + " ]");
            value += amplitude;
        }
    }

    private int TotalAmplitude() {
        int ta = 0;
        standRegistry.sort();
        float min = standRegistry.getStand(0).getArea();
        float max = standRegistry.getStand(standRegistry.size() - 1).getArea();
        ta = Math.round(max - min);
        return ta;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Interval;
    private javax.swing.JTextField frequencyTextField;
    private javax.swing.JComboBox<String> intervalsCombobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Stand> standJList;
    // End of variables declaration//GEN-END:variables
}
