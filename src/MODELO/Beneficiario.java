
package MODELO;

public class Beneficiario extends Persona {
    private int ayudasMes;

    public Beneficiario(String documento, String nombre, String apellido, String direccion, int edad, int ayudasMes) {
        super(documento, nombre, apellido, direccion, edad);
        this.ayudasMes = Math.min(ayudasMes, 5);
    }

    @Override
    public void presentarse() {
        System.out.println("Beneficiario: " + nombre + " " + apellido +
        ", Ayudas al mes: " + ayudasMes);
    }

    public int getAyudas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAyudas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
