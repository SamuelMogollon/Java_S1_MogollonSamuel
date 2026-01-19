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
            ******************************
             FUNDACION AYUDAS COMUNITARIAS
            ******************************
             Elige una opcion:
             1. Registrar Persona.
             2. Ver Personas.
             3. Ayudar beneficiario.
             4. Buscar persona.
             5. Eliminar persona.
             6. Presentarse.              
             0. Salir.
            ******************************
            """);

            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.println("""
                    ******************************
                    Seleccione el tipo de persona:
                    1. Empleado
                    2. Colaborador
                    3. Beneficiario
                    ******************************
                    """);

                    tipo = sc.nextInt();

                    System.out.print("Documento: ");
                    String documento = sc.next();

                    System.out.print("Nombre: ");
                    String nombre = sc.next();

                    System.out.print("Apellido: ");
                    String apellido = sc.next();

                    System.out.print("Direccion: ");
                    String direccion = sc.next();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Cargo: ");
                            String cargo = sc.next();

                            System.out.print("Salario: ");
                            double salario = sc.nextDouble();

                            System.out.print("Horario: ");
                            String horario = sc.next();

                            registro.registrarPersona(
                                new Empleado(documento, nombre, apellido, direccion, edad, cargo, salario, horario)
                            );
                        }

                        case 2 -> {
                            System.out.print("Horas al mes: ");
                            int horas = sc.nextInt();

                            System.out.print("Meta voluntaria: ");
                            String meta = sc.next();

                            registro.registrarPersona(
                                new Colaborador(documento, nombre, apellido, direccion, edad, horas, meta)
                            );
                        }

                        case 3 -> {
                            registro.registrarPersona(
                                new Beneficiario(documento, nombre, apellido, direccion, edad, 5)
                            );
                        }
                    }
                }

                case 2 -> registro.verPersonas();

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
                    registro.presentarse(doc);
                }
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}

