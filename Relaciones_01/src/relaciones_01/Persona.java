/*

 */
package relaciones_01;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
   

    @Override
    public String toString() {
        return "PERSONA: " + nombre + " "+ apellido + ", Edad: " + edad + ", DNI: " + dni + "\n PERRO: " + perro;
    }
    
    
}
