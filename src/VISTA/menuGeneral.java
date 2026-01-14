package VISTA;

import MODELO.Paciente;
import java.util.Scanner;

public class menuGeneral {

    private Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("""
            *********************************
                  CLINICA CAMPUSLANDS
            *********************************
            1. Registrar paciente
            2. Mostrar pacientes registrados
            3. Atender paciente
            4. Salir
            *********************************
            """);
        return sc.nextInt();
    }

    public void mostrar(Paciente p) {
        if (p != null) {
            System.out.println("Paciente: " + p.getNombre());
        }
    }
}
