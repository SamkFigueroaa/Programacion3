package Parcial3.modelo;

public class Estudiante extends  Persona {
    /* Aqui heredamos la clasa abstracta Personas 
    en este caso el estudiante representa  el estudiante registrado con su respectivo id y todo*/

    private String carrera;
    private int semestre;
    //creamos nuestros atributos del estudiante 

    private String[] materiasAprobadas;
    private int totalAprobadas;
    //Creo este arreglo para almcenar los codigos de la materias

    private String[] materiasInscritas;
    private int totalInscritas;

    // hago aqui mi metodo constructor para recibir tanto los datos de persona como los propios de estudiante
    public Estudiante(String nombre, String id, String email, String carrera, int semestre){
        //Aqui llamamos primero al constructor de nuestra clase padre...
        super(nombre, id, email);
        this.carrera = carrera;
        this.semestre = semestre;

        //Inicializo mis arreglos, en este caso voy a poner por poner 50
        this.materiasAprobadas = new String[50]; //nuestro limite de materias en nuestro historial
        this.totalAprobadas = 0;
        
        this.materiasInscritas = new String[10]; //maximo 10 materias inscritas
        this.totalInscritas = 0;

    }

    // Comenzamos con los metodos de Gestion De Materias Del Estudiante

    //Aqui vamos a crear el metodo que nos ayuda a registrar una materia
    // que el estudiante ya aprobo 
    public void agregarMateriasAprobada(String codigoMateria){
        if (totalAprobadas < materiasAprobadas.length) {
            materiasAprobadas[totalAprobadas] = codigoMateria;
            totalAprobadas++;
            
        }
    }

    //Aqui usaremos un metod que nos ayudara a verificar si el estudiante ya aprobo una materia especifica
    public boolean tieneMateriaAprobada(String codigoMateria){
        //Aqui voy a recorrer solo hasta el totalAprobadas, para que no nos de o no revisemos como los campos vacios 
        for (int i = 0; i < totalAprobadas; i++) {
            if (materiasAprobadas[i].equalsIgnoreCase(codigoMateria)) {
                return  true; //es decir que ya la aprobo... 
                
            }
            
        }
        return  false; // de lo contrario no lo ha aprobado
    }

    //Aqui crearemos el METODO para inscribir una materia en el semestre actual
    public  boolean inscribirMateria(String codigoMateria){
        //Colocamos un if para verificar que no se pase de 10 materias
        if (totalInscritas < materiasInscritas.length) {
            materiasInscritas[totalInscritas] = codigoMateria;
            totalInscritas++;
            return true;
            
            
        }
        return false; // es decir que ya alcanzo el limite de materias para inscribir

    }

    //continuo con el METODO para cancelar una materia inscrita y tambien para hacer o deshacer
    public  boolean retirarMateria(String codigoMateria){
        for (int i = 0; i < totalInscritas; i++) {
            if (materiasInscritas[i].equalsIgnoreCase(codigoMateria)) {
                //luego aqui nos toca correr pues los elementos a la izquierda porque
                // a la hora de eliminar nos quedaria un hueco
                for (int j = 0; j < totalInscritas - 1; j++) {
                    materiasInscritas[j] = materiasInscritas[j + 1];

                    
                }
                materiasInscritas[totalInscritas - 1] = null; //eliminamos o limpiamos el vacio

                totalInscritas--;
                return true;

                
            }
            
        }
        return false;
    }

    //Continuamos con el METODO que nos ayudara a validar que el estudiante ya tiene esa materia inscrita
    public boolean estaInscritoEn(String codigoMateria){
        for (int i = 0; i < totalInscritas; i++) {
            if (materiasInscritas[i].equalsIgnoreCase(codigoMateria)) {
                return true;
                
            }
            
        }
        return false;
    }

    //Ahora creamos nuestros Getters y Setters
    public String getCarrera() { 
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public int getSemestre(){
        return semestre;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public String[] getMateriaAprobadas(){
        return materiasAprobadas;
    }

    public int getTotalAprobadas(){
        return totalAprobadas;

    }

    public String[] getMateriasInscritas(){
        return  materiasInscritas;
    }

    public int getTotalInscritas(){
        return totalInscritas;
    }
    
    //Aqui implemtentamos el metodo abstract de Persona

    @Override
    public void mostrarInformacion(){
        System.out.println("________________________________");
        System.out.println("ID Estudiante : " + getId());
        System.out.println("Nombre        : " + getNombre());
        System.out.println("Email         : " + getEmail());
        System.out.println("Inscritas     :" + totalInscritas + "Semestre " + semestre + ")");
        System.out.println("Inscrtas      :" + totalInscritas + " materias");
        System.out.println("Aprobadas     : " + totalAprobadas + "materias");
        System.out.println("_______________________________");
    }

}


