package CONTROLADOR;

import MODELO.Beneficiario;
import java.util.ArrayList;
import MODELO.Persona;
import java.util.Scanner;

public class registroControlador {

    private ArrayList<Persona> personas = new ArrayList<>();

    public void registrarPersona(Persona p) {
        personas.add(p);
    }

    public void verPersonas() {
        System.out.println("*****************************************");
        System.out.println("*     LISTA DE PERSONAS REGISTRADAS     *");
        System.out.println("*****************************************");

        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas aún. ");
        }

        for (Persona p : personas) {
            p.presentarse();
            System.out.println("*****************************************");
        }
    }

    public void presentarse(String documento) {
        for (Persona p : personas) {
            if (p.getDocumento().equals(documento)) {
                p.presentarse();
                return;
            }
        }
        System.out.println("Persona no encontrada.");
    }

    public void ayudarBeneficiario(String documento) {
        for (Persona p : personas) {
            // Verificamos que sea un Beneficiario y coincida el documento
            if (p instanceof Beneficiario b && b.getDocumento().equalsIgnoreCase(documento)) {

                if (b.getAyudas() > 0) {
                    b.setAyudas(b.getAyudas() - 1);
                    System.out.println("------------------------------------");
                    System.out.println("¡ÉXITO! Ayuda entregada.");
                    System.out.println("Beneficiario: " + b.getNombre());
                    System.out.println("Ayudas restantes: " + b.getAyudas());
                    System.out.println("------------------------------------");
                } else {
                    System.out.println("El beneficiario ya no tiene ayudas disponibles.");
                }
                return;
            }
        }
        System.out.println("No se encontró ningún beneficiario con documento: " + documento);
    }

    public void buscarPersona(String documento) {

        for (Persona p : personas) {

            if (p.getDocumento().equals(documento)) {
                System.out.println("Persona encontrada:");
                p.presentarse();
                return;
            }
        }

        System.out.println("Persona no encontrada.");
    }

    public void eliminarPersona(String documento) {

        for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).getDocumento().equals(documento)) {
                personas.remove(i);
                System.out.println("Persona eliminada correctamente.");
                return;
            }
        }

        System.out.println("Persona no encontrada.");
    }

    public String validarHorario(Scanner sc) {
        String horarioFinal = "";
        boolean esValido = false;

        while (!esValido) {
            try {
                System.out.print("""
                ******************************
                * Selecciona el Horario:     *
                * [1] 8 A.M. - 5 P.M.        *
                * [2] 2 P.M. - 11 P.M.       *
                ******************************
                ➤ Opción: """);

                int opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {
                    horarioFinal = "8 A.M. - 5 P.M.";
                    esValido = true;
                } else if (opcion == 2) {
                    horarioFinal = "2 P.M. - 11 P.M.";
                    esValido = true;
                } else {
                    System.out.println(" Opción no válida. Por favor, elige 1 o 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Error: Debes ingresar un número (1 o 2), no letras.");
            }
        }
        return horarioFinal;
    }

    public void mostrarSaludo(String documento) {
        for (Persona p : personas) {
            if (p.getDocumento().equals(documento)) {
                p.saludar();
                return;
            }
        }
        System.out.println("No se encontró a la persona.");
    }

}
