package Taller1;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        int[][]Mat={
            {4,7,5,8,2},
            {3,0,2,7,5},
            {9,3,2,4,7},
        };
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[i].length; j++) {
             /*basicamente es igual que con los arreglos pero aqui para poder leer 
             o para poder recorrer cada fila y columna, utilizamos i(para las filas) y
             j(para las columnas) */
             
             System.out.println("Mat["+i+"]["+j+"]="+Mat[i][j]);
             //aqui imprimimos y hacemso la sumatoria de nuestra matriz

            }
            
        }
        for (int i = 0; i < Mat.length; i++) {
            int suma=0;

            for (int j = 0; j < Mat[i].length; j++) {
                suma= suma+Mat[i][j];
                
            }
            System.out.println("La sumatoria de la fila es "+i+"="+ suma);

            
        }

    }
    
}
