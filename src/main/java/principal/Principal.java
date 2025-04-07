/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args) {
        // Declara e instancia o objeto
        Triangulo trii = new Triangulo();

        // Entrada
        trii.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo")));
        trii.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo")));

        // Saída
        JOptionPane.showMessageDialog(null, "A área do triângulo é " + trii.getArea());
    }
}