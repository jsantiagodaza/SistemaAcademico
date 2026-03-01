

package sistemaacademico;


public class Estudiante {
    
    private int id; //<--mantengamos las mismas varibales
    private String nombre;
    private String apellido;
    private int edad;


    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
  
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
  public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    //setters necesarios para actualizar estudiante, dev1 verificalos y desarrolla esta clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


     @Override
   public String toString(){
     
       return "Estudiante{"+
               "ID:" + id +
               ", Nombre:" + nombre + "\n " +
               ", Apellido: " + apellido + "\n " + 
               ", Edad: " + edad+"\n-------------";
       
   }
    
}

