package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
       
   public static void main(String[] args) {
    float lado;
    float base;
    float altura;
    float radio;
    float pi;
    int figura;

    Scanner captura=new Scanner(System.in);

    System.out.println("Elija  un numero correspondiente a la  figura para saber su area correspondiente: ");
    System.out.println("1. Cuadrado     2. Rectangulo    3.Circulo    4.Triangulo\t");

    System.out.println("Digite un numero segun la figura: ");
    figura=captura.nextInt();

    if(figura==1){

        System.out.println("escriba el lado del caudrado ");
        lado=captura.nextFloat();
        Cuadrado C1=new Cuadrado(lado);
        C1.calcularArea();
    }
    else if(figura==2){

        System.out.println("escriba la base del rectangulo ");
        base=captura.nextFloat();
        System.out.println("escriba la altura del rectangulo ");
        altura=captura.nextFloat();
        Rectangulo R1=new Rectangulo(base,altura);
        R1.calcularArea();
    }
    else if(figura==3){

        System.out.println("escriba el radio del circulo ");
        radio=captura.nextFloat();
        System.out.println("escriba pi ");
        pi=captura.nextFloat();
        Circulo CI1=new Circulo(radio, pi);
        CI1.calcularArea();
    }
    else if(figura==4){

        System.out.println("escriba la base del triangulo");
        base=captura.nextFloat();
        System.out.println("escriba la altura del triangulo");
        altura=captura.nextFloat();
        Triangulo T1=new Triangulo(base, altura);
        T1.calcularArea();
    }

    captura.close();


}

}