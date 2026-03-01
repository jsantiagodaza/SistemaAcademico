
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
 
}


