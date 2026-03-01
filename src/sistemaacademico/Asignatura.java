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

    //usaré tus metodos en el menu
}
