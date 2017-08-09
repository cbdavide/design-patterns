package modelo;
/**
 *
 * @author Andres Angarita <andres.angarita96@gmail.com>
 */
public abstract class Animal {
    private String nombre;
    
    public abstract void emitirSonido();
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
