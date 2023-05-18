package modelo;

public class Figura {
        protected double base;
        protected double altura;
        protected double radio;
        protected double area;
        protected double perimetro;




        public Figura(double base, double altura) {
                this.base = base;
                this.altura = altura;
                this.area = 0; 
                this.perimetro = 0;
        }

        public Figura(double radio) {
                this.radio = radio;
                this.area = 0;
                this.perimetro = 0;
        }

        // este metodo es para calcular el area y el perimetro del circulo
        public String mostrarResultado() {
                return "el area es del circulo " + this.area + " y el perimetro es del circulo " + this.perimetro;
        }

        
        // este metodo es para calcular el area y el perimetro del rectangulo
        public String mostrarResultadoRectangulo() {
                return "el area es del rectangulo " + this.area + " y el perimetro es del rectangulo " + this.perimetro;
        


        }
}
