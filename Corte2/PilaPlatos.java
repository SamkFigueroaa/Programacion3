
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


    

    
 
    
 }
