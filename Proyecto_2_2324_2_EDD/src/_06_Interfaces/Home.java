
package _06_Interfaces;

import _03_Classes.SystemHotel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Zambrano
 */
public class Home extends javax.swing.JFrame {
    public static SystemHotel Miyako= new SystemHotel();
    ImageIcon logoCompanyPic = new ImageIcon("Untitled-3.png");
    ImageIcon fondoPic = new ImageIcon("caption.jpg");
    ImageIcon peoplePic = new ImageIcon("people2.png");
    ImageIcon bookPic = new ImageIcon("booking2.png");
    ImageIcon recordPic = new ImageIcon("folder2.png");
    
    /**
     * Creates new form Welcome
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        logo.setIcon(logoCompanyPic);
        logo.setText("");
        imagenFondo.setIcon(fondoPic);
        imagenFondo.setText("");
        
        peopleLabel.setIcon(peoplePic);
        peopleLabel.setText("");
        bookLabel.setIcon(bookPic);
        bookLabel.setText("");
        recordLabel.setIcon(recordPic);
        recordLabel.setText("");
    }
    public Home(SystemHotel miyako) {
        Home.Miyako=miyako;
        initComponents();
        this.setLocationRelativeTo(null);
        logo.setIcon(logoCompanyPic);
        logo.setText("");
        imagenFondo.setIcon(fondoPic);
        imagenFondo.setText("");
        
        peopleLabel.setIcon(peoplePic);
        peopleLabel.setText("");
        bookLabel.setIcon(bookPic);
        bookLabel.setText("");
        recordLabel.setIcon(recordPic);
        recordLabel.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        helpButtom = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        guestButtom = new javax.swing.JButton();
        bookingButtom = new javax.swing.JButton();
        recordButtom = new javax.swing.JButton();
        peopleLabel = new javax.swing.JLabel();
        bookLabel = new javax.swing.JLabel();
        recordLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 240, 213));
        jPanel1.setForeground(new java.awt.Color(253, 240, 213));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rage Italic", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 18, 31));
        jLabel2.setText("An Unique Experience");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 48, 73));
        jLabel1.setText("MIYAKO HOTELS & RESORTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 560, 70));

        logo.setText("jLabel2");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 130, 120));

        helpButtom.setBackground(new java.awt.Color(120, 0, 0));
        helpButtom.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        helpButtom.setForeground(new java.awt.Color(253, 240, 213));
        helpButtom.setText("Ayuda");
        helpButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtomActionPerformed(evt);
            }
        });
        jPanel1.add(helpButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 80, 30));

        jPanel7.setBackground(new java.awt.Color(0, 48, 73));
        jPanel7.setForeground(new java.awt.Color(0, 48, 73));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 240, 213));
        jLabel4.setText("Inicio");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 560, 50));

        jPanel8.setBackground(new java.awt.Color(120, 0, 0));
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1050, 10));

        guestButtom.setBackground(new java.awt.Color(0, 32, 54));
        guestButtom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        guestButtom.setForeground(new java.awt.Color(253, 240, 213));
        guestButtom.setText("Gestión de Huespedes");
        guestButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestButtomActionPerformed(evt);
            }
        });
        jPanel7.add(guestButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, 40));

        bookingButtom.setBackground(new java.awt.Color(0, 32, 54));
        bookingButtom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        bookingButtom.setForeground(new java.awt.Color(253, 240, 213));
        bookingButtom.setText("Gestión de Reservas");
        bookingButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingButtomActionPerformed(evt);
            }
        });
        jPanel7.add(bookingButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 220, 40));

        recordButtom.setBackground(new java.awt.Color(0, 32, 54));
        recordButtom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        recordButtom.setForeground(new java.awt.Color(253, 240, 213));
        recordButtom.setText("Historial Habitación");
        recordButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtomActionPerformed(evt);
            }
        });
        jPanel7.add(recordButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 220, 40));

        peopleLabel.setText("jLabel3");
        jPanel7.add(peopleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 60));

        bookLabel.setText("jLabel3");
        jPanel7.add(bookLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 60, 60));

        recordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordLabel.setText("jLabel3");
        jPanel7.add(recordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 60, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1050, 160));

        jPanel9.setBackground(new java.awt.Color(120, 0, 0));
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1050, 10));

        imagenFondo.setFont(new java.awt.Font("Rage Italic", 0, 24)); // NOI18N
        imagenFondo.setText("jLabel2");
        jPanel1.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtomActionPerformed
        if((Home.Miyako.getRooms()!=null)&&(Home.Miyako.getStatusList()!=null)&&(Home.Miyako.getBookings()!=null)){
        Help AyudaPag = new Help(Home.Miyako);
        this.setVisible(false);
        AyudaPag.setVisible(true);}
        else{
        JOptionPane.showMessageDialog(null, "Al parecer no se cargaron correctamente los datos del sistema.\nCierre el programa e inténtelo nuevamente.", "Error!", 1);
        }
    }//GEN-LAST:event_helpButtomActionPerformed

    private void recordButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtomActionPerformed
        if((Home.Miyako.getRooms()!=null)&&(Home.Miyako.getStatusList()!=null)&&(Home.Miyako.getBookings()!=null)){
            RoomRecord historial = new RoomRecord(Home.Miyako);
            historial.setVisible(true);
            this.setVisible(false);}
        else{
        JOptionPane.showMessageDialog(null, "Al parecer no se cargaron correctamente los datos del sistema.\nCierre el programa e inténtelo nuevamente.", "Error!", 1);
        }
    }//GEN-LAST:event_recordButtomActionPerformed

    private void guestButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestButtomActionPerformed
        if((Home.Miyako.getRooms()!=null)&&(Home.Miyako.getStatusList()!=null)&&(Home.Miyako.getBookings()!=null)){
        ManageClientStatus huespedes = new ManageClientStatus(Home.Miyako);
        huespedes.setVisible(true);
        this.setVisible(false);}
        else{
        JOptionPane.showMessageDialog(null, "Al parecer no se cargaron correctamente los datos del sistema.\nCierre el programa e inténtelo nuevamente.", "Error!", 1);
        }
    }//GEN-LAST:event_guestButtomActionPerformed

    private void bookingButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingButtomActionPerformed
        if((Home.Miyako.getRooms()!=null)&&(Home.Miyako.getStatusList()!=null)&&(Home.Miyako.getBookings()!=null)){
        Bookings reservas = new Bookings(Home.Miyako);
        reservas.setVisible(true);
        this.setVisible(false);}
        else{
        JOptionPane.showMessageDialog(null, "Al parecer no se cargaron correctamente los datos del sistema.\nCierre el programa e inténtelo nuevamente.", "Error!", 1);
        }
    }//GEN-LAST:event_bookingButtomActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookLabel;
    private javax.swing.JButton bookingButtom;
    private javax.swing.JButton guestButtom;
    private javax.swing.JButton helpButtom;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel peopleLabel;
    private javax.swing.JButton recordButtom;
    private javax.swing.JLabel recordLabel;
    // End of variables declaration//GEN-END:variables
}
