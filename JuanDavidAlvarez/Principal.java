import java.util.Scanner; 
public class Principal{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in); 
        String nombre; 
        int cantPre; int DIMF = 5; // libros
        String ISBN;
        String nombreLibro;
        int cantPag;
        double precio;
        String fecha;
        String genero;
        boolean deBolsillo; String tipo, tipoLibro; 
        
        System.out.print("Nombre: ");
        nombre = in.next(); 
        System.out.print("Cantidad de premios: ");
        cantPre = in.nextInt(); 
        Editorial e = new Editorial(nombre,cantPre,DIMF); 
        for (int i=0; i<DIMF; i++){
            System.out.print("Nombre del libro: ");
            nombreLibro = in.next(); 
            System.out.print("ISBN: ");
            ISBN = in.next(); 
            System.out.print("paginas: ");
            cantPag = in.nextInt();
            System.out.print("precio: ");
            precio = in.nextDouble(); 
            System.out.print("fecha(DD/MM/AAAA): ");
            fecha = in.next(); 
            System.out.print("El libro es (Literatura/divulgatico)");
            tipoLibro = in.next(); 
            if (tipoLibro.equals("Literatura")){
                System.out.print("Genero: ");
                genero = in.next(); 
                System.out.print("Bolsillo (true o false): ");
                deBolsillo = in.nextBoolean(); 
                Autor autor = leerAutor(in); 
                Libro l= new Literatura(ISBN,nombre,cantPag,precio,fecha,autor,genero,deBolsillo); 
                e.agregarLibro(l); 
            }
            else {
                if (tipoLibro.equals("Divulgativo")){
                    System.out.print("Tipo cientifico o bibliografia");
                    tipo = in.next();
                    Autor autor = leerAutor(in); 
                    Libro l = new Divulgativo(ISBN,nombre,cantPag,precio,fecha,autor,tipo);
                    e.agregarLibro(l); 
                }
            }
        }
        in.close(); 
        
    }
    
    
    private static Autor leerAutor(Scanner in){
        String nombre, apellido, nacionalidad; 
        int DNI; 
        System.out.print("Nombre: ");
        nombre = in.next(); 
        System.out.print("Apellido: ");
        apellido = in.next(); 
        System.out.print("Nacionalidad: ");
        nacionalidad = in.next(); 
        System.out.print("Numero de dni: ");
        DNI = in.nextInt(); 
        
        return new Autor(DNI,nombre,apellido,nacionalidad); 
    }
    
    private static void imprimirListado(Editorial e){
        System.out.println("Lista de todos los solicitantes");
        for (int i=0; i<DIMF; i++){
            System.out.println(vec[i]); 
        }
    }
}
