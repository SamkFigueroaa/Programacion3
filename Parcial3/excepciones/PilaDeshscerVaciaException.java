package Parcial3.excepciones;

public class PilaDeshscerVaciaException extends Exception {
    /*Esta excepcion se lanza cuando el usuario selecciona la opcion de deshacer o
    la de rehacer entonces la pila en ese caso no tiene nada para usar esta opcion */
    public PilaDeshscerVaciaException(String mensaje){
        super(mensaje);
    }
    
}
