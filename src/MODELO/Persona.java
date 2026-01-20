package MODELO;

public abstract class Persona {

    protected String documento, nombre, apellido, direccion;
    protected int edad;

    public Persona(String documento, String nombre, String apellido, String direccion, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void presentarse();

    public void saludar() {
        System.out.println("**********************************************************");
        System.out.println("¡Hola! Soy " + this.nombre + " " + this.apellido);
        System.out.println("Estoy registrado en: FUNDACIÓN AYUDAS COMUNITARIAS CAMPUS");
        System.out.println("**********************************************************");
    }
}
