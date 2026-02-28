package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {

    static ArrayList<Asignatura> asignaturas = new ArrayList<>(); //<--el arrayList para Asignatura
    static ArrayList<Estudiante> estudiantes = new ArrayList<>(); //<--el arrayList para Estudiante
    static ArrayList<Nota> notas = new ArrayList<>(); //<--el arrayList para la Nota

    public static void main(String[] args) {
        mostrarMenu(); //<--el main solo muestra el menú
    }

    //De aquí en adelante son las funciones y Metodos que muestra el main Por si quieren entenderlo mejor
    public static void mostrarMenu() { //<--Con esto, el main ejecuta el menú principal
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("_______________________________");
            System.out.println("|             SISTEMA ACADEMICO            |");
            System.out.println("_______________________________");
            System.out.println("|1 --> Registro de Estudiante");
            System.out.println("|2 --> Listar Estudiantes");
            System.out.println("|3 --> Buscar Estudiante");
            System.out.println("|4 --> Actualizar a un Estudiante");
            System.out.println("|5 --> Eliminar a un Estudiante");
            System.out.println("|6 --> Salir del sistema");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

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

                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
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
