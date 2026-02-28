package sistemaacademico;
//todo esto es base para poder probar un metodo, Xavi haz la clase correctamente, -santiago
//pendiente y a la espera del Dev1, 
public class Estudiante {
    private int id;
    private String nombre;
    private int edad;

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    //getters que necesito para trabajar la crud 
     public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //setters necesarios para actualizar estudiante, dev1 verificalos y desarrolla esta clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //override para impresión clara

    @Override
    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Edad: " + edad;
    }
}

