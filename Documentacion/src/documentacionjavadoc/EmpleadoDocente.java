package documentacionjavadoc;

/**
 * Esta clase representa a un empleado encargado de la docencia
 * Trabaja a tiempo completo y recibe un bono adicional
 */


public class EmpleadoDocente extends EmpleadoUAM{

    /**
     * Bono mensual
     */

    private double bono;

    /**
     * Constructor con parametros de la clase empleado UAM
     *
     * @param nombre        Nombre del empleado
     * @param salarioBase   Salario base del empleado
     * @param bono          Bono mensual
     */

    public EmpleadoDocente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    /**
     * Metodo para calcular el salario base más el bono mnensual quye recibe el empleado
     * @return salarioBase+bono     Salario + bono mensual
     */

    @Override
    public double calcularSalario() {
        return salarioBase+bono;
    }
}
