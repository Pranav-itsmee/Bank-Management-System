/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/
package hsbbank;
/**
*
* @author Admin
*/
public class mainmenu extends javax.swing.JFrame {
/**
* Creates new form mainmenu
*/
public mainmenu() {
initComponents();
}
/**
16
* This method is called from within the constructor to initialize the form. * WARNING: Do NOT modify this code. The content of this method is always * regenerated by the Form Editor.
*/
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code"> private void initComponents() {
jMenuBar2 = new javax.swing.JMenuBar(); jMenu8 = new javax.swing.JMenu(); jMenu9 = new javax.swing.JMenu();
jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem(); jDesktopPane1 = new javax.swing.JDesktopPane(); jMenuBar1 = new javax.swing.JMenuBar(); jMenu1 = new javax.swing.JMenu(); jMenuItem1 = new javax.swing.JMenuItem(); jMenuItem8 = new javax.swing.JMenuItem(); jMenu2 = new javax.swing.JMenu(); jMenuItem3 = new javax.swing.JMenuItem(); jMenuItem2 = new javax.swing.JMenuItem();
jMenu8.setText("File"); jMenuBar2.add(jMenu8);
jMenu9.setText("Edit"); jMenuBar2.add(jMenu9); jCheckBoxMenuItem1.setSelected(true);
jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
17
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
jDesktopPane1.setPreferredSize(new java.awt.Dimension(350, 200));
javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1); jDesktopPane1.setLayout(jDesktopPane1Layout); jDesktopPane1Layout.setHorizontalGroup(
jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGap(0, 465, Short.MAX_VALUE)
);
jDesktopPane1Layout.setVerticalGroup(
jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGap(0, 290, Short.MAX_VALUE)
);
jMenu1.setText("File");
jMenuItem1.setText("Customer");
jMenuItem1.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { jMenuItem1ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem1);
jMenuItem8.setText("Account");
18
jMenuItem8.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { jMenuItem8ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem8);
jMenuBar1.add(jMenu1);
jMenu2.setText("Transaction");
jMenuItem3.setText("Withdraw");
jMenuItem3.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { jMenuItem3ActionPerformed(evt);
}
});
jMenu2.add(jMenuItem3);
jMenuItem2.setText("Deposit");
jMenuItem2.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { jMenuItem2ActionPerformed(evt);
}
});
jMenu2.add(jMenuItem2);
jMenuBar1.add(jMenu2);
19
setJMenuBar(jMenuBar1);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); getContentPane().setLayout(layout); layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
);
pack();
}// </editor-fold>
private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here: Withdraw wc=new Withdraw(); jDesktopPane1.add(wc); wc.setVisible(true);
}
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) { Customer cus = new Customer(); jDesktopPane1.add(cus); cus.setVisible(true);
// TODO add your handling code here:
}
20
private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
account ac = new account(); jDesktopPane1.add(ac); ac.setVisible(true);
}
private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here: Deposit ac = new Deposit(); jDesktopPane1.add(ac); ac.setVisible(true);
}
/**
* @param args the command line arguments
*/
public static void main(String args[]) {
/* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
*/ try { for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
}
}
} catch (ClassNotFoundException ex) {
21
java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SE VERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SE VERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SE VERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SE VERE, null, ex);
}
//</editor-fold>
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() { public void run() {
new mainmenu().setVisible(true);
}
});
}
// Variables declaration - do not modify
private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1; private javax.swing.JDesktopPane jDesktopPane1; private javax.swing.JMenu jMenu1; private javax.swing.JMenu jMenu2;
22
private javax.swing.JMenu jMenu8; private javax.swing.JMenu jMenu9; private javax.swing.JMenuBar jMenuBar1; private javax.swing.JMenuBar jMenuBar2; private javax.swing.JMenuItem jMenuItem1; private javax.swing.JMenuItem jMenuItem2; private javax.swing.JMenuItem jMenuItem3; private javax.swing.JMenuItem jMenuItem8;
// End of variables declaration
}