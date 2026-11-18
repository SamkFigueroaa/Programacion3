package Parcial3.modelo;

public abstract class Persona {
    /*aqui vamos a creas nuestra clase es la padre para cualquier persona
    ya sea estudiante, profesor u otro, y solo vamos a usar 
    mediante la herencia ya que no es posible directamente
      */

    private String nombre;
    private String id;
    private String email;
    /*comenzamos a crear nuestro primeros atributos, estos son privados para hacer
    el encapsuamiento mediante solo los gettters y setters */

    //Aqui creamos nuestro constructor Persona para que tenga sus respectivos datos
    public Persona(String nombre, String id, String email){
        this.nombre = nombre;
        this.id = id;
        this.email = email;

    }

    //Creamos nuestros Getters y setters

    public String getNombre(){
        return  nombre;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getemail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public abstract void mostrarInformacion();
    //este metodo abstracto es el que necesitamos para que nuestra clase
    //hija implemente como su propia version


}
