package ejecutable;

import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        // este metodo es para ingresar datos por teclado
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del circulo: "));
        // este metodo es para ingrear datos por teclado pero ahora del area y perimetro de un rectangulo
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base : "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
        

        // este metodo es para mostrar datos por pantalla
        Circulo miCirculo = new Circulo(radio);  
        miCirculo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null, miCirculo.mostrarResultado());

        // este metodo es para mostrar datos por pantalla pero ahora del area y perimetro de un rectangulo
        Circulo miRectangulo = new Circulo(base, altura);
        miRectangulo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null, miRectangulo.mostrarResultadoRectangulo());


        System.exit(0);


    }
}
