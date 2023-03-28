package Interface;

public class Ejecucion {
    public static void main(String[] args) {
            Carisellazo juego1=new Carisellazo();
            juego1.iniciar();
            juego1.jugar();
            juego1.fializar();

            PiedraPapelTijera juego2=new PiedraPapelTijera();
            juego2.iniciar();
            juego2.jugar();
            juego2.fializar();

            
    }
    
}
