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
            break;
      
        default:
            break;
      }
            
        } while (opcion != 6);
    }

    
}
