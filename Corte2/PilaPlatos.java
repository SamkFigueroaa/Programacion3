
 import java.util.Stack;

 public class PilaPlatos {
    //aqui comenzamos declarando nuestra pila para almacenar los plaros sucios
    private Stack<String> platosSucios;

    //creamos el contructor para inicializar la pila
    private PilaPlatos() {
        platosSucios = new Stack<>();
    }
    //creamos el medoto push que e el engcargado de agregar un plato sucio
    public void agregarPlato(String plato){
        platosSucios.push(plato);

    }

    //creamos un metodo pop: que se encarga de quitar el plato (en este caso lo lava)
    public String lavarPlato(){
        if (!platosSucios.isEmpty()) {
            return platosSucios.pop();
            
        } else {
            return "No hay platos sucios por lavar.";
            
        }
    }

    //aqui creamos el metodo peek: que se encarga de ver que plato esta en la cima de la pila sin modificarlo

    public String verPlatoCima(){
        if (!platosSucios.isEmpty()) {
            return platosSucios.peek();
            
        } else {
            return "no hay platos sucios en la pila";
            
        }
    }
    //aqui muestra todos los platos actuales en la pila
    public void mostrarPlatos(){
        System.out.println("Torre de platos sucios: " + platosSucios);
    }

    //Aqui crearemos un metodo buscar, el cual nos busca un plato especifico 
    // -1 si no esta o no hay
    public boolean buscarPlato(String plato){
        return platosSucios.search(plato) != -1;
    }

    //Aqui devolvemos la cantidad de platos que esten en la pila
    public int cantidadPlatos(){
        return platosSucios.size();
    }

    //aqui verificamos si la pila esta vacia
    public boolean estaVacia(){

        return platosSucios.isEmpty();
    }

    

    
 
    
 }
