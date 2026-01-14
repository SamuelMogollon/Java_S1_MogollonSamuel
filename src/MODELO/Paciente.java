package MODELO;

public class Paciente {

    private String nombre;
    private String documento;
    private int edad;
    private String motivoConsulta;
    private String telefonos;
    private String tipoPaciente;
    private String estado;

    public Paciente(String nombre, String documento, int edad,
                    String motivoConsulta, String telefonos) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
        this.telefonos = telefonos;
        this.estado = "registrado";
        this.tipoPaciente = calcularTipo();
    }

    private String calcularTipo() {
        return edad <= 18 ? "Menor" : "Adulto";
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public int getEdad() { return edad; }
    public String getMotivoConsulta() { return motivoConsulta; }
    public String getTelefonos() { return telefonos; }
    public String getTipoPaciente() { return tipoPaciente; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
