package FigurasGeometricas;

public class Circulo extends Figura{
    //Crear Atributos

    private float pi;
    private float radio;
   

    //Metodo Constructor
    public Circulo(float pi,float radio){
      this.pi=pi;
      this.radio=radio;
     
      
    }

     //Metodos Accesores 
      
     public float getPi() {
        return pi;
    }
    
    public void setPi(float pi) {
        this.pi = pi;
    }
    
    public float getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }

    
  
  //Metodo De La SubClase 

  public void calcularArea() {
      float area=0;

      area=pi*(radio*radio);

      System.out.println("pi vale: "+pi+" y el radeo de esta figura es: "+radio+"Su area es: "+area);
   
}




   
   
    
}
