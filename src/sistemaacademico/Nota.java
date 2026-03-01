
package sistemaacademico;

import java.util.ArrayList;
import  sistemaacademico.Estudiante;
import sistemaacademico.Asignatura;

public class Nota {
    
     private String periodo;
    private double valor;
    private Estudiante estudiante;
    private Asignatura asignatura;

    private static ArrayList<Nota> listaNotas = new ArrayList<>();

    public Nota(String  periodo, double valor, Estudiante estudiante, Asignatura asignatura) {
        this. periodo =  periodo;
        this.valor = valor;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }
    // ====== GETTERS Y SETTERS ======
    public String getperiodo() {
        return periodo;
    }

    public void setperiodo(String periodo) {
        this.periodo = periodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }
 
    public static boolean registrarNota(Nota n) {

    if (n == null) {
        System.out.println("Error: la nota es null");
        return false;
    }
    if (n.getValor() < 0 || n.getValor() > 5) {
        System.out.println("Error: la nota debe estar entre 0 y 5");
        return false;
    }
    listaNotas.add(n);
    return true;
}
    
    public static String listarNotas() {
        if (listaNotas.isEmpty()) {
            return "No hay notas registradas";
        }

        String salida = "LISTA DE NOTAS\n";
        for (Nota n : listaNotas) {
            salida += n + "\n";
        }
        return salida;
    }
    
    public static Nota buscarNota(String periodo) {
        for (Nota n : listaNotas) {
            if (n.periodo.equalsIgnoreCase(periodo)) {
                return n;
            }
        }
        return null;
    }
    
     public static boolean actualizarNota(String periodo, double nuevoValor) {
        Nota n = buscarNota(periodo);
        if (n != null) {
            n.setValor(nuevoValor);
            return true;
        }
        return false;
    }
     
     public static boolean eliminarNota(String periodo) {
        Nota n = buscarNota(periodo);
        if (n != null) {
            listaNotas.remove(n);
            return true;
        }
        return false;
    }
}


