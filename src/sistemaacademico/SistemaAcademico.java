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
            limpiarLaConsola(); //<--para que de ese aspecto mas pulcro 
            System.out.println("\n|         SISTEMA ACADÉMICO        |");
            System.out.println("|   1 --> Gestión de Estudiantes ");
            System.out.println("|   2 --> Gestión de Asignaturas ");
            System.out.println("|   3--> Gestión de Notas ");
            System.out.println("|   0 --> Salir del sistema");
            System.out.print("|  Seleccione una opción: ");
            opcionPrincipal = sc.nextInt();
            System.out.println("|-----------------------------------|");
            switch (opcionPrincipal) {
                case 1:
                    menuEstudiantes();
                    break;

                case 2:
                    menuAsignaturas();
                    break;
                case 3:
                    menuNotas();
                    break;

                case 0:
                    limpiarLaConsola();
                    System.out.println("Ha finalizado correctamente, gracias por confiar en los Falcons :)");
                    break;

                default:
                    System.out.println("esa opción no está dentro del menú, ingrese una opción valida.");
            }

        } while (opcionPrincipal != 0);

    }

    public static void menuNotas() {
        int opcion;
        do {
            limpiarLaConsola();
            System.out.println("\n|          GESTIÓN DE NOTAS         |");
            System.out.println("| 1 --> Registrar Nota          |");
            System.out.println("| 2 --> Listar Todas las Notas      |");
            System.out.println("| 3 --> Buscar Nota por Periodo     |");
            System.out.println("| 4 --> Actualizar Nota             |");
            System.out.println("| 5 --> Eliminar Nota               |");
            System.out.println("| 0 --> Volver                      |");
            System.out.print("| Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarNota();
                    break;
                case 2:
                    listarNotas();
                    break;
                case 3:
                    System.out.print("Periodo a buscar: ");
                    buscarNota(sc.nextLine());
                    break;
                case 4:
                    actualizarNota();
                    break;
                case 5:
                    eliminarNota();
                    break;
            }
        } while (opcion != 0);
    }

    public static void menuAsignaturas() {

        int opcion;
        limpiarLaConsola(); //<--para que de ese aspecto mas pulcro 
        do {
            System.out.println("\n|         OPCIONES DE ASIGNATURA   |");
            System.out.println("| 1 --> Registrar");
            System.out.println("| 2 --> Listar");
            System.out.println(" |3 --> Buscar");
            System.out.println("| 4 --> Actualizar");
            System.out.println("| 5 --> Eliminar");
            System.out.println("| 0 --> Volver");
            System.out.print("| Seleccione una opción: ");
            opcion = sc.nextInt();
            System.out.println("|-----------------------------------|");
            switch (opcion) {
                case 1:
                    registrarAsignatura();
                    break;
                case 2:
                    listarAsignatura();
                    break;
                case 3:
                    buscarAsignatura();
                    break;
                case 4:
                    actualizarAsignatura();
                    break;
                case 5:
                    eliminarAsignatura();
                    break;
            }

        } while (opcion != 0);
    }

    public static void menuEstudiantes() {

        int opcion;

        do {
            System.out.println("\n|         OPCIONES DE ESTUDIANTES   |");
            System.out.println("| 1 --> Registrar");
            System.out.println("| 2 --> Listar");
            System.out.println("| 3 --> Buscar");
            System.out.println("| 4 --> Actualizar");
            System.out.println("| 5 --> Eliminar");
            System.out.println("| 0 --> Volver");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            System.out.println("|-----------------------------------|");
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

        System.out.println("Digite el Apellido:");
        String apellido = sc.nextLine();

        System.out.println("Digite la edad:");
        int edad = sc.nextInt();

        Estudiante estudiante = new Estudiante(id, nombre, apellido, edad);
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

                System.out.println("Digite el nuevo apellido:");
                String nuevoApellido = sc.nextLine();

                System.out.println("Digite la nueva edad:");
                int nuevaEdad = sc.nextInt();

                e.setNombre(nuevoNombre);
                e.setApellido(nuevoApellido);
                e.setEdad(nuevaEdad);
                System.out.println("La información ha sido actualizada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un estudiante con ese ID.");  //<--si no encuentra entonces esa Id
    }

    public static void limpiarLaConsola() { //<--como tal no limpia la consola, mueve el texto, o mas bien lo empuja.
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public static void registrarAsignatura() {
        sc.nextLine();
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        // Verificar que no exista el codigo
        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Ya existe una asignatura con ese codigo.");
                return;
            }
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Creditos: ");
        int creditos = sc.nextInt();
        sc.nextLine(); // limpiar salto

        System.out.print("Docente: ");
        String docentes = sc.nextLine();

        Asignatura nueva = new Asignatura(codigo, nombre, creditos, docentes);
        asignaturas.add(nueva);

        System.out.println("Asignatura registrada correctamente.");
    }

    public static void listarAsignatura() {

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }

        System.out.println("\n|           LISTA DE ASIGNATURAS                    |");

        for (Asignatura a : asignaturas) {
            System.out.println(
                    "Codigo: " + a.getCodigo()
                    + " | Nombre: " + a.getNombre()
                    + " | Creditos: " + a.getCreditos()
                    + " | Docente: " + a.getDocentes()
            );
        }
    }

    public static void buscarAsignatura() {

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }

        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese el codigo de la asignatura a buscar: ");
        String codigo = sc.nextLine();

        for (Asignatura a : asignaturas) {

            if (a.getCodigo().equalsIgnoreCase(codigo)) {

                System.out.println("Asignatura encontrada:");
                System.out.println(
                        "Codigo: " + a.getCodigo()
                        + " | Nombre: " + a.getNombre()
                        + " | Creditos: " + a.getCreditos()
                        + " | Docente: " + a.getDocentes()
                );
                return;
            }
        }

        System.out.println("Asignatura no encontrada.");
    }

    public static void actualizarAsignatura() {

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }

        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese el codigo de la asignatura a actualizar: ");
        String codigo = sc.nextLine();

        for (Asignatura a : asignaturas) {

            if (a.getCodigo().equalsIgnoreCase(codigo)) {

                System.out.print("Nuevo nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Nuevos creditos: ");
                int creditos = sc.nextInt();
                sc.nextLine();

                System.out.print("Nuevo docente: ");
                String docente = sc.nextLine();

                a.setNombre(nombre);
                a.setCreditos(creditos);
                a.setDocentes(docente);

                System.out.println("Asignatura actualizada correctamente.");
                return;
            }
        }

        System.out.println("Asignatura no encontrada.");
    }

    public static void eliminarAsignatura() {

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }

        sc.nextLine();
        System.out.print("Ingrese el codigo de la asignatura a eliminar: ");
        String codigo = sc.nextLine();

        for (int i = 0; i < asignaturas.size(); i++) {

            if (asignaturas.get(i).getCodigo().equalsIgnoreCase(codigo)) {

                asignaturas.remove(i);
                System.out.println("Asignatura eliminada correctamente.");
                return;
            }
        }

        System.out.println("Asignatura no encontrada.");
    }

    public static void registrarNota() {
        if (estudiantes.isEmpty() || asignaturas.isEmpty()) {
            System.out.println("Debe haber estudiantes y asignaturas registrados primero.");
            return;
        }
        System.out.print("ID del Estudiante: ");
        int idEst = sc.nextInt();
        Estudiante est = null;
        for (Estudiante e : estudiantes) {
            if (e.getId() == idEst) {
                est = e;
            }
        }

        sc.nextLine();
        System.out.print("Código Asignatura: ");
        String codAsig = sc.nextLine();
        Asignatura asig = null;
        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codAsig)) {
                asig = a;
            }
        }

        if (est != null && asig != null) {
            System.out.print("Periodo: ");
            String per = sc.nextLine();
            System.out.print("Valor (0-5): ");
            double val = sc.nextDouble();
            notas.add(new Nota(per, val, est, asig));
            System.out.println("Nota registrada.");
        } else {
            System.out.println("Estudiante o Asignatura no encontrados.");
        }
    }

    public static void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas.");
        }
        for (Nota n : notas) {
            System.out.println(n);
        }
    }

    public static void buscarNota(String periodo) {
        for (Nota n : notas) {
            if (n.getperiodo().equalsIgnoreCase(periodo)) {
                System.out.println(n);
                return;
            }
        }
        System.out.println("No encontrada.");
    }

    public static void actualizarNota() {
    System.out.print("Periodo de la nota: ");
    String per = sc.nextLine();

    // Listar todas las notas que coincidan con ese periodo
    ArrayList<Nota> encontradas = new ArrayList<>();
    for (Nota n : notas) {
        if (n.getperiodo().equalsIgnoreCase(per)) {
            encontradas.add(n);
        }
    }

    if (encontradas.isEmpty()) {
        System.out.println("No se encontró ninguna nota con ese periodo.");
        return;
    }

    // Mostrar las notas encontradas numeradas
    System.out.println("Notas encontradas con ese periodo:");
    for (int i = 0; i < encontradas.size(); i++) {
        System.out.println((i + 1) + ") " + encontradas.get(i));
    }

    // Pedir al usuario que elija cuál actualizar
    System.out.print("¿Cuál desea actualizar? (número): ");
    int eleccion = sc.nextInt();
    sc.nextLine();

    if (eleccion < 1 || eleccion > encontradas.size()) {
        System.out.println("Opción inválida.");
        return;
    }

    System.out.print("Nuevo valor (0.0 - 5.0): ");
    double nuevoValor = sc.nextDouble();
    sc.nextLine();

    encontradas.get(eleccion - 1).setValor(nuevoValor);
    System.out.println("Nota actualizada correctamente.");
}

    public static void eliminarNota() {
      System.out.print("Periodo a eliminar: ");
    String per = sc.nextLine();

    // Listar todas las notas que coincidan
    ArrayList<Nota> encontradas = new ArrayList<>();
    for (Nota n : notas) {
        if (n.getperiodo().equalsIgnoreCase(per)) {
            encontradas.add(n);
        }
    }

    if (encontradas.isEmpty()) {
        System.out.println("No se encontró ninguna nota con ese periodo.");
        return;
    }

    // Mostrar las notas encontradas numeradas
    System.out.println("Notas encontradas con ese periodo:");
    for (int i = 0; i < encontradas.size(); i++) {
        System.out.println((i + 1) + ") " + encontradas.get(i));
    }

    // Pedir al usuario que elija cuál eliminar
    System.out.print("¿Cuál desea eliminar? (número): ");
    int eleccion = sc.nextInt();
    sc.nextLine();

    if (eleccion < 1 || eleccion > encontradas.size()) {
        System.out.println("Opción inválida.");
        return;
    }

    notas.remove(encontradas.get(eleccion - 1));
    System.out.println("Nota eliminada correctamente.");

    }
}
