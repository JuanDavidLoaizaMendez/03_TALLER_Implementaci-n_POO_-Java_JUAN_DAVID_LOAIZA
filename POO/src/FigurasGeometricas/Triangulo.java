package FigurasGeometricas;

public class Triangulo extends Figura{
      //Crear Atributos

      private float base;
      private float altura;
     
 
      //Metodo Constructor
      public Triangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
       
        
      }
 
       //Metodos Accesores 
        
       public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

      
    
    //Metodo De La SubClase 
 
    public void calcularArea() {
        float area=0;
 
        area=base*altura/2;
 
        System.out.println("La base es: "+base+" y la altura de esta figura es: "+altura+"Su area es: "+area);
     
 }

   
  
 
    
}
