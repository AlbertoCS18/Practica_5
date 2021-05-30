package practica_5;
/**
 *
 * @author Alberto Corona
 */
public class Practica_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo archivo = new Archivo("./nuevo_archivo.txt");
        String contenido = archivo.leer();
        System.out.println(contenido);
    }
    
}
