package Parcial3.excepciones;

public class ColaDeEsperaVaciaException extends  Exception {
    //Esta la utilizamos cuando onsultar al siguiente estudiante
    //de la ola de espera cuando la cola esta vacia
    public  ColaDeEsperaVaciaException(String mensaje){
        super(mensaje);
        
    }
    
}
