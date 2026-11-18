package Parcial3.excepciones;

public class EstudianteNoEncontradoException extends Exception {
    public EstudianteNoEncontradoException(String mensaje){
        super(mensaje);
        /*Aqui basicamente es la excepcion que se lanaa cuando
        inscribimos o eliminamos a un estudiante 
        y usamos el codigo que no existe y no aparece registrado */
        
    }
    
}
