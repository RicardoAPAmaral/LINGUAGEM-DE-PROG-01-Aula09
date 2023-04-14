package entidades;

public class Circulo extends Forma{


    //Atrbuto
   private double raio;

   //Método Construtor

    public Circulo(Cores cor, double raio) {
        super(cor);
        this.raio = raio;
    }
    //Método get

    public double getRaio() {
        return raio;
    }
    //Método Set
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }
}
