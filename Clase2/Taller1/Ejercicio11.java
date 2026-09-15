package Taller1;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] A=new int[10];
        //creo el arreglo donde pondre mis 10 numeros aleatorios 

        int[] positivo=new int[A.length];
        int[] cero=new int[A.length];
        int[] negativo=new int[A.length];
        //aqui creamos los sub arreglos en los cuales meteremos por categoria 
        //los numero que aparezcan en el arreglo principal

        int pos=0;
        int ce=0;
        int neg=0;
        //aqui pongo las variables auxiliares como para que vaya guardando
        //cada dato en sus respectivas posiciones o en sus arreglos

        int maximo=10;
        int minimo=-10;

        for (int i = 0; i < A.length; i++) {
            A[i]=(int)(Math.random()*(maximo-minimo+1))+minimo;
            //aqui lo mismo de siempre para generar nuestros numeros ramdom en nuestros rangos 



            
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]>0) {
                positivo[pos]=A[i];
                pos++;
                /*aqui evaluamos los datos de nuestro rreglo principal y si 
                positivo lo que haces guardar y incrementar la posicion */

                
            }
            if (A[i]==0) {
                cero[ce]=A[i];
                ce++;
                //lo mismo con el neutro

                
            }
            if (A[i]<0) {
                negativo[neg]=A[i];
                neg++;
                //lo mismo pero con el negativo
            }
            
        }
       System.out.println("Numeros positivos: ");
        for (int i=0; i< pos; i++){

        System.out.println(positivo[i]+"");
       }

        System.out.println("Numeros Negativos: ");
        for (int i=0; i< neg; i++){

        System.out.println(negativo[i]+"");
       }

        System.out.println("Numeros ceros: ");
        for (int i=0; i< ce; i++){

        System.out.println(cero[i]+"");
       }





    




        
    }
    
}
