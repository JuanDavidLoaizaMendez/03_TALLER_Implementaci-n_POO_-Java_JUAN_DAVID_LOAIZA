package FigurasGeometricas;
//Hereda
public class Cuadrado extends Figura {

    //Crear Atributos

      private float lado;

      //Metodo Constructor
      public Cuadrado(float lado){
        this.lado=lado;
      }
      
    //Metodos Accesores

    public float getLado() {
        return lado;
    }


    public void setLado(float lado) {
        this.lado = lado;
    }

    //Metodo De La SubClase

    public void calcularArea() {
        float area=0;

        area=lado*lado;

        System.out.println("El lado del cuadrado es: "+lado+" y la area de esta figura es: "+area);
        
    }

    
    
    
}
