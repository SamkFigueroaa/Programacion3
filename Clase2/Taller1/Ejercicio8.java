package Taller1;

public class Ejercicio8 {
    public static void main(String[] args) {
        int maximo=30;
        int minimo=1;
        //inicializamos dos variables, la que nos daran el rango entre el minomo y maximo 

        int[] A=new int[30];
        //Aqui creamos un arrglo la cual tiene 30 espacios, por el momento todas en cero
        for (int i = 0; i < A.length; i++) {
            //iniciamos un contador paea que recorra el arreglo de uno en uno
        A[i]= (int)(Math.random()* (maximo-minimo+1))+minimo;
           /*Aqui lo que hacemos es generar un numero al azar con el .ramdom
           luego de esto usamos "(maximo-minimo+1)" para que la maquina calcule
           cuantos numeros entre el rango que le puse, en este caso son los 30
           y lo multiplicamo para nos de un numero entero. */ 

        }
         // aqui lo que hacemos es crear un ciclo for i con el cual vamos
        // a recorrer cada una de las pocisiones del arreglo, luego imprimimos
        // cada uno de los elementos en sus repectivas posiciones.

        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]=" + A[i]);

        }
        int mayor=A[0];
        int menor=A[0];
        //inicializamos las vriables axiliares en 0


        for (int i = 0; i < A.length; i++) {
            if (A[i]>mayor) {
                mayor=A[i];
                /*este ciclo y l if, lo hacemos basicamente para que en orden vaya analizando cada elemento 
                de nuestro arreglo, y vaya verificando si ese elemento es mayor al que ya teniamos, 
                si es asi, ese elemento pasa a ser el mayor  y asi ucesivamente */
            }

            
        
        
            if (A[i]<menor) {
                menor=A[i];
                // lo mismos que el mayor pero en este caso verificando quien es el menor
                
            }

            
        }
       
       int contMayor=0;
         int contMenor=0;
         //inicilializamos nuestras variales de tipo contador en 0 
         
        /*aqui volvemos a crear un fori para leer uno por uno el arreglo, luego creamos unos if para que 
        verifique i el numero que tiene ahi es igual al que ya teniamos antes en el mayor o en el menor,
        entonces que aumente nuestra variable contador ya sea la menor o la mayor y asi sucesivamente */
         for (int i = 0; i < A.length; i++) {
            if (A[i]==mayor) {
                contMayor++;

                
            }
            if (A[i]==menor) {
                contMenor++;
                
            }
            
            
         }
        System.out.println();
         System.out.println("El Numero mayor es:" +mayor);
            System.out.println("El numero de repeticiones del numero mayor es:" + contMayor);
            System.out.println();
            System.out.println("El Numero menor es:" +menor);
            System.out.println("El numero de repeticiones del numero menor es:" + contMenor);
           

        
    }
    
}
