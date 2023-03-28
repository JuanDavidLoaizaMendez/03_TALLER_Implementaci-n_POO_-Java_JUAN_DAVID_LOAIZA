package Interface;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {

    //Atributos  
    private int moneda;
    private String jugador;
    private int eleccion;

    //Objeto Para Capturar Los Datos
    Scanner captura=new Scanner(System.in);

    //Solicitar Los Datos
    public void iniciar() {

        System.out.println("Digite el nombre del jugador");
        jugador=captura.next();
        
    }

  
    public void jugar() {

        System.out.println(jugador+" realice su eleccion \n 1.cara \n 2.sello");
        eleccion=captura.nextInt();
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("Ha lanzado la moneda");

        
    
    }

    
    public void fializar() {

        if(moneda==1 && eleccion==1){
            System.out.println("Cayo cara, Ganaste "+jugador);
            
        }else if(moneda==2 && eleccion==2){
            System.out.println("Cayo cara, Ganaste "+jugador);

        } else if(moneda==1 && eleccion==2){
            System.out.println("Cayo cara, Perdiste "+jugador);

        }else if(moneda==2 && eleccion==1){
            System.out.println("Cayo sello, Perdiste "+jugador);

        }
       
    }
    
}
