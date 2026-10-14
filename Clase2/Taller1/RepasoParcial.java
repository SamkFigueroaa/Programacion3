package Taller1;

public class RepasoParcial {
    public static void main(String[] args) {
        //Arreglo A 
        int[]numeros=new int[3];

        //arrelgo B
        int[]Edades={18,20,21,24,25};

        //Asignar Valor
        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;

        
        //Obtener un valor
        int primerValor=numeros[0];
        int segundoValor=numeros[0];
        int tercerValor=numeros[0];

        //Obtener tamaño del Arreglo
        int tamaño=numeros.length;
       
        for (int i = 0; i < numeros.length; i++) {
             
            
        }
//ejercico par y impar
int[]principal={11,12,13,14,15,16,17,18,19,20};
for (int i = 0; i < principal.length; i++) {
      System.out.println("principal[" + i + "]=" + principal[i]);


    
}
System.out.println();

int[]par=new int[principal.length];
int[]impar=new int[principal.length];


int numeroPar=0;
int numeroImpar=0;

for (int i = 0; i < principal.length; i++) {
    if (principal[i] % 2==0) {
        par[numeroPar]=principal[i];
        numeroPar++;
        
        
    }else {
        impar[numeroImpar]=principal[i];
        numeroImpar++;
        
    }
    System.out.println();
    
    
}
for (int i = 0; i < numeroPar; i++) {
    

System.out.println("Numeros Par: [" + i + "]=" + par[i]);

}
for (int i = 0; i < numeroImpar; i++) {

    System.out.println("Numeros impar: [" + i + "]=" + impar[i]);
    
}

        
    }
}
