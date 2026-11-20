package Parcial3.modelo;

import java.util.LinkedList;
import java.util.Queue;

public class Materia {
    //aqui comienzo a crear mis atributos privados que nos permitiran encapsular...
    private String codigo;
    private String nombre;
    private int creditos;
    private int cupoMaximo;
    private int cuposActuales;

    //este es el arreglo con el cual va a almacenar los codigos de las materias prerrequisito   
    private String[] preRequisito;
    private int totalPrerequisitos;


    //Aqui con la cola Queue de los estudiantes en espera 
    //voy a usar el Linkelist 
    //aqui nos almacena los ID de los estudiantes que estan ya en una 
    //fila porque la materia se lleno
    private Queue<String> colaDeEspera;

    //ahora comenzamos con el constructor de la materia 
    public Materia(String codigo, String nombre, int creditos, int cupoMaximo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos= creditos;
        this.cupoMaximo = cupoMaximo;
        this.cuposActuales =0; 

        //vamos a inicializamos nuestro arreglo de los prerrequisitos
        this.preRequisito = new String[5];
        this.totalPrerequisitos= 0;

        this.colaDeEspera = new LinkedList<>();
        //inicializamos nuestra cola

    }

    //comenzamos con los metodos de prerrequisitos...

    //El primer metodo que voy a hacer es el de agregar la materia 
    // que si o si tiene que estar aprobada 

    public void agregarPreRequisito(String codigoMateria){
        if (totalPrerequisitos < preRequisito.length) {
            preRequisito[totalPrerequisitos]= codigoMateria;
            totalPrerequisitos++;
            
        }
    }

    //Aqui es el metodo para verificar si el codigo de una materia 
    //hace parte de los prerrequisitos 
    public  boolean esPreRequisito(String codigoBuscando){
        for (int i = 0; i < totalPrerequisitos; i++) {
            if (preRequisito[i].equalsIgnoreCase(codigoBuscando)) {
                return true;
                
            }
        }
        return false;
    }

    //aqui el metodo para verificar si la materia todavia tiene un cupo disponible
    public boolean hayCupo(){
        return cuposActuales < cupoMaximo;
      }

      //Metodo par inscribir un estudiante, este aumenta el contador de los cupos
      public void ocuparCupo(){
        if (cuposActuales < cupoMaximo) {
            cuposActuales++;
            
        }
      }

      //metodo para como poder eiminar un cupo o dejar el cupo vacio
      public void liberarCupo(){
        if (cuposActuales > 0) {
            cuposActuales--;
            
        }
      }
//es el metodo para poder manejar la cola de espera
      public void agregarColaDeEspera(String idEstudiante){
         
        colaDeEspera.offer(idEstudiante); // el offer basicamente mete a la persona al final de nuestra fila

      }

      public String atenderSiguienteEnCola(){
        return colaDeEspera.poll(); //el poll saca y devuelve al primer estudiante que hizo fila
    
        
    }

    public boolean tieneEstudiantesEnEspera(){
        return !colaDeEspera.isEmpty();
    }

    //colocams nuestros Getters y Setters 

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getCreditos(){
        return creditos; 
    }

    public void setCreditos(int creditos){
        this.creditos= creditos;
    }

    public int getCupoMaxiom(){
        return  cupoMaximo;
    }

    public void setCupoMaximo( int cupoMaximo){
        this.cupoMaximo= cupoMaximo;
    }

    public int getCuposActuales(){
        return cuposActuales;

    }

    public Queue<String> getColaDeEspera(){
        return colaDeEspera;
    }

    public void mostrarInformacionMateria(){
        System.out.println("----------------------------------");
        System.out.println("Materia   : " + codigo + "-" + nombre);
        System.out.println("Creditos : " + creditos);
        System.out.println("Cupos   : " + cuposActuales + " / " + cupoMaximo);
        System.out.println("En espera  : " + colaDeEspera.size() + "estudiantes en cola");
        System.out.println("----------------------------------");

    }




    
}
