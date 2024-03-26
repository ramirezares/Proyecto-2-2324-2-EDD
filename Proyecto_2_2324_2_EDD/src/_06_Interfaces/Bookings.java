package _06_Interfaces;

import _02_EDD.NodeBST;
import _03_Classes.ClientStatus;
import _05_Validations.Validations;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Daniela Zambrano
 */
public class Bookings extends javax.swing.JFrame {

    ImageIcon logoCompanyPic = new ImageIcon("Untitled-3.png");
    ImageIcon fondoPic = new ImageIcon("mount-fuji-1346096_1280.jpg");
    String MainID = "";

    /**
     * Creates new form Bookings
     */

    public Bookings() {
        initComponents();
        this.setLocationRelativeTo(null);
        logo.setIcon(logoCompanyPic);
        logo.setText("");
        imagenFondo1.setIcon(fondoPic);
        imagenFondo1.setText("");
        checkInPanel.setVisible(false);
        text.setVisible(false);
        textTitle.setVisible(false);
        textScroll.setVisible(false);
        checkInButtom.setVisible(false);

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
        textScroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        checkInPanel = new javax.swing.JPanel();
        chosenRoom = new javax.swing.JLabel();
        chosenName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        backButtom = new javax.swing.JButton();
        checkInButtom = new javax.swing.JButton();
        searchButtom = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IDClient = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        imagenFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 650));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
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

        text.setEditable(false);
        text.setBackground(new java.awt.Color(102, 155, 188));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(0, 0, 0));
        text.setRows(5);
        text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text.setMargin(new java.awt.Insets(6, 6, 6, 6));
        textScroll.setViewportView(text);

        jPanel1.add(textScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 440, 300));

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 48, 73));
        jLabel2.setText("Gestión de Reservaciones");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 750, 70));

        checkInPanel.setBackground(new java.awt.Color(0, 32, 54));
        checkInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chosenRoom.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        chosenRoom.setForeground(new java.awt.Color(253, 240, 213));
        chosenRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chosenRoom.setText("123");
        checkInPanel.add(chosenRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 50));

        chosenName.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        chosenName.setForeground(new java.awt.Color(253, 240, 213));
        chosenName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chosenName.setText("nombre del huesped");
        checkInPanel.add(chosenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 30));

        jLabel8.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(253, 240, 213));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Habitación asignada a");
        checkInPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 30));

        jPanel1.add(checkInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 340, 230));

        textTitle.setFont(new java.awt.Font("Perpetua", 1, 28)); // NOI18N
        textTitle.setForeground(new java.awt.Color(0, 32, 54));
        textTitle.setText("Reservación  Encontrada");
        jPanel1.add(textTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 30));

        jPanel3.setBackground(new java.awt.Color(0, 32, 54));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButtom.setBackground(new java.awt.Color(120, 0, 0));
        backButtom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        backButtom.setForeground(new java.awt.Color(253, 240, 213));
        backButtom.setText("Atrás");
        backButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtomActionPerformed(evt);
            }
        });
        jPanel3.add(backButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 90, 40));

        checkInButtom.setBackground(new java.awt.Color(102, 155, 188));
        checkInButtom.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        checkInButtom.setForeground(new java.awt.Color(0, 32, 54));
        checkInButtom.setText("Check-In");
        checkInButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtomActionPerformed(evt);
            }
        });
        jPanel3.add(checkInButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 130, 40));

        searchButtom.setBackground(new java.awt.Color(102, 155, 188));
        searchButtom.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        searchButtom.setForeground(new java.awt.Color(0, 32, 54));
        searchButtom.setText("Buscar");
        searchButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtomActionPerformed(evt);
            }
        });
        jPanel3.add(searchButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 130, 40));

        jLabel4.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 240, 213));
        jLabel4.setText("Inserte el ID del cliente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 30));

        IDClient.setBackground(new java.awt.Color(253, 240, 213));
        IDClient.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        IDClient.setForeground(new java.awt.Color(0, 32, 54));
        IDClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDClientActionPerformed(evt);
            }
        });
        jPanel3.add(IDClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 280, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1070, 120));

        jPanel9.setBackground(new java.awt.Color(120, 0, 0));
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1050, -1));

        imagenFondo1.setBackground(new java.awt.Color(102, 155, 188));
        imagenFondo1.setFont(new java.awt.Font("Rage Italic", 0, 24)); // NOI18N
        imagenFondo1.setText("jLabel2");
        jPanel1.add(imagenFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1130, 650));

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

    private void IDClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDClientActionPerformed

    private void backButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtomActionPerformed
        Home Inicio = new Home();
        Inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtomActionPerformed

    private void checkInButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtomActionPerformed
        System.out.println(MainID);
        
        if ("".equals(MainID)) {
            JOptionPane.showMessageDialog(null, "No hay ninguna reserva seleccionada,\nInserte el ID del cliente para encontrar realizar el Check-In. ", "Error!", WARNING_MESSAGE);
            checkInButtom.setVisible(false);
            
            
        } else {
            
            ClientStatus auxClient=Home.Miyako.checkInWithIDBooking(MainID);
            checkInButtom.setVisible(false);
            chosenRoom.setText(auxClient.getRoomNumber());
            chosenName.setText(auxClient.getName()+""+auxClient.getLastName());
            checkInPanel.setVisible(true);
            IDClient.setText("");
            textScroll.setVisible(false);
            text.setVisible(false);
            textTitle.setVisible(false);
            
        }

    }//GEN-LAST:event_checkInButtomActionPerformed

    private void searchButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtomActionPerformed
        checkInPanel.setVisible(false);
        String IDString = IDClient.getText();
        NodeBST existID = null;
        Validations val = new Validations();
        boolean check;
        
        if (val.isID(IDString)) {
            int ID = Integer.parseInt(IDString);
            try {
                existID = Home.Miyako.Bookings.SearchNodeInBST(Home.Miyako.Bookings.getRoot(), ID);
                
            } catch (Exception ex) {
                Logger.getLogger(Bookings.class.getName()).log(Level.SEVERE, null, ex);
                IDClient.setText("");
            }
            check = true;
        } else {
            check = false;
            checkInPanel.setVisible(false);
            text.setVisible(false);
            textTitle.setVisible(false);
            textScroll.setVisible(false);
            checkInButtom.setVisible(false);
        }

        if (existID != null) {
            textScroll.setVisible(true);
            text.setVisible(true);
            textTitle.setVisible(true);
            text.setText(Home.Miyako.visualizeBooking(IDString));
            checkInButtom.setVisible(true);
            MainID=IDString;
            System.out.println("messi");
        } else if (check) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna reserva con ese ID.\nInténtelo nuevamente. ", "Información", INFORMATION_MESSAGE);
            checkInPanel.setVisible(false);
            text.setVisible(false);
            textTitle.setVisible(false);
            textScroll.setVisible(false);
            checkInButtom.setVisible(false);
            System.out.println("messi2");
        }
    }//GEN-LAST:event_searchButtomActionPerformed

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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Bookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDClient;
    private javax.swing.JButton backButtom;
    private javax.swing.JButton checkInButtom;
    private javax.swing.JPanel checkInPanel;
    private javax.swing.JLabel chosenName;
    private javax.swing.JLabel chosenRoom;
    private javax.swing.JLabel imagenFondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logo;
    private javax.swing.JButton searchButtom;
    private javax.swing.JTextArea text;
    private javax.swing.JScrollPane textScroll;
    private javax.swing.JLabel textTitle;
    // End of variables declaration//GEN-END:variables
}
