package entidades;

public abstract class Forma {

    // Atributo baseado no tipo Enum Cores

    private Cores cor;



    // Método construtor

    public Forma(){

    }

    public Forma(Cores cor) {
        this.cor = cor;
    }


    // Método get

    public Cores getCor() {
        return cor;
    }

    //Método Set

    public void setCor(Cores cor) {
        this.cor = cor;
    }
    //Método calcular area

    public abstract double calcularArea();




}
