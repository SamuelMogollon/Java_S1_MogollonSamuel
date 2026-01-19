package MODELO;

public class Empleado extends Persona {

    private double salario;
    private String cargo, horario;

    public Empleado(String documento, String nombre, String apellido, int edad, String direccion, double salario, String cargo, String horario) {
        super(documento, nombre, apellido, direccion, edad);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    @Override
    public void presentarse() {
        System.out.println("Empleado: " + getNombre());
    }
}
