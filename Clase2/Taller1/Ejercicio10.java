package Taller1;

public class Ejercicio10 {
    public static void main(String[] args) {
         //CODIGO RECICLADO DEL EJERCICIO 8
       //Aqui copio el inicio del anterior ejercicio par que me genere numeros ramdom dentro
       //del rango y crwamos nuestro arreglo de 30
        int maximo=10;
        int minimo=1;
        

        int[] A=new int[10];
        //Creamos un arreglo con capacidad de 10 espacios
  
        for (int i = 0; i < A.length; i++) {
          //Aqui seria el generador del numero ramdom dentro de los rangos estipulados  
        A[i]= (int)(Math.random()* (maximo-minimo+1))+minimo;
           
        }
        

        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]=" + A[i]);
            //AQui lo mismo de los anteriores, creamos el ciclo para recorrer cada posicion del arreglo
            //para luego imprimirlos uno por uno

        }
        //Aqui lo que hago es dividir nuestro primer arreglo en dos, asi reservando solo 5 posiciones inicializadas en 0...
        int[] B =new int[A.length/2];
        System.out.println();

        
        for (int i = 0; i < B.length; i++) {
            B[i]=A[i]+A[A.length -1-i];
            //esta seria la formula para sumar extremos (me toco bucarla) 
            /*Lo que hace es que A[i] trae el primer numero de mi arreglo, mientras que
            A[A.length -1-i] lo que hace es traer el ultimo numero de mi arreglo, esto sumandolos y agregandolos 
            al arreglo B  */

             System.out.println("B["+i+"]="+B[i]);
        }
       
    }
}
