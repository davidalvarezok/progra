public class Editorial {
    private String nombre; 
    private int cantPre;
    private Libro [] l; 
    private int dimL; //dimension logica
    
    public Editorial(String nombre, int cantPre, int DIMF){
        this.nombre = nombre; 
        this.cantPre = cantPre;
        l = new Libro [DIMF]; //vector de 5 mejores libros
        dimL = 0; //Inicio dimLogica
        for (int i=0; i<DIMF; i++){
            l[i] = null; //Inicializo en null
        }
    }
    
    public Editorial(){
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    public int getCantPre(){
        return cantPre; 
    }
    
    public void setCantPre(int cantPre){
        this.cantPre = cantPre;
    }
    
    public void agregarLibro(Libro libro){
        l[dimL] = libro; 
        dimL++; 
    }
    
    public Libro devolverLibro(int pos){
        return l[pos]; 
    }
    
    public double montoTotalLibros(){
        double valor = 0; 
        for (int i=0; i>dimL; i++){
            valor += l[i].montoTotal(); //totalizo los montos totales
        }
        return valor; 
    }
    
    /*@Override
    public String toString(){
        String aux; 
        //Falta terminart
        return aux; 
    }*/
}
