package Taller1;

public class Ejercicio9 {
    public static void main(String[] args) {
       //CODIGO RECICLADO DEL EJERCICIO 8
       //Aqui copio el inicio del anterior ejercicio par que me genere numeros ramdom dentro
       //del rango y crwamos nuestro arreglo de 30
        int maximo=30;
        int minimo=1;
        

        int[] A=new int[30];
  
        for (int i = 0; i < A.length; i++) {
           
        A[i]= (int)(Math.random()* (maximo-minimo+1))+minimo;
           
        }
        

        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]=" + A[i]);

        }
        //FINALIZA EL CODIGO RECICLADO DEL EJERCICIO 9
        int numBuscado=(int)(Math.random()* (maximo-minimo+1))+minimo;
        //aqui generamos nuestro numero ramdom dentro del rango 
       
        int contador=0;
        //aqui inicializamos nuestra variable en 0
       
        for (int i = 0; i < A.length; i++) {
            if (A[i]==numBuscado) {
                contador++;

                
            }
            
            
        }
        System.out.println();
        System.out.println("El numero a buscar es: "+numBuscado);
        System.out.println("El numero de veces que se repite es: "+contador);

    
    }
}
