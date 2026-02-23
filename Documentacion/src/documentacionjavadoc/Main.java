package documentacionjavadoc;

/**
 * Clase principal del sistema
 * Esta calse permite probar el funcionamiento de los empleados
 */

public class Main {

    /**
     * Metodo principal del sistema
     * @param args Argumentos de linea de comandos
     */
    public static void main (String[] args){
        //Crear empleados
        EmpleadoUAM emp1= new EmpleadoDocente("Diana", 2000, 100);
        EmpleadoUAM emp2= new EmpleadoMonitor("Juan", 2000, 160, 15);

        System.out.println("Salario empleado 1: "+emp1.calcularSalario()+"\n");
        System.out.println("Salario empleado 2: "+emp2.calcularSalario()+"\n");
        System.out.println("Informacion empleado 1: \n"+ emp1.mostarInfo()+"\n");
        System.out.println("Informacion empleado 2: \n"+emp2.mostarInfo()+"\n");


    }
}