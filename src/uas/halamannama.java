
package uas;

import javax.swing.JOptionPane;

public class halamannama {
    public static void main(String[] args) {
      String nama = " ";
        nama=JOptionPane.showInputDialog("Silakan masukkan nama anda");
        String psn= "halo " +   nama;
        JOptionPane.showMessageDialog(null,psn);   
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
