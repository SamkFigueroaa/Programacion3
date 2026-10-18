package ArrayList;

public class PlatoCappriato {

    //comenzamos creando los atributos basicos que tendra las bebidas y los platos
    private String nombre;
    private double precio;
    private String ingredientes;


    //el constructor para inicializar nuestros datos
    public PlatoCappriato(String nombre, double precio, String ingredientes){
        this.nombre = nombre; 
        this.precio = precio;
        this.ingredientes = ingredientes;
    }
    

    //Comenzamos agregar los getters y setters para poder consutar y modificar
   public  String getNombre(){
    return nombre;
   }

   public void setNombre(String nombre){
    this.nombre = nombre;
   }

   public double getPrecio() {
    return precio;

   }

   public void setPrecio(){
    this.precio = precio;
   }

   public String getIngredientes(){
    return  ingredientes;
   }

   public void setIngredientes(String ingredientes){
    this.ingredientes = ingredientes;
   }
   
   public void mostrarInformacion(){
    System.out.println("Plato/Bebida: " + nombre + "| Precio: $" + precio + " | ingredientes: " + ingredientes);
   }
}
