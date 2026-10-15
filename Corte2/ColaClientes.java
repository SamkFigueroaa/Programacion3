import java.util.LinkedList;
import java.util.Queue;

public class ColaClientes {

    //comenzamos declarando nuestra cola  con la interfaz Queue
    private  Queue<String> clientesFila;

    //hacemos nuesro metodo constructor para inicar nuestra cola
    public  ColaClientes(){
        clientesFila=new LinkedList<>();

    }
    //comenzamos con el metodo add que es el encargado de agregar los clientes al final de la cola
    public void  agregaCliente(String cliente){
        clientesFila.add(cliente);
    } 

    // luego creamos el meodo poll que se encarga como de atender al primero de la fila y retirarlo 
    public String atenderClientes(){
        if (!clientesFila.isEmpty()) {
            return clientesFila.poll();
            
        } else {
            return "No hay clientes esperando en la fila";
            
        }
    }
    //aqui vamos a mostrar a todos los clientes que estan en nuestra fila
    public void mostrarFila(){
        System.out.println("Fila actul de clientes: " + clientesFila);

    }

    //nos retorna o devuelve la cantidad de clientes que esperan en la cola
    public int cantidadClientes(){
        return  clientesFila.size();
    }

    //aqui verificamos si la cola esta vacio 
    public boolean estaVacia(){
        return clientesFila.isEmpty();
    }
}