public abstract class Libro {
    private String ISBN;
    private String nombre;
    private int cantPag;
    private double precio;
    private String fecha; 
    private Autor autor;
    
    public Libro(String ISBN, String nombre, int cantPag, double precio, 
    String fecha, Autor autor) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.cantPag = cantPag;
        this.precio = precio;
        this.fecha = fecha; 
        this.autor = autor;
    }
    
    public Libro(){
        
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCantPag() {
        return cantPag;
    }
    
    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getFecha(){
        return fecha; 
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha; 
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public abstract double montoTotal(); 
    
    @Override
    public String toString() {
        return "Libro ISBN: " + ISBN + ", Nombre: " + nombre + ", Cantidad de páginas: " + cantPag +
                ", Precio: " + precio + ", Autor: " + autor.toString();
    }
}
