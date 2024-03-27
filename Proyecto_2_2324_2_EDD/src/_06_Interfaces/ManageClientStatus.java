package _06_Interfaces;

import _03_Classes.ClientStatus;
import _04_Functions.Helper;
import _05_Validations.Validations;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Daniela Zambrano
 */
public class ManageClientStatus extends javax.swing.JFrame {

    ImageIcon logoCompanyPic = new ImageIcon("Untitled-3.png");
    ImageIcon fondoPic = new ImageIcon("mount-fuji-1346096_1280.jpg");
    ClientStatus MainClient;

    /**
     * Creates new form Check_in
     */
    public ManageClientStatus() {
        initComponents();
        this.setLocationRelativeTo(null);
        logo.setIcon(logoCompanyPic);
        logo.setText("");
        imagenFondo.setIcon(fondoPic);
        imagenFondo.setText("");
        checkOutPanel.setVisible(false);
        textTitle.setVisible(false);
        text.setVisible(false);
        textScroll.setVisible(false);
        checkOutButtom.setVisible(false);
        searchButtom.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        surnameClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameClient = new javax.swing.JTextField();
        checkOutPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        finalCheckOutButtom = new javax.swing.JButton();
        IDClient = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textScroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        backButtom = new javax.swing.JButton();
        checkOutButtom = new javax.swing.JButton();
        searchButtom = new javax.swing.JButton();
        textTitle = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 650));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(253, 240, 213));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 48, 73));
        jLabel1.setText("MIYAKO HOTELS & RESORTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 140, 30));

        logo.setText("jLabel2");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 130, 120));

        surnameClient.setBackground(new java.awt.Color(253, 240, 213));
        surnameClient.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        surnameClient.setForeground(new java.awt.Color(0, 32, 54));
        surnameClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameClientActionPerformed(evt);
            }
        });
        jPanel1.add(surnameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 270, 40));

        jLabel3.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 240, 213));
        jLabel3.setText("Inserte el nombre del cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 280, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 48, 73));
        jLabel2.setText("Gestión de Huéspedes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 750, 70));

        jLabel5.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 240, 213));
        jLabel5.setText("Inserte el apellido del cliente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 280, 30));

        nameClient.setBackground(new java.awt.Color(253, 240, 213));
        nameClient.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        nameClient.setForeground(new java.awt.Color(0, 32, 54));
        nameClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameClientActionPerformed(evt);
            }
        });
        jPanel1.add(nameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 280, 40));

        checkOutPanel.setBackground(new java.awt.Color(253, 240, 213));

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 48, 73));
        jLabel8.setText("Confirmacion de Datos para el Check-Out");

        finalCheckOutButtom.setBackground(new java.awt.Color(120, 0, 0));
        finalCheckOutButtom.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        finalCheckOutButtom.setForeground(new java.awt.Color(253, 240, 213));
        finalCheckOutButtom.setText("Confirmar Check-Out");
        finalCheckOutButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalCheckOutButtomActionPerformed(evt);
            }
        });

        IDClient.setBackground(new java.awt.Color(102, 155, 188));
        IDClient.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        IDClient.setForeground(new java.awt.Color(0, 48, 73));
        IDClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDClientActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Perpetua", 3, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 48, 73));
        jLabel9.setText("Inserte ID del cliente");

        javax.swing.GroupLayout checkOutPanelLayout = new javax.swing.GroupLayout(checkOutPanel);
        checkOutPanel.setLayout(checkOutPanelLayout);
        checkOutPanelLayout.setHorizontalGroup(
            checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkOutPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalCheckOutButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDClient, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
        );
        checkOutPanelLayout.setVerticalGroup(
            checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalCheckOutButtom)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(checkOutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 500, 220));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(102, 155, 188));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Franklin Gothic Book", 0, 20)); // NOI18N
        text.setForeground(new java.awt.Color(0, 0, 0));
        text.setRows(5);
        text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text.setMargin(new java.awt.Insets(8, 8, 6, 6));
        textScroll.setViewportView(text);

        jPanel1.add(textScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 440, 300));

        jPanel3.setBackground(new java.awt.Color(0, 32, 54));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(120, 0, 0));
        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        backButtom.setBackground(new java.awt.Color(120, 0, 0));
        backButtom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        backButtom.setForeground(new java.awt.Color(253, 240, 213));
        backButtom.setText("Atrás");
        backButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtomActionPerformed(evt);
            }
        });
        jPanel3.add(backButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 90, 40));

        checkOutButtom.setBackground(new java.awt.Color(0, 32, 54));
        checkOutButtom.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        checkOutButtom.setForeground(new java.awt.Color(253, 240, 213));
        checkOutButtom.setText("Check-Out");
        checkOutButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtomActionPerformed(evt);
            }
        });
        jPanel3.add(checkOutButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 130, 40));

        searchButtom.setBackground(new java.awt.Color(0, 32, 54));
        searchButtom.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        searchButtom.setForeground(new java.awt.Color(253, 240, 213));
        searchButtom.setText("Buscar");
        searchButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtomActionPerformed(evt);
            }
        });
        jPanel3.add(searchButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1070, 120));

        textTitle.setFont(new java.awt.Font("Perpetua", 1, 32)); // NOI18N
        textTitle.setForeground(new java.awt.Color(0, 32, 54));
        textTitle.setText("Huésped  Encontrado");
        jPanel1.add(textTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 30));

        imagenFondo.setBackground(new java.awt.Color(102, 155, 188));
        imagenFondo.setFont(new java.awt.Font("Rage Italic", 0, 24)); // NOI18N
        imagenFondo.setText("jLabel2");
        jPanel1.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1130, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void surnameClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameClientActionPerformed

    private void nameClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameClientActionPerformed

    private void checkOutButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtomActionPerformed
        if (MainClient == null) {
            JOptionPane.showMessageDialog(null, "No hay ningún huesped seleccionado para realizar el check-out,\n por favor inserte el nombre y el apellido para encontrar un huesped. ", "Error!", WARNING_MESSAGE);
            checkOutButtom.setVisible(false);
        } else {
            checkOutPanel.setVisible(true);
            searchButtom.setVisible(false);
        }


    }//GEN-LAST:event_checkOutButtomActionPerformed

    private void backButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtomActionPerformed
        Home Inicio = new Home();
        Inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtomActionPerformed

    private void searchButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtomActionPerformed
        String name = nameClient.getText();
        String surname = surnameClient.getText();
        String keyName = "";
        ClientStatus auxClient = null;
        Validations val = new Validations();
        Helper help = new Helper();
        boolean check;
        if ((val.isName2(name)) && (val.isName2(surname))) {
            name = help.toLowerCaseString(name);
            surname = help.toLowerCaseString(surname);
            keyName = help.NameSurname(name, surname);
            auxClient = Home.Miyako.StatusList.search(keyName);
            check = true;
        } else {
            check = false;
            checkOutPanel.setVisible(false);
            textTitle.setVisible(false);
            text.setVisible(false);
            textScroll.setVisible(false);
            checkOutButtom.setVisible(false);
        }

        if (auxClient != null) {
            textScroll.setVisible(true);
            text.setVisible(true);
            textTitle.setVisible(true);
            text.setText(Home.Miyako.visualizeGuest(keyName));
            checkOutButtom.setVisible(true);
            this.MainClient = auxClient;
        } else if (check && (val.isName(name)) && (val.isName(surname))) {
            checkOutPanel.setVisible(false);
            textTitle.setVisible(false);
            text.setVisible(false);
            textScroll.setVisible(false);
            checkOutButtom.setVisible(false);
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún huesped con ese nombre.\n Por favor intente nuevamente. ", "Información", INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_searchButtomActionPerformed

    private void IDClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDClientActionPerformed

    private void finalCheckOutButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalCheckOutButtomActionPerformed
        String ID = IDClient.getText();
        Validations val = new Validations();
        boolean ready;
        ready = (val.isID(ID));

        if (ready) {
            Home.Miyako.checkOut(MainClient.getFullName(), ID);
            checkOutPanel.setVisible(false);
            text.setVisible(false);
            textTitle.setVisible(false);
            textScroll.setVisible(false);
            this.MainClient = null;
            checkOutButtom.setVisible(false);
            nameClient.setText("");
            surnameClient.setText("");
            JOptionPane.showMessageDialog(null, "Se ha realizdo correctamente el check-out.\nPuede visualizar la información nuevamente en el partado de historial de cada habitación.", "Operación Exitosa!", INFORMATION_MESSAGE);
            searchButtom.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Es necesario colocar todos los datos del huesped de manera correcta para realizar el Check-Out exitosamente.\n Por favor intente nuevamente. ", "Error!", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_finalCheckOutButtomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageClientStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClientStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClientStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClientStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClientStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDClient;
    private javax.swing.JButton backButtom;
    private javax.swing.JButton checkOutButtom;
    private javax.swing.JPanel checkOutPanel;
    private javax.swing.JButton finalCheckOutButtom;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nameClient;
    private javax.swing.JButton searchButtom;
    private javax.swing.JTextField surnameClient;
    private javax.swing.JTextArea text;
    private javax.swing.JScrollPane textScroll;
    private javax.swing.JLabel textTitle;
    // End of variables declaration//GEN-END:variables
}
