package Salud;

import java.util.Scanner;

public class Persona {
    //Atributos

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private int pesoActual;

    //Metodo Get Genera Un Valor De Retorno Del Mismo Tipo

    //Metodo Set No Retorna Valores Y Requiere Como Parametro El Valor Del Atributo  
    
    



    //Metodos
      
    //Metodo Constructor Vacio

   /*  public void Persona(){

    } */
    
    public Persona(String tipoDoc, int documento, String nombre, String apellido){
         this.tipoDoc=tipoDoc;
         this.documento=documento;
         this.nombre=nombre;
         this.apellido=apellido;
        
         
    }
    
     public Persona() {
    }

    //Metodos Accesores getters y setters
    public String getTipoDoc() {
        return tipoDoc;
    }


    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    public int getDocumento() {
        return documento;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //Metodos De La Clase
    public void pedirDatos(){
        Scanner captura=new Scanner(System.in);

        System.out.println("por favor digite su tipo de documento ya sea CC o TI "); 
        tipoDoc=captura.next();

        System.out.println("por favor digite su numero de documento "); 
        documento=captura.nextInt();

        System.out.println("por favor digite su nombre "); 
        nombre=captura.next();

        System.out.println("por favor digite su apellido "); 
        apellido=captura.next();

        System.out.println("por favor digite su peso "); 
        peso=captura.nextDouble();

        System.out.println("por favor digite su estatura "); 
        estatura=captura.nextDouble();

        System.out.println("por favor digite su edad "); 
        edad=captura.nextInt();

        System.out.println("por favor digite su sexo ya sea M o F"); 
        sexo=captura.next();
    }
    public void mostrarPersona(){

            System.out.println("su tipo de documento es: "+tipoDoc);

            System.out.println("su documento es: "+documento);

            System.out.println("su nombre es: "+nombre);

            System.out.println("su apellido es: "+apellido);

            System.out.println("su peso es: "+peso+ "Kg");

            System.out.println("su estatura es: "+estatura+ "M");

            System.out.println("su edad es: "+edad);

            System.out.println("su sexo es: "+sexo);
    }
    public void calcularImc(){
        pesoActual= (int) (peso/(estatura*estatura));

        if (pesoActual<20) {
            System.out.println(" El peso esta por debajo de lo ideal ");
            
        } else if(pesoActual<=25) {
            System.out.println(" El peso es ideal ");
            
        }else if(pesoActual>25){
            System.out.println(" Tiene sobrepeso ");

        }
    }
    public double calcularIMC1 (double peso, double estatura){
       double pesoActual1= peso/(estatura*estatura);

        if (pesoActual1<20) {
            System.out.println(" PESOBAJO ");
            
        } else if(pesoActual1<=25) {
            System.out.println(" PESOIDEAL ");
            
        }else if(pesoActual1>25){
            System.out.println(" SOBREPESO ");

        }
        return pesoActual1;
    }
    public void mayorEdad(){

        if(edad>17){
            System.out.println(" Es mayor de edad ");
    
        }else{
            System.out.println("Es menor de edad");
     
        }


    }  
    
}
