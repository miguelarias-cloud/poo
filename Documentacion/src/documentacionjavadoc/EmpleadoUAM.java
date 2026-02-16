package documentacionjavadoc;

/**
 * Clase base que representa a un empleado de una empresa.
 * Contiene los atributos y metodos comunes
 *
 * @author Miguel Arias Palacio
 * @version 1.0
 */

public class EmpleadoUAM {
    /**
     * Nombre del empleado
     */
    protected String nombre;

    /**
     * Salario base del empleado
     */
    protected double salarioBase;

    /**
     * Constructor con parametros de la clase empleado UAM
     *
     * @param nombre      Nombre del empleado
     * @param salarioBase Salario base del empleado
     */

    public EmpleadoUAM(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula el salario total del empleado
     * Este metodo puede ser sobreescrito por las clases hijas
     *
     * @return salarioBase      Salario base total del empleado UAM
     */

    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Metodo para mostrar la informacion basica (nombre y salario) del empleado UAM
     *
     *
     * @return infromacion basica del empleado: Nombre y Salario
     */

    public String mostarInfo(){
        return "Nombre: "+ nombre+ "\nSalario: "+ calcularSalario();
    }
}