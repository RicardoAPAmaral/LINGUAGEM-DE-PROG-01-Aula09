package aplicacao;

import entidades.*;

public class App {
    public static void main(String[] args) {
        // Instanciando um quadrado

        Quadrado q = new Quadrado(Cores.ROXO,12.5,12.5);
        System.out.println("A cor do quadrado é:"+q.getCor());
        System.out.println("A area do quadrado é:"+q.calcularArea());


        Forma f = new Quadrado(Cores.VERMELHO,5,5);
        System.out.println("A cor do quadrado é:"+f.getCor());
        System.out.println("A area do quadrado é:"+f.calcularArea());

        Forma f2=new Circulo(Cores.AZUL,10);
        System.out.println("A area do circulo  é:"+f2.calcularArea());

        Forma f3=new Triangulo(Cores.PRETO,5,6,9);
        System.out.println("A area do triângulo  é:"+f3.calcularArea());

    }
}
