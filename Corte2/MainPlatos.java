import java.util.Scanner;

public class MainPlatos {
    
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //aqui vamos a comenzar creando una instancia de nuestra clase pilaplatos
PilaPlatos cocina = new PilaPlatos();

int opcion; // esta variable es para almacenar la opcion del menu que el usuario desee
String plato; //variable que guarda el nombre del plato que se agrega o que busquen 

do {
    System.out.println("----- MENU DE PLATOS SUCIOS -----");
    System.out.println("1. Agregar plato sucio");
    System.out.println("2. Lavar plato");
    System.out.println("3. Consultar plato en la cima");
    System.out.println("4.Buscar en los platos sucios");
    System.out.println("5. Salir");
    System.out.println("Ingrese porfavor una opcion: ");

    opcion = entrada.nextInt();
    entrada.nextLine();

    switch (opcion) {
        //pido el tipo de plata y luego llamo al metodo push para agregar el plato

        case 1:
            System.out.println("Ingrese el tipo de plato (Ej: Plato hondo, plato plano, plato de postre...");
            plato=entrada.nextLine();
            cocina.agregarPlato(plato);
            System.out.println("Plato Liso para lavar");



            
            break;
            
            case 2: 
            //aqui llamamos al metodo pop para quitar el plato ucio de la pila
            System.out.println(cocina.lavarPlato());
            System.out.println("El plato ha sido lavado con exito");
            break;

            case 3: 
            //aqui muestra el plato en la cima con el peek y tambien la pila
            System.out.println("El plato en la cima es: " + cocina.verPlatoCima());
            System.out.println("Total de platos sucios: " + cocina.cantidadPlatos());
            break;

            case 4: 
            //Aqui le pedimos un plato y con el metodo search buscamos si el plato esta
            System.out.println("Inglesa el plato que quieres buscar: ");
            plato= entrada.nextLine();
            if (cocina.buscarPlato(plato)) {
                System.out.println("El plato (" + plato + ") si esta en la pila pa lavar ");
                
            } else {
                System.out.println("El plato (" + plato + ") no se encuentra sucio o por lavar");

                
            }
            break;

            case 5: 
            System.out.println("Saliendo del lavado de platos...");
            break;
    
        default:
            System.out.println("Ingresa un numero o opcion valida porfavor ");

            
    }
    System.out.println();
    
} while (opcion != 5);
entrada.close();

   } 

}
