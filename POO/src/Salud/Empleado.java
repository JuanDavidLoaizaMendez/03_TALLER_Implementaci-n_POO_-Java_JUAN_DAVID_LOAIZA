package Salud;

public class Empleado extends Persona{
    //Creo Atributos Propios De La SubClase O De La Clase Hija
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    
    //Creo El Metodo Constructor De La SubClase Y Traje Los Atributos De La SuperClase
    public Empleado(String tipoDoc, int documento, String nombre, String apellido,String cargo,int valorHora,int horasTrabajadas,String departamento){

        super(tipoDoc,documento,nombre,apellido);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;

    }
    //Creo Los Metodos Propios De La SubClase
    public void  calcularHonorarios(){

     double totalPagar;

     totalPagar = valorHora*horasTrabajadas;
     totalPagar = ((totalPagar) - (0.966/100));
     

       System.out.println(" su tipo de documento es: "+getTipoDoc()+" su documento es: "+ getDocumento()+" su nombre es: "+getNombre()+" su apellido es: "+getApellido()+" su cargo es: "+cargo+" sus horas trabajadas son: "+horasTrabajadas+" el valor por hora es de: "+valorHora+" su departamento es: "+departamento+" el total a pagar es: "+totalPagar);
      
       

    }
}