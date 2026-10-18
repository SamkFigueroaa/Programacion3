package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCappriato {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        //Comenzamos creando nuestro ArrayList para manipular nuestro menu
        ArrayList<PlatoCappriato> listamenu = new ArrayList<>();

        //Aqui agrego unos platos para comenzar con algo en el menu, con el metodo .add
        listamenu.add(new PlatoCappriato("Di Napolitano", 45000, "Pan focaccia, salsa napoltana, albahaca, jamon serrano, burrata y reducion balsamica"));
        listamenu.add(new PlatoCappriato("Nuvola Al Tartufo", 48000, "Mayonesa trufada, Rugula, Ovoline, Jamon Serrano, Uchuvas Caramelizadas y Parmesano"));
        listamenu.add(new PlatoCappriato("Soda Italiana De Maracuya", 15000, "Soda Bretaña, Zumo De Limon y Sirope De Maracuya"));
        listamenu.add(new PlatoCappriato("Soda Italiana De Frutos Rojos", 15000, "Soda Bretaña, Zumo De Limon Y Sirope De Frutos Rojos"));
   
        int opcion;

        do { 
            System.out.println("\n===== MENU CAPPRIATO - GESTION =====");
            System.out.println("1. Agregar nuevo plato o bebida");
            System.out.println("2. Ver el menu completo y total de productos");
            System.out.println("3. Actualizar informacion de un plato");
            System.out.println("4. Eliminar un plato del menu");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opcion: ");
opcion = sc.nextInt();
sc.nextLine();

      switch (opcion) {
        case 1:
            //Aqui usamos el .add() para agregar nuevos productos al menu
            System.out.println("Ingrese el nombre del Plato o bebida: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese los ingredientes: ");
            String ingredientes = sc.nextLine();

            listamenu.add(new PlatoCappriato(nombre, precio, ingredientes));
            System.out.println("Nuevo producto Agregado con exito...");
            break;

            case 2:
                //Aqui usaremos el .size() y el .get() para ver a lista y el total de registros que hay en el menu
                if (listamenu.isEmpty()) {
                    System.out.println("El menu esta vacio en estos momentos.");

                    
                } else {
                    System.out.println("\n--- LISTA DE PLATOS Y BEBIDAS ---");
                    //con el .size() nos dice la cantidad de elementos que hay
                    for (int i = 0; i < listamenu.size(); i++) {

                        //luego el .get(i) es el que trae el objeto en una posicion especifica
                        System.out.println((i + 1) + ". " + listamenu.get(i));
                        
                    }
                    System.out.println("Totsl de registros en el menu: " + listamenu.size());
                    
                }
                break;

                case 3: 
                // aqui vamos a usar el .set() para la modificacion de un producto o elemento en especifico
                if (listamenu.isEmpty()) {
                    System.out.println("No hay platos para modificar");

                    
                } else {
                    System.out.println("Ingrese el numero de la posicion (1 a" + listamenu.size() + ") que desea actualizar:");
                    int index = sc.nextInt() - 1 ;
                    if (index >= 0 && index < listamenu.size()) {
                        sc.nextLine();
                        System.out.println("Nuevo nombre: ");
                        String nuevoNombre = sc.nextLine();
                        System.out.println("Nuevo Precio: ");
                        double nuevoPrecio = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nuevos ingredientes: ");
                        String nuevosIngredientes = sc.nextLine();

                        // con el .set() reemplazamos el objeto antiguo y lo reemplazamos por el nuevo
                        listamenu.set(index, new  PlatoCappriato(nuevoNombre, nuevoPrecio, nuevosIngredientes));
                        System.out.println("Plato actualizado correctamente");
                        
                    } else {
                        System.out.println("Numero de posicion incorrecto.");
                        
                    }
                    
                }
                break;
                case 4: 
                //ahora aqui utilizo el .remove() para eliminar un elemento que quiera
                if (listamenu.isEmpty()) {
                    System.out.println("El menu ya esta vacio.");
                    
                } else {  
                    System.out.println("Ingrese el numero de la posicion (1 a " + listamenu.size() + ") que desee eliminar:");
                    int pos = sc.nextInt() - 1;
                    if (pos >= 0 && pos < listamenu.size()) {
                        //con el remove sacamos el elemento de la lista y organiza el arraylist
                        PlatoCappriato eliminado = listamenu.remove(pos);
                        System.out.println("Se ha eliminado del menu: " + eliminado.getNombre());

                        
                    } else {
                        System.out.println("Opcion incorrecta.");
                        
                    }
                    
                }
                break;

                case 5: 
                //Aqui con el .clear() para limpiar todo el contenido de nuestra arraylist
                listamenu.clear();
                System.out.println("Se ha norrado todo el menu de Cappriato...");
                break;

                case 6: 
                System.out.println("Saliendo Del Sistema de gestion de Cappriato...");
                break;

      
        default:
            System.out.println("Opcion no valida, vuelve a intentarlo.");
            break;
      }
            
        } while (opcion != 6);
    }

    
}
