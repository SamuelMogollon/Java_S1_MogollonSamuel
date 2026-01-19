package MODELO;

public class Colaborador extends Persona {

    private int horasMes;
    private String meta;

    public Colaborador(String documento, String nombre, String apellido, String direccion, int edad, int horasMes, String meta) {
        super(documento, nombre, apellido, direccion, edad);
        this.horasMes = Math.min(horasMes, 25);
        this.meta = meta;
    }

    public double calcularBonificacion() {
        return horasMes * 55000;
    }

    @Override
    public void presentarse() {
        System.out.println("Colaborador: " + nombre + " " + apellido
                + ", Horas: " + horasMes + ", Meta: " + meta
                + ", Bonificación: $" + calcularBonificacion());
    }
}
