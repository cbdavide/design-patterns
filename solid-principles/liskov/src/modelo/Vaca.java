
package modelo;

/**
 *
 * @author Andres Angarita <andres.angarita96@gmail.com>
 */
public class Vaca extends Animal{
    
    
    @Override
    public void emitirSonido() {
        System.out.println("muuuuuuu");  
    }
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
}
