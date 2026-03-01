package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {

    static ArrayList<Asignatura> asignaturas = new ArrayList<>(); //<--el arrayList para Asignatura
    static ArrayList<Estudiante> estudiantes = new ArrayList<>(); //<--el arrayList para Estudiante
    static ArrayList<Nota> notas = new ArrayList<>(); //<--el arrayList para la Nota
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            System.out.println("\n===== SISTEMA ACADÉMICO =====");
            System.out.println("1. Gestión de Estudiantes");
            System.out.println("2. Gestión de Asignaturas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    menuEstudiantes();
                    break;

                case 2:
                    menuAsignaturas();
                    break;

                case 0:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcionPrincipal != 0);

    }

    public static void menuAsignaturas() {

        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE ASIGNATURAS ---");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                //case 1: registrarAsignatura(); break;
                //case 2: listarAsignaturas(); break;
                //case 3: buscarAsignatura(); break;
                //case 4: actualizarAsignatura(); break;
                //case 5: eliminarAsignatura(); break;
            }

        } while (opcion != 0);
    }

    public static void menuEstudiantes() {

        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE ESTUDIANTES ---");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    listarEstudiante();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 4:
                    actualizarEstudiante();
                    break;
                case 5:
                    eliminarEstudiante();
                    break;
            }

        } while (opcion != 0);
    }

    public static void registrarEstudiante() { //<--Para registrar a los estudiantes
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite el Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Digite la edad:");
        int edad = sc.nextInt();

        Estudiante estudiante = new Estudiante(id, nombre, edad);
        estudiantes.add(estudiante);

        System.out.println("Estudiante Registrado con éxito.");

    }

    public static void listarEstudiante() { //<--esto lo que hace es recorrer la lista de los estudiantes para mostrar sus datos
        if (estudiantes.isEmpty()) { //<--en caso de que esté vació
            System.out.println("No hay estudiantes registrados aún.");
            return;
        }

        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public static void buscarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el ID del estudiante a buscar:");
        int id = sc.nextInt();

        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                System.out.println("Estudiante encontrado:");
                System.out.println(e);
                return;
            }
        }

        System.out.println("No se encontró un estudiante con esa identificación.");
    }

    public static void eliminarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el ID del estudiante a eliminar:");
        int id = sc.nextInt();

        for (Estudiante e : estudiantes) {
            if (e.getId() == id) { //<--si encuentra la id
                estudiantes.remove(e); //<--la borra
                System.out.println("Estudiante eliminado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró un estudiante con ese ID."); //<--si no encuentra la id
    }

    public static void actualizarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el ID del estudiante a actualizar:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getId() == id) { //<--si lo encuentra entonces si se puede hacer el cambio de la información

                System.out.println("Estudiante encontrado:");
                System.out.println(e);

                System.out.println("Digite el nuevo nombre:");
                String nuevoNombre = sc.nextLine();

                System.out.println("Digite la nueva edad:");
                int nuevaEdad = sc.nextInt();

                e.setNombre(nuevoNombre);
                e.setEdad(nuevaEdad);

                System.out.println("La información ha sido actualizada correctamente.");
                return;
            }

            System.out.println("No se encontró un estudiante con ese ID.");  //<--si no encuentra entonces esa Id
        }
    }

}
