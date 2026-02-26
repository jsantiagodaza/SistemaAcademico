
package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {

  
    public static void main(String[] args) { 
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Nota> notas = new ArrayList<>();
        
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("_______________________________");
            System.out.println("|            SISTEMA ACADEMICO             |");
            System.out.println("_______________________________");

            System.out.println("|1 --> Registrar Estudiante");
            System.out.println("|2 --> Listar Estudiantes");
            System.out.println("|3 --> Buscar Estudiante");
            System.out.println("|4 --> Actualizar Estudiante");
            System.out.println("|5 --> Eliminar Estudiante");
            System.out.println("|6 --> Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
    }
    


