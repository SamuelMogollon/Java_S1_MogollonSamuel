package CONTROLADOR;

import MODELO.Paciente;
import VISTA.menuGeneral;
import java.util.Scanner;

public class ClinicaController {

    private Paciente p1, p2, p3, p4;
    private menuGeneral vista;
    private Scanner sc = new Scanner(System.in);

    public ClinicaController() {
        vista = new menuGeneral();
    }

    public void iniciar() {
        System.out.println(">>> PROGRAMA INICIADO <<<");

        int opcion;
        do {
            opcion = vista.menuPrincipal();

            switch (opcion) {
                case 1 ->
                    registrarPaciente();
                case 2 ->
                    mostrarPacientes();
                case 3 ->
                    atenderPaciente();
                case 4 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }

    private void registrarPaciente() {
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Documento: ");
        String documento = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Motivo: ");
        String motivo = sc.nextLine();

        System.out.print("Telefonos: ");
        String telefonos = sc.nextLine();

        Paciente p = new Paciente(nombre, documento, edad, motivo, telefonos);

        if (p1 == null) {
            p1 = p;
        } else if (p2 == null) {
            p2 = p;
        } else if (p3 == null) {
            p3 = p;
        } else if (p4 == null) {
            p4 = p;
        } else {
            System.out.println("No hay cupos");
        }
    }

    private void mostrarPacientes() {
        vista.mostrar(p1);
        vista.mostrar(p2);
        vista.mostrar(p3);
        vista.mostrar(p4);
    }

    private void atenderPaciente() {
        System.out.println("""
                                       *********************************
                                              ATENDER PACIENTES
                                       *********************************
                                       """);
                    if (p1 != null) {
                        if (p1.getEstado().equals("registrado")) {
                            System.out.println("1. " + p1.getNombre());
                        }
                    }
                    if (p2 != null) {
                        if (p2.getEstado().equals("registrado")) {
                            System.out.println("2. " + p2.getNombre());
                        }
                    }
                    if (p3 != null) {
                        if (p3.getEstado().equals("registrado")) {
                            System.out.println("3. " + p3.getNombre());
                        }
                    }
                    if (p4 != null) {
                        if (p4.getEstado().equals("registrado")) {
                            System.out.println("4. " + p4.getNombre());
                        }
                    }
                    int op_aux2 = new Scanner(System.in).nextInt();
                    if (op_aux2 == 1) {
                        p1.setEstado("ATENDIDO");
                        System.out.println("Paciente " + p1.getNombre() + " ha sido atendido correctamente");
                    }
                    if (op_aux2 == 2) {
                        p2.setEstado("ATENDIDO");
                        System.out.println("Paciente " + p2.getNombre() + " ha sido atendido correctamente");
                    }
                    if (op_aux2 == 3) {
                        p3.setEstado("ATENDIDO");
                        System.out.println("Paciente " + p3.getNombre() + " ha sido atendido correctamente");
                    }
                    if (op_aux2 == 4) {
                        p4.setEstado("ATENDIDO");
                        System.out.println("Paciente " + p4.getNombre() + " ha sido atendido correctamente");
                    }
    }
}
