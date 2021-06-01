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
        archivo.escribir("./nuevo_archivo.txt","Hola mundo!", false);
        
        String contenido = archivo.leer();
        System.out.println(contenido);
        
        Persona persona_uno = new Persona();
        persona_uno.setNombre("Alberto");
        persona_uno.setTelefono("2462094343");
        
        archivo.escribirObjeto(persona_uno, "./persona.data");
        Persona persona_lectura = new Persona();
        persona_lectura = archivo.leerObjeto("./persona.data");
        System.out.println(persona_lectura.getNombre());
        System.out.println(persona_lectura.getTelefono());
    }
    
}
