package Taller1;

public class Ejercicio7 {
    public static void main(String[] args) {
        // aqui lo que voy hacer esdelcarar
        // nuestro arreglo A de 10 elementos

        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // aqui lo que hacemos es crear un ciclo for i con el cual vamos
        // a recorrer cada una de las pocisiones del arreglo, luego imprimimos
        // cada uno de los elementos en sus repectivas posiciones.

        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]=" + A[i]);

        }
        System.out.println();
       
        // aqui creamos otros dos arreglos, un areglo donde parecen los pares y otro
        // donde aparecen solo lo impares y lo creamos con el A.length para que tenga el
        // mismo espacio que el arreglo A
        int[] par = new int[A.length];
        int[] impar = new int[A.length];

        // inicializamos nuestra variables en 0
        int numeroPar = 0;
        int numeroImpar = 0;

        // creo un ciclo fori para recorrer el arreglo A
        for (int i = 0; i < A.length; i++) {
            // creamos un if para los pares con esta formula (A[i]%2 ==0), que nos indica
            // que si el numero
            // en esa posicion no deja residuos a la hora de dividirse, entonces:

            if (A[i] % 2 == 0) {
                // entonces guardamos el numero del arreglo A dentro de nuestro arreglo par en
                // la posicion numeroPar

                par[numeroPar] = A[i];
                numeroPar++;
                // luego de guardar en la posicion numeroPar incrementamos un numero para que
                // vaya a la siguiente posicion

            } else {
                // creamos un else, de lo contrario, si deja residus, entonces guardamos el
                // numero en nuestro arreglo impar en
                // la posicion numeroImpar y incrementamos una posicion...
                impar[numeroImpar] = A[i];
                numeroImpar++;

            }

        }
        // creamos un cliclo fori para imprimir cada elemento de cada posicion de los
        // pares
        for (int i = 0; i < numeroPar; i++) {
            System.out.println("pares[" + i + "]=" + par[i]);

        }
        System.out.println();
        // creamos un cliclo fori para imprimir cada elemento de cada posicion de los
        // impares
        for (int i = 0; i < numeroImpar; i++) {
            System.out.println("impares[" + i + "]=" + impar[i]);

        }

    }

}
