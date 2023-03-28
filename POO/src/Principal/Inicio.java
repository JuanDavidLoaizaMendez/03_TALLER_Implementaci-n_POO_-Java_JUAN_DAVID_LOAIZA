package Principal;

import java.util.Scanner;

import Salud.Empleado;



public class Inicio {

       //ejecuto los metodos

    public static void main(String[] args) {
     /*    double peso;
        double estatura;
        double IMC;*/

        //Esto es de la subclase
   String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    String cargo;
    int valorHora;
    int horasTrabajadas;
    String departamento;
        
      //Creo el objeto de la clase persona
   /*      Persona persona =new Persona();

       //Invocar Metodos
       persona.pedirDatos();
       persona.mostrarPersona();
       persona.calcularImc();
       persona.mayorEdad();







       //Hasta aqui empieza el segundo
       Scanner captura=new Scanner(System.in);

       System.out.println("por favor ponga su peso");
       peso=captura.nextDouble();
       System.out.println("por favor ponga su estatura");
       estatura=captura.nextDouble();

       IMC=persona.calcularIMC1(peso, estatura);*/

      /*  Persona persona =new Persona(); 

       //Invocar Metodos
       persona.pedirDatos();
       persona.mostrarPersona();
       persona.calcularImc();
       persona.mayorEdad();*/
        



       

      //Aqui empieza el tercero
    
     /*  Scanner captura=new Scanner(System.in);

       
        Persona persona =new Persona();

       persona.pedirDatos();    

       System.out.println(" su tipo de documento es: "+ persona.getTipoDoc());
       System.out.println(" su numero de documento es: "+ persona.getDocumento());
       System.out.println(" su nombre es: "+ persona.getNombre());
       System.out.println(" su apellido es: "+ persona.getApellido());*/
    
 
    //Pido Datos De La SubClase
        
        Scanner captura=new Scanner(System.in);

       System.out.println("por favor digite su tipo de documento ya sea CC o TI "); 
        tipoDoc=captura.next();

        System.out.println("por favor digite su numero de documento "); 
        documento=captura.nextInt();

        System.out.println("por favor digite su nombre "); 
        nombre=captura.next();

        System.out.println("por favor digite su apellido "); 
        apellido=captura.next();

       System.out.println("por favor digite su cargo "); 
       cargo=captura.next();

       System.out.println("por favor digite el valor de la hora "); 
       valorHora=captura.nextInt();

       System.out.println("por favor digite las horas trabajadas"); 
       horasTrabajadas=captura.nextInt();

       System.out.println("por favor digite su departamento"); 
       departamento=captura.next();

       Empleado Empleado=new Empleado( tipoDoc, documento,  nombre, apellido, cargo, valorHora, horasTrabajadas, departamento);
       Empleado.calcularHonorarios();
       captura.close();
       
    }

    
}
