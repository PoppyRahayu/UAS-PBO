/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts.poppy.rahayu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author LENOVO THINKPAD X260
 */
public class TableMahasiswa extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    /**
     * Creates new form TableMahasiswa
     */
    public TableMahasiswa() {
        initComponents();
        setTitle("TABLE DATA MAHASISWA");
        koneksi();
        tabel();
        popi_table.setAutoCreateRowSorter(true);
    }
    
        
    
        private void koneksi(){
            try{
                Class.forName("com.mysql.cj.jbdc.Driver");
                
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasikelas","root","'");
        stat=con.createStatement();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);}
        }
        
        private void tabel(){
            DefaultTableModel t=new DefaultTableModel();
            t.addColumn("Nim");
            t.addColumn("Nama");
            t.addColumn("Jenis Kelamin");
            t.addColumn("No HP");
            t.addColumn("Alamat");
            popi_table.setModel(t);try{res=stat.executeQuery("select * from mahasiswa");
            while (res.next()) {
    t.addRow(new Object[]{ res.getString("Nim"),
      res.getString("Nama"),
      res.getString("JenisKelamin"),
      res.getString("NoHp"),
      res.getString("Alamat")
        });
    }
}catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, e);
}    
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
        popi_mahasiswa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        popi_table = new javax.swing.JTable();
        popi_uangkas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        popi_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        popi_mahasiswa.setText("PILIH MAHASISWA");
        popi_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popi_mahasiswaActionPerformed(evt);
            }
        });

        popi_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(popi_table);

        popi_uangkas.setText("PILIH UANGKAS");
        popi_uangkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popi_uangkasActionPerformed(evt);
            }
        });

        jLabel1.setText("TABLE MAHASISWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(popi_mahasiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(popi_uangkas)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popi_mahasiswa)
                    .addComponent(popi_uangkas))
                .addGap(86, 86, 86))
        );

        popi_back.setText("BACK");
        popi_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popi_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popi_back)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(popi_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Mahasiswa data = new Mahasiswa();
    private void popi_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popi_mahasiswaActionPerformed
        // TODO add your handling code here:
       int index = popi_table.getSelectedRow();
       
       TableModel model=popi_table.getModel();
       
       String nim=model.getValueAt(index, 0).toString();
       String nama=model.getValueAt(index, 1).toString();
       String jk=model.getValueAt(index, 2).toString();
       String nohp=model.getValueAt(index, 3).toString();
       String alamat=model.getValueAt(index, 4).toString();
       
       data.setVisible(true);
       data.pack();
       data.setLocationRelativeTo(null);
       data.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       data.popi_nim.setText(nim);
       data.popi_nama.setText(nama);
       data.popi_jk.setSelectedItem(jk);
       data.popi_nohp.setText(nohp);
       data.popi_alamat.setText(alamat);
       dispose();
    }//GEN-LAST:event_popi_mahasiswaActionPerformed

    private void popi_uangkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popi_uangkasActionPerformed
        // TODO add your handling code here:
        int index = popi_table.getSelectedRow();

        TableModel model=popi_table.getModel();
        
        
        String nama=model.getValueAt(index, 1).toString();
        
        TableMahasiswa mahasiswa = new TableMahasiswa(); 
// Assuming MahasiswaFrame is the name of the frame to be displayed
        mahasiswa.setVisible(true);
        mahasiswa.pack();
        mahasiswa.setLocationRelativeTo(null);
        mahasiswa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        mahasiswa.popi_mahasiswa.setText(nama);
        dispose();   
    }//GEN-LAST:event_popi_uangkasActionPerformed

    private void popi_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popi_backActionPerformed
        // TODO add your handling code here:
        new Mahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_popi_backActionPerformed

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
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton popi_back;
    private javax.swing.JButton popi_mahasiswa;
    public javax.swing.JTable popi_table;
    private javax.swing.JButton popi_uangkas;
    // End of variables declaration//GEN-END:variables
}
