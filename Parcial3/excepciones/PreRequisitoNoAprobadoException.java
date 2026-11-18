package Parcial3.excepciones;

public class PreRequisitoNoAprobadoException extends Exception{
    
    //Primero vamos a dejar creada los casos de excepciones
    /*entonces aqui si un estudiane tira  inscribir
    una materia pero aun no ha aprobado las anteriores entonces tira esta */
    public PreRequisitoNoAprobadoException(String mensaje){
        super(mensaje);
    }
}
