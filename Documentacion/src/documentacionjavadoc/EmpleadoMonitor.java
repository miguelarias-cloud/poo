package documentacionjavadoc;

/**
 *  Empleado que apoya en la docencia
 *  Trabaja por horas
 */

public class EmpleadoMonitor extends EmpleadoUAM {
    /**
     * Horas que trabaja el empleado
     */
    private int horas;
    /**
     * Dinero que gana el empleado por hora trabajada
     */
    private double valorHora;


    /**
     * Constructor con parametros de la clase empleado UAM
     *
     * @param nombre        Nombre del empleado
     * @param salarioBase   Salario base del empleado
     * @param horas         Horas que trabaja el empleado
     * @param valorHora     Dinero que gana el empleado por hora trabajada
     */
    public EmpleadoMonitor(String nombre, double salarioBase, int horas, double valorHora) {
        super(nombre, salarioBase);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    /**
     * Metodo oara calcular el salario dependiendo de las horas trabajadas
      * @return salario calculado en horas * valor hora
     */

    @Override
    public double calcularSalario() {
        return horas * valorHora;
    }

}
