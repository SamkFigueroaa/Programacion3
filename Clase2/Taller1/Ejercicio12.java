package Taller1;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] A=new int[10];
        //creamos nuestro arreglo principal

        int[]B=new int[A.length];
        //aqui creamos el sub arreglo el cual nos dara las posiciones
//creamosnuestro numero a encontrar 
        int x= 5;
        int pos=0; 
        //la varialble pos es la encargada de ser el contador el cual nos hace saber 
        //en donde como que guarda la posicion de el subarreglo 

        int maximo= 10;
        int minimo= 1;

        for (int i = 0; i < A.length; i++) {
            A[i]=(int)(Math.random()*(maximo-minimo+1))+minimo;
             System.out.println("A[" + i + "]=" + A[i]);

            
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]==x) {
                B[pos]=i;
                pos++;
                
            }


            
        }
        System.out.println("El numero que estamos buscando es:" +x);
        System.out.println();
        System.out.println("Esta en las posiciones: ");

        for(int i = 0; i < pos; i++){
            System.out.println("B["+i+"]"+B[i]);
        }

    }
}
