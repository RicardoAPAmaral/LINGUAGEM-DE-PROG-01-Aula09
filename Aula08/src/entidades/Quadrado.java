package entidades;

public final class Quadrado extends Forma{
    //Atributos do quadrado

    private double altura, largura;

    public Quadrado(Cores cor,double altura,double largura) {
        super(cor);
        this.altura=altura;
        this.largura=largura;
    }

    // Método calcular area

    @Override
    public double calcularArea(){
        return this.altura*this.largura;
    }
}
