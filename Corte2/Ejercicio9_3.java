import java.util.Scanner;
import java.util.Stack;

public  class Ejercicio9_3 {

    
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);

        //Aqui comenzamos agregando nuetra pila de caracteres pra ingresar los simboos
        Stack<Character> pilaSimbolos= new Stack<>();

        System.out.println("Ingresa una expresion matematica: ");
        String expresion = lector.nextLine();

        //colocamos una bariable que nos avisara si esta balanceada o no 
        boolean estaBalanceado =  true; 


        //creamos nuestro fori para recorrer cada caracter de la expresion
        for (int i = 0; i < expresion.length(); i++) {
            char simbolo = expresion.charAt(i);

            //aqui hacemos nuestra verificacion de que si el simbolo es de apertura, lo apilamos 
            if (simbolo == '(' || simbolo == '[' || simbolo == '{' ) {
                pilaSimbolos.push(simbolo);

                // de lo contrario seria un simbolo de cierre y lo validamos
            } else if (simbolo == ')' || simbolo == ']' || simbolo == '}') {
                
            } {
                
            }
            
        }
    }
}