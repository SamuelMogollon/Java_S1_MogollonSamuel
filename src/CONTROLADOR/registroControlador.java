package CONTROLADOR;

import MODELO.Beneficiario;
import java.util.ArrayList;
import MODELO.Persona;

public class registroControlador {

    private ArrayList<Persona> personas = new ArrayList<>();

    public void registrarPersona(Persona p) {
        personas.add(p);
    }

    public void verPersonas() {
        for (Persona p : personas) {
            p.presentarse();
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

            if (p instanceof Beneficiario b && b.getDocumento().equals(documento)) {

                if (b.getAyudas() > 0) {
                    b.setAyudas(b.getAyudas() - 1);
                    System.out.println("Ayuda entregada. Ayudas restantes: " + b.getAyudas());
                } else {
                    System.out.println("Este beneficiario ya no tiene ayudas disponibles.");
                }
                return;
            }
        }

        System.out.println("Beneficiario no encontrado.");
    }

    public void buscarPersona(String documento) {

        for (Persona p : personas) {

            if (p.getDocumento().equals(documento)) {
                System.out.println("Persona encontrada:");
                p.presentarse();  // Muestra su información
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

}
