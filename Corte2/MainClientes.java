import java.util.Scanner;

public class MainClientes {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ColaClientes sistemaFila= new ColaClientes();
        //Aqui creamos nuestra instancia de nuestra clase ColaClientes

        int opcion;
        String cliente; 

        do {
            System.out.println("-----Fila De Atencion-----");
            System.out.println("1. Llegada de nuevo cliente (agregarlo a la fila)");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Consultar quien es el proximo a aender");
            System.out.println("4. Ver toda la fila con su respectivo total");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    //Aqui en la primera opcion vamos a pedir el nombre del cliente y lo ponemos al final de la fila con el metodo add
                    System.out.println("Ingrese el nombre del cliente: ");
                    cliente = entrada.nextLine();
                    sistemaFila.agregaCliente(cliente);
                    System.out.println("El cliente ya esta en la fila eperando su turno");

                    
                    break;
                    
                    case 2: 
                    //aqui atendemos al primero de la fila y lo sacamos con el respectivo poll
                    System.out.println("Atendiendo a: " + sistemaFila.atenderClientes());
                    break;

                    case 3:
                        //aqui consultmos quien va ser el proximo cliente
                        System.out.println("El proximo cliente en ser atendido es: " + sistemaFila.verSiguienteCliente());

                        case 4: 
                        //Aqui mostramos la lista de la fila y cuantos faltan por atender 
                        sistemaFila.mostrarFila();
                        System.out.println("Total de clientes esperando: " + sistemaFila.cantidadClientes());

                        break;
                        case 5:
                            System.out.println("Cerrando la Atencion al cliente.");


            
                default:
                    System.out.println("La pocion no es valida, digita un numero o opcion valida: ");

                    
            }
            System.out.println();
  
        
        } while (opcion != 5);
        

        
    }
}
