package modelo;

public class Rectangulo extends Figura {

        private double base;
        private double altura;

        public Rectangulo(double base, double altura) { 
                public Rectangulo(double base, double altura) {
                super(base, altura);
                }
        }

        // este metodo es para calcular el area y el perimetro del rectangulo
        public void calcularAreaPerimetro() {
                this.area = base * altura ; 
                this.perimetro = 2 * (base + altura);
        }

}
