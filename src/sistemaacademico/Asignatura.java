package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

class Asignatura {

    ArrayList<Asignatura> asignaturas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private int creditos;
    private String docentes;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, int creditos, String docentes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docentes = docentes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocentes() {
        return docentes;
    }

    public void setDocentes(String docentes) {
        this.docentes = docentes;
    }

    public void registrarasignatura() {

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

    public void listarAsignaturas() {

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }

        System.out.println("\n--- LISTA DE ASIGNATURAS ---");

        for (Asignatura a : asignaturas) {
            System.out.println(
                    "Codigo: " + a.getCodigo()
                    + " | Nombre: " + a.getNombre()
                    + " | Creditos: " + a.getCreditos()
                    + " | Docente: " + a.getDocentes()
            );
        }
    }

    public void buscarAsignatura() {

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

    public void actualizarAsignatura() {

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
    
}
