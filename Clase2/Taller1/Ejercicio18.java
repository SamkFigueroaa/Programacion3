package Taller1;

public class Ejercicio18 {
    public static void main(String[] args) {
        
        int[][]Mat= new int[10][10]; 
        //empezamos creando nuestra matriz colocandole un limite de 10x10

        for (int i = 0; i < Mat.length; i++) {
           
          for (int j = 0; j < Mat[i].length; j++) {
            Mat[i][j]= (i+1)*(j+1);
            //lo mismo que el anterior recorremos filas y columnas...
            //ahora en la linea 12 lo que hacemos es multiplicar nuestras matriz
            //pero como empieza el recorrido desde 0 entonces toca primero sumarle 1
            //a la fila y la columna

          }
        }
        System.out.println("===Tabla De Multiplicar===");
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[i].length; j++) {

                System.out.print(Mat[i][j]+"\t");
                /*aqui lo que hacemos es simplemente imprimir las multiplicaciones
                luego usamos el \¨* que sirve para dejar un espacio entre lineas  y listo*/

                
            }
            System.out.println();
            
        }


    }
    
}
