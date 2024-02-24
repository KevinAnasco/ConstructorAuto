package auto;

import auto.Auto.tipoAut;
import auto.Auto.tipoCol;
import auto.Auto.tipoCombu;

public class Main {


    public static void main(String[] args) {

        Auto miAuto = new Auto("Ford",2018,6,4,5,250,tipoCol.naranja,tipoAut.SUV,tipoCombu.gasolina);
        miAuto.imprimir();

        System.out.println("Velocidad Permitida en Carretera 200 KM/H");

        miAuto.setVelocidadActual(180);
        System.out.println("\nVelocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Acelerar(60);
        System.out.println("Acelerando Velocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Acelerar(60);
        System.out.println("Acelerando Velocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Desacelerar(100);
        System.out.println("Desacelerando Velocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Acelerar(70);
        System.out.println("Acelerando Velocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Desacelerar(100);
        System.out.println("Desacelerando Velocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Tiempollegada(400);

        miAuto.frenar();
        System.out.println("Frenando Velocidad Actual = "+miAuto.VelocidadActual);

        miAuto.Desacelerar(20);

        miAuto.Multa();


    }
}
