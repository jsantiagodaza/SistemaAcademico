package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {

    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
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
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6); 
    }

    public static void registrarEstudiante() {
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
}