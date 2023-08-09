public class Divulgativo extends Libro {
    private String tipo;
    
    public Divulgativo(String ISBN, String nombre, int cantPag, double precio,
    String fecha, Autor autor, String tipo) {
        super(ISBN,nombre,cantPag,precio,fecha,autor); //Clase padre
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double montoTotal(){
        double valor = 0; String fecha1, fecha2; 
        fecha1 = "15/03/2020"; fecha2 = "15/12/2022"; 
        if ((getFecha().compareTo(fecha1) > 0) && (getFecha().compareTo(fecha2) < 0)){
            valor = (double)0.065*getPrecio(); //-6,5% respecto del precio original
            if (tipo.equals("Cientifico") && getAutor().getNacionalidad().equals("Argentino")){
                valor = 0.1*valor; //Acumulativo
            }
        }
        return valor; 
    }
    
    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo;
    }
}

