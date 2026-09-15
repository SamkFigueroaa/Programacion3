package Taller1;

public class Ejercicio13 {
    public static void main(String[] args) {
        //lo mismo de siempre, creamos nuestro arreglo principal
        int[]A =new int[10];

        int[]mayor= new int[A.length];
        int[]menor= new int [A.length];
//lo mismo, sub arreglos para los mayores y los menores

        int maximo=30;
        int minimo=1;

        for (int i = 0; i < A.length; i++) {
             A[i]=(int)(Math.random()*(maximo-minimo+1))+minimo;
              System.out.println("A[" + i + "]=" + A[i]);


            
        }
        int suma=0;

        for (int i = 0; i < A.length; i++) {
            suma= suma + A[i];
            
        }
        double media=(double)suma /A.length;
        //formula que econtre para obtener la media

        System.out.println("La media es: "+media);

        int may=0;
        int men=0;

        for (int i = 0; i < A.length; i++) {
            if (A[i]>media) {
                mayor[may]=A[i];
                may++;

                
            }
        if(A[i]<media){
            menor[men]=A[i];
            men++;

        }
        
        

        }
        System.out.println("Numeros menores a la media:");
        
        for(int i=0; i< men;i++){
            System.out.println("Menores["+i+"]="+menor[i]);
            
        }


    }
    
}
