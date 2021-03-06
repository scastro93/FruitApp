package App;
import Models.*;
import BackCom.HTTP;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author juanrmz
 */
public class AddSupplier extends javax.swing.JPanel {

    List<String> fruitList = new ArrayList<String>();
    List<String> certList = new ArrayList<String>();

    /**
     * Creates new form AddSupplier
     */
    public AddSupplier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierName = new javax.swing.JTextField();
        supplierLName = new javax.swing.JTextField();
        LBL_name = new javax.swing.JLabel();
        LBL_lName = new javax.swing.JLabel();
        latitud = new javax.swing.JTextField();
        LBL_lat = new javax.swing.JLabel();
        LBL_long = new javax.swing.JLabel();
        longitud = new javax.swing.JTextField();
        LBL_tel = new javax.swing.JLabel();
        areaCode = new javax.swing.JTextField();
        supplierPhone = new javax.swing.JTextField();
        checkBoxMango = new javax.swing.JCheckBox();
        checkBoxFresa = new javax.swing.JCheckBox();
        checkBoxPina = new javax.swing.JCheckBox();
        checkBoxSandia = new javax.swing.JCheckBox();
        checkBoxLimon = new javax.swing.JCheckBox();
        checkBoxNaranja = new javax.swing.JCheckBox();
        checkBoxMelon = new javax.swing.JCheckBox();
        checkBoxUva = new javax.swing.JCheckBox();
        checkBoxMan = new javax.swing.JCheckBox();
        checkBoxManzana = new javax.swing.JCheckBox();
        checkBoxToronja = new javax.swing.JCheckBox();
        checkBoxAguac = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        otherFruit = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        SumbitSupplier = new javax.swing.JButton();
        otherCert = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addFruit = new javax.swing.JButton();
        addCert = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cancelSupplier = new javax.swing.JButton();

        //setTitle("Añadir Proveedor");
        setBackground(new java.awt.Color(153, 204, 255));
        //setResizable(false);

        LBL_name.setText("Nombre(s)");

        LBL_lName.setText("Apellidos");

        latitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latitudActionPerformed(evt);
            }
        });

        LBL_lat.setText("Lat.");

        LBL_long.setText("Long.");

        LBL_tel.setText("Tel.");

        areaCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCodeActionPerformed(evt);
            }
        });

        checkBoxMango.setText("Mango");
        checkBoxMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMangoActionPerformed(evt);
            }
        });

        checkBoxFresa.setText("Fresa");
        checkBoxFresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFresaActionPerformed(evt);
            }
        });

        checkBoxPina.setText("Piña");
        checkBoxPina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPinaActionPerformed(evt);
            }
        });

        checkBoxSandia.setText("Sandía");
        checkBoxSandia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSandiaActionPerformed(evt);
            }
        });

        checkBoxLimon.setText("Limón");
        checkBoxLimon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLimonActionPerformed(evt);
            }
        });

        checkBoxNaranja.setText("Naranja");
        checkBoxNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxNaranjaActionPerformed(evt);
            }
        });

        checkBoxMelon.setText("Melón");
        checkBoxMelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMelonActionPerformed(evt);
            }
        });

        checkBoxUva.setText("Uva");
        checkBoxUva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxUvaActionPerformed(evt);
            }
        });

        checkBoxMan.setText("Mandarina");
        checkBoxMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxManActionPerformed(evt);
            }
        });

        checkBoxManzana.setText("Manzana");
        checkBoxManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxManzanaActionPerformed(evt);
            }
        });

        checkBoxToronja.setText("Toronjas");
        checkBoxToronja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxToronjaActionPerformed(evt);
            }
        });

        checkBoxAguac.setText("Aguacate");
        checkBoxAguac.setToolTipText("");
        checkBoxAguac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAguacActionPerformed(evt);
            }
        });

        otherFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherFruitActionPerformed(evt);
            }
        });

        SumbitSupplier.setText("Añadir Proveedor");
        SumbitSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumbitSupplierActionPerformed(evt);
            }
        });

        otherCert.setToolTipText("");

        jLabel1.setText("Otros");

        addFruit.setText("+");
        addFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFruitActionPerformed(evt);
            }
        });

        addCert.setText("+");
        addCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCertActionPerformed(evt);
            }
        });

        jLabel3.setText("Certificaciones");

        cancelSupplier.setText("Cancelar");
        cancelSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxSandia)
                                            .addComponent(checkBoxMango))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxFresa)
                                            .addComponent(checkBoxLimon))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxNaranja)
                                            .addComponent(checkBoxPina)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxManzana)
                                            .addComponent(checkBoxMelon))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkBoxUva)
                                                .addGap(38, 38, 38)
                                                .addComponent(checkBoxMan))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkBoxToronja)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(checkBoxAguac))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(otherFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LBL_name)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(supplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LBL_lat)
                                                .addComponent(LBL_lName)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LBL_tel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(areaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(supplierLName)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(latitud, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(LBL_long)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(longitud))
                                                .addComponent(supplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SumbitSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(otherCert, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_lName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_lat)
                    .addComponent(LBL_long)
                    .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_tel)
                    .addComponent(areaCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxMango)
                    .addComponent(checkBoxFresa)
                    .addComponent(checkBoxPina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxSandia)
                    .addComponent(checkBoxLimon)
                    .addComponent(checkBoxNaranja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxMelon)
                    .addComponent(checkBoxUva)
                    .addComponent(checkBoxMan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxManzana)
                    .addComponent(checkBoxToronja)
                    .addComponent(checkBoxAguac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(addFruit))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(otherCert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SumbitSupplier)
                    .addComponent(cancelSupplier))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //pack();
    }// </editor-fold>//GEN-END:initComponents

    private void latitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latitudActionPerformed

    private void areaCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCodeActionPerformed

    private void checkBoxFresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFresaActionPerformed
        if(this.checkBoxFresa.isSelected()){
        this.fruitList.add("Fresa");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxFresa.isSelected()){
            this.fruitList.remove("Fresa");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
    }//GEN-LAST:event_checkBoxFresaActionPerformed

    private void checkBoxLimonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLimonActionPerformed
        if(this.checkBoxLimon.isSelected()){
        this.fruitList.add("Limón");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxLimon.isSelected()){
            this.fruitList.remove("Limón");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
    }//GEN-LAST:event_checkBoxLimonActionPerformed

    private void checkBoxMelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMelonActionPerformed
        if(this.checkBoxMelon.isSelected()){
        this.fruitList.add("Melón");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxMelon.isSelected()){
            this.fruitList.remove("Melón");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
    }//GEN-LAST:event_checkBoxMelonActionPerformed

    private void checkBoxUvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxUvaActionPerformed
        if(this.checkBoxUva.isSelected()){
            this.fruitList.add("Uva");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxUva.isSelected()){
               this.fruitList.remove("Uva");
               for(int i=0; i < this.fruitList.size(); i++){
                   System.out.println("[ "+this.fruitList.get(i)+" ]");
               }
        }
    }//GEN-LAST:event_checkBoxUvaActionPerformed

    private void SumbitSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumbitSupplierActionPerformed

        HTTP test = new HTTP("InitialToken");
