/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import java.awt.*;
import App.EditClient;
import Models.Client;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDialog;
/**
 *
 * @author bvlul
 */
public class ClientLabel extends javax.swing.JPanel {
    Client client;
    EditClient edWindow;
    ShowClients showClients;
    JDialog dial;
    /**
     * Creates new form ClientLabel
     */
    public ClientLabel(Client x, ShowClients y){
        initComponents();
        client = x;
        showClients = y;
        String middleName = (client.getMName() == null)? "" : client.getMName();
        this.Name.setText(client.getName()+" "+middleName+" "+client.getLName());
        this.Comp.setText(client.getCompany());
        this.phone.setText(client.getPhone());
        this.pos.setText(client.getLatitude()+", "+client.getLongitude());
        this.setVisible(true);
        this.setBackground(new Color(245,245,245));
        this.repaint();
        
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        Comp = new javax.swing.JLabel();
        pos = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();

        Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name.setText("Nombre");

        jLabel1.setText("Teléfono:");

        jLabel2.setText("Empresa:");

        phone.setText("jLabel3");

        Comp.setText("jLabel3");

        pos.setText("jLabel3");

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Comp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phone))
                            .addComponent(Name))
                        .addContainerGap(175, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Editar)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Comp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos)
                    .addComponent(Editar))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
                        edWindow = new EditClient(client, showClients);
                edWindow.setVisible(true);
                
                //edWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                edWindow.setVisible(true);
                edWindow.setSize(400,400);
                dial = new JDialog();
                dial.setVisible(true);
                dial.add(edWindow);
                dial.pack();
                dial.repaint();
    }//GEN-LAST:event_EditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comp;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel pos;
    // End of variables declaration//GEN-END:variables


}
