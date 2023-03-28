package Interface;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego {
    //Atributos
    private int eleccionAleatoria;
    private String nombreJugador;
    private int eleccionJugador;
    //objeto para caturar los datos
    Scanner captura=new Scanner(System.in);
    //Solicitar datos

    public void iniciar() {
        System.out.println("nombre del jugador");
        nombreJugador=captura.next();
        
    }
    public void jugar() {

        System.out.println(nombreJugador+"por favor elije  \n 1. piedra  \n 2. papel  \n 3. tijera");
        eleccionJugador=captura.nextInt();
        Random aleatorio=new Random();
        eleccionAleatoria=aleatorio.nextInt(3)+1;
        System.out.println(" esperandooo yyy ");
        
    }
        
        
        public void fializar() {
             
                if(eleccionAleatoria==1 && eleccionJugador==1){
                    System.out.println("el oponente saco piedra");
                    System.out.println("Empate");
                }
        
                else if(eleccionAleatoria==1 && eleccionJugador==2){
                    System.out.println("el oponente saco piedra");
                    System.out.println("Ganado"+nombreJugador);
                }
        
                else if(eleccionAleatoria==1 && eleccionJugador==3){
                    System.out.println("el oponente saco piedra");
                    System.out.println("Perdio");
                }
        
                else if(eleccionAleatoria==2 && eleccionJugador==2){
                    System.out.println("el oponente saco papel");
                    System.out.println("Empate");
                }
        
                else if(eleccionAleatoria==2 && eleccionJugador==1){
                    System.out.println("el oponente saco papel");
                    System.out.println("Perdido");
                }
        
                else if(eleccionAleatoria==2 && eleccionJugador==3){
                    System.out.println("el oponente saco papel");
                    System.out.println("Gano"+nombreJugador);
                }
        
                else if(eleccionAleatoria==3 && eleccionJugador==1){
                    System.out.println("el oponente saco tijera");
                    System.out.println("Gano"+nombreJugador);
                }
        
                else if(eleccionAleatoria==3 && eleccionJugador==2){
                    System.out.println("el oponente saco tijera");
                    System.out.println("Perdio");
                }
        
                else if(eleccionAleatoria==3 && eleccionJugador==3){
                    System.out.println("el oponente  saco tijera");
                    System.out.println("Empato");
                }
                
                
               
            }
          
        }
    

    

   
   

    