//        Object[] supplierList = test.get("https://fruitappapi.azurewebsites.net/API/providers");
//        System.out.println(supplierList[0].getId());
        try {
            Supplier testSupplier =  new Supplier(this.supplierName.getText(), this.supplierLName.getText(), this.fruitList,this.certList);

            test.post(testSupplier, "https://fruitappapi.azurewebsites.net/API/providers");
        } catch (ProtocolException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dashboard window_db = new Dashboard();
        this.setVisible(false);
        window_db.setVisible(true);
    }//GEN-LAST:event_SumbitSupplierActionPerformed

    private void checkBoxNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxNaranjaActionPerformed
        if(this.checkBoxNaranja.isSelected()){
               this.fruitList.add("Naranja");
               for(int i=0; i < this.fruitList.size(); i++){
                   System.out.println("[ "+this.fruitList.get(i)+" ]");
               }
           }
        else if(!this.checkBoxNaranja.isSelected()){
               this.fruitList.remove("Naranja");
               for(int i=0; i < this.fruitList.size(); i++){
                   System.out.println("[ "+this.fruitList.get(i)+" ]");
               }
           }
    }//GEN-LAST:event_checkBoxNaranjaActionPerformed

    private void checkBoxMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMangoActionPerformed
           if(this.checkBoxMango.isSelected()){
               this.fruitList.add("Mango");
               for(int i=0; i < this.fruitList.size(); i++){
                   System.out.println("[ "+this.fruitList.get(i)+" ]");
               }
           }
           else if(!this.checkBoxMango.isSelected()){
               this.fruitList.remove("Mango");
               for(int i=0; i < this.fruitList.size(); i++){
                   System.out.println("[ "+this.fruitList.get(i)+" ]");
               }
           }
    }//GEN-LAST:event_checkBoxMangoActionPerformed

    private void checkBoxSandiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSandiaActionPerformed
        if(this.checkBoxSandia.isSelected()){
        this.fruitList.add("Sandía");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxUva.isSelected()){
            this.fruitList.remove("Sandía");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }    }//GEN-LAST:event_checkBoxSandiaActionPerformed

    private void checkBoxManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxManzanaActionPerformed
        if(this.checkBoxManzana.isSelected()){
        this.fruitList.add("Manzana");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxManzana.isSelected()){
            this.fruitList.remove("Manzana");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }    }//GEN-LAST:event_checkBoxManzanaActionPerformed

    private void checkBoxToronjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxToronjaActionPerformed
        if(this.checkBoxToronja.isSelected()){
        this.fruitList.add("Toronja");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxToronja.isSelected()){
            this.fruitList.remove("Toronja");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }    }//GEN-LAST:event_checkBoxToronjaActionPerformed

    private void checkBoxPinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPinaActionPerformed
        if(this.checkBoxPina.isSelected()){
        this.fruitList.add("Piña");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxPina.isSelected()){
            this.fruitList.remove("Piña");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }    }//GEN-LAST:event_checkBoxPinaActionPerformed

    private void checkBoxManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxManActionPerformed
        if(this.checkBoxMan.isSelected()){
        this.fruitList.add("Mandarina");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxMan.isSelected()){
            this.fruitList.remove("Mandarina");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }    }//GEN-LAST:event_checkBoxManActionPerformed

    private void checkBoxAguacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAguacActionPerformed
        if(this.checkBoxAguac.isSelected()){
        this.fruitList.add("Aguacate");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }
        else if(!this.checkBoxAguac.isSelected()){
            this.fruitList.remove("Aguacate");
            for(int i=0; i < this.fruitList.size(); i++){
                System.out.println("[ "+this.fruitList.get(i)+" ]");
            }
        }    }//GEN-LAST:event_checkBoxAguacActionPerformed

    private void otherFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherFruitActionPerformed
    }//GEN-LAST:event_otherFruitActionPerformed

    private void addFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFruitActionPerformed
        this.fruitList.add(this.otherFruit.getText());
        this.otherFruit.setText("");


    }//GEN-LAST:event_addFruitActionPerformed

    private void addCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCertActionPerformed
       this.certList.add(this.otherCert.getText());
       this.otherCert.setText("");
    }//GEN-LAST:event_addCertActionPerformed

    private void cancelSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSupplierActionPerformed
        Dashboard window_db = new Dashboard();
        this.setVisible(false);
        window_db.setVisible(true);
    }//GEN-LAST:event_cancelSupplierActionPerformed

    private String[] fruitListToArray(){
        String[] retArray = this.fruitList.toArray(new String[this.fruitList.size()]);
        // System.out.println("bar.length = " + retArray.length);
        return retArray;
    }
    private String[] certListToArray(){
        String[] retArray;
        retArray = new String[] {"", "", "", "", ""};
        //String[] retArray = this.certList.toArray(new String[this.certList.size()]);
        // System.out.println("bar.length = " + retArray.length);
        return retArray;
    }


    public static void main(String args[]) throws IOException {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplier().setVisible(true);
            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_lName;
    private javax.swing.JLabel LBL_lat;
    private javax.swing.JLabel LBL_long;
    private javax.swing.JLabel LBL_name;
    private javax.swing.JLabel LBL_tel;
    private javax.swing.JButton SumbitSupplier;
    private javax.swing.JButton addCert;
    private javax.swing.JButton addFruit;
    private javax.swing.JTextField areaCode;
    private javax.swing.JButton cancelSupplier;
    private javax.swing.JCheckBox checkBoxAguac;
    private javax.swing.JCheckBox checkBoxFresa;
    private javax.swing.JCheckBox checkBoxLimon;
    private javax.swing.JCheckBox checkBoxMan;
    private javax.swing.JCheckBox checkBoxMango;
    private javax.swing.JCheckBox checkBoxManzana;
    private javax.swing.JCheckBox checkBoxMelon;
    private javax.swing.JCheckBox checkBoxNaranja;
    private javax.swing.JCheckBox checkBoxPina;
    private javax.swing.JCheckBox checkBoxSandia;
    private javax.swing.JCheckBox checkBoxToronja;
    private javax.swing.JCheckBox checkBoxUva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField latitud;
    private javax.swing.JTextField longitud;
    private javax.swing.JTextField otherCert;
    private javax.swing.JTextField otherFruit;
    private javax.swing.JTextField supplierLName;
    private javax.swing.JTextField supplierName;
    private javax.swing.JTextField supplierPhone;
    // End of variables declaration//GEN-END:variables
}
