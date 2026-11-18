package Parcial3.excepciones;

public class HorarioConFlictivoException extends Exception {
    public HorarioConFlictivoException(String mensaje){
        super(mensaje);
        /*Esta excepcion es la que vamos a usar para cuando intenten reservar un
        salon o aula en un dia o hora en la cual ya hay una clase programada... */
        
    }

    
}
