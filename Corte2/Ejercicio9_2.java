import java.util.Scanner;
import java.util.Stack;

public class Ejercicio9_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamo nuestra pila para almacenar los caracteres
        Stack<Character> pilaCaracteres = new Stack<>();

        System.out.println("Digita la cadena con el formato X&Y: ");
        String texto = sc.nextLine();

        //aqui es donde ya empezamos a validar lo que nos da el usuario
        if (!texto.contains("&")) {
            System.out.println("Formato no valido: Falta el signo &");

            
        } else {
            //con el seprarador & dividimos el texto 
            String[] fragmentos = texto.split("&");
            //Aqui con el metod .split l oque hacemos es dividir nuestro texto, en este caso en 2

             //Aqui nvalidamos que tengamos dos textos 
            if (fragmentos.length ==2) {
                String parteX = fragmentos[0];
                String parteY = fragmentos[1];
                //aqui signamos cada texto a una variable x o y

                for (int j = 0; j < parteX.length(); j++){
                    //con nuestros metodo push lo guardamos en la cima de la pila
                    pilaCaracteres.push(parteX.charAt(j));
                }

                //aqui creamos una variable la cual estara vacia para ir armando nuestro texto invertido
                String resultadoInvertido = "";

                while (!pilaCaracteres.isEmpty()) {
                    resultadoInvertido += pilaCaracteres.pop();
                    //con el metodo pop sacamos el ultimo elemento que entro a la pila
                    // al sacarla como pila invierte automaticamente la palabra


                    if (resultadoInvertido.equals(parteY)) {
                        //validamo si la cadena al reves es igual a la parteY
                        System.out.println("La segunda parte es la inversa");

                        
                    } else {
                        System.out.println("No coincide con la inversa...");
                        
                    } 
                    } 
                
            } else { 
                        System.out.println("La estructura no esta bien-->");

                }
            
        }
    }
    
}

