package Parcial3.excepciones;

public class CupoLlenoException extends  Exception{
    /*Aqui esta la usamos basicamente para cuanto un materia alcance el
    limite maximo de estudiantes y pues asi mismo mandar
    al estudiante a esperar*/
    public CupoLlenoException(String mensaje){
        super(mensaje);
    }
    
}
