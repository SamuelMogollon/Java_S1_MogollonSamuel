package VISTA;

import CONTROLADOR.registroControlador;
import MODELO.Beneficiario;
import MODELO.Colaborador;
import MODELO.Empleado;
import java.util.Scanner;

public class menuVista {

    private registroControlador registro;
    private Scanner sc = new Scanner(System.in);

    public menuVista(registroControlador registro) {
        this.registro = registro;
    }

    public void iniciar() {

        int opcion, tipo;

        do {
            System.out.println("""
                *****************************************
                * FUNDACION AYUDAS COMUNITARIAS  CAMPUS * 
                *****************************************
                * [1] Registrar Persona.                *
                * [2] Ver Personas.                     *
                * [3] Ayudar beneficiario.              *
                * [4] Buscar persona.                   *
                * [5] Eliminar persona.                 *
                * [6] Presentarse.                      *
                * [0] Salir.                            *
                *****************************************
                """);
            System.out.print("➤ Selecciona una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.println("""
                    ******************************
                    * [1] Empleado               *
                    * [2] Colaborador            *       
                    * [3] Beneficiario           *
                    ******************************
                    """);
                    System.out.print("➤ Selecciona el tipo de usuario: ");

                    tipo = sc.nextInt();

                    System.out.print("Documento: ");
                    String documento = sc.next();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.next();
                    sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Direccion: ");
                    String direccion = sc.next();
                    sc.nextLine();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Salario: ");
                            double salario = Double.parseDouble(sc.nextLine());

                            System.out.print("Cargo: ");
                            String cargo = sc.nextLine();
                           
                            String horarioFinal = registro.validarHorario(sc);
                            
                            registro.registrarPersona(
                                    new Empleado(documento, nombre, apellido, edad, direccion, salario, cargo, horarioFinal)
                            );
                            
                            System.out.println("El empleado ha sido registrado correctamente!!");
                        }

                        case 2 -> {
                            System.out.print("Horas al mes: ");
                            int horas = sc.nextInt();

                            System.out.print("Meta voluntaria: ");
                            String meta = sc.next();

                            registro.registrarPersona(
                                    new Colaborador(documento, nombre, apellido, direccion, edad, horas, meta)
                            );
                            
                            System.out.println("El colaborador ha sido registrado correctamente!!");
                        }

                        case 3 -> {
                            registro.registrarPersona(
                                    new Beneficiario(documento, nombre, apellido, direccion, edad, 5)
                            );
                            
                            System.out.println("El beneficiario ha sido registrado correctamente!!");
                        }
                    }
                }

                
                case 2 ->
                    registro.verPersonas();

                case 3 -> {
                    System.out.print("Documento del beneficiario: ");
                    String doc = sc.next();
                    registro.ayudarBeneficiario(doc);
                }

                case 4 -> {
                    System.out.print("Documento a buscar: ");
                    String doc = sc.next();
                    registro.buscarPersona(doc);
                }

                case 5 -> {
                    System.out.print("Documento a eliminar: ");
                    String doc = sc.next();
                    registro.eliminarPersona(doc);
                }

                case 6 -> {
                    System.out.print("Documento que se va a presentar: ");
                    String doc = sc.next();
                    registro.mostrarSaludo(doc);     
                }
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}
