package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test 
{
    public static void main(String[] args) 
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("digite el valor de la base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("digite el valor de la altura: "));

        Rectangulo mirRectangulo = new Rectangulo();
        mirRectangulo.calcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog(null, "-- El area del rectangulo es: " + mirRectangulo.mostrarArea() + " -- y su perimetro -- " + mirRectangulo.mostrarPerimetro());

        double radio = Double.parseDouble(JOptionPane.showInputDialog("digite el valor del radio del circulo  : "));

        Circulo miCirculo = new Circulo();
        miCirculo.calcularRadio(radio);
        JOptionPane.showMessageDialog(null, "El area del circulo es; " + miCirculo.mostrarArea() + " el perimetro del circulo es " + miCirculo.mostrarPerimetro());
    }
}