public class Autor {
    private int DNI;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    
    public Autor(int DNI, String nombre, String apellido, String nacionalidad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }
    
    public Autor (){
        
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
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
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString() {
        return "Autor: DNI: " + DNI + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Nacionalidad: " + nacionalidad;
    }
}

