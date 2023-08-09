public class Literatura extends Libro {
    private String genero;
    private boolean deBolsillo;
    
    public Literatura(String ISBN, String nombre, int cantPag, double precio,
    String fecha, Autor autor, String genero, boolean deBolsillo) {
        super(ISBN,nombre,cantPag,precio,fecha,autor); //mando a la clase padre
        this.genero = genero;
        this.deBolsillo = deBolsillo;
    }
    
    public Literatura(){
        
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public boolean getDeBolsillo() {
        return deBolsillo;
    }
    
    public void setDeBolsillo(boolean deBolsillo) {
        this.deBolsillo = deBolsillo;
    }
    
    public double montoTotal(){
        double valor = 0; 
        if (getDeBolsillo() == true){
            valor = 1.5*getPrecio(); 
            if (getGenero().equals("cuento") || getGenero().equals("novela")){
                valor = 0.05*valor;
            }
        }
        return valor; 
    }
    
    @Override
    public String toString() {
        return super.toString() + " Género: " + genero + ", De bolsillo: " + deBolsillo;
    }
}

