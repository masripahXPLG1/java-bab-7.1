/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7.java;
import javax.swing.JOptionPane;


/**
 *
 * @author PC 12 - LAB R1
 */
public class bab72 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String[] nama = new String[3];
        nama[0] = JOptionPane.showInputDialog("Nama index ke-0");
        nama[1] = JOptionPane.showInputDialog("Nama index ke-1");
        nama[2] = JOptionPane.showInputDialog("Nama index ke-2");

        JOptionPane.showMessageDialog(null,
            nama[0] + ", " + nama[1] + ", " + nama[2]);
    }
}
    
